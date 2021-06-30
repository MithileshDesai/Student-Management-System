package StudentDatabase;
import java.util.Scanner;
public class Student1
{
	private String FirstName;
	private String LastName;
	private int GradYear;
	private String StudentID;
	private String courses="";
	private  int tutionBalance=0;
	private static int costofcourse=600;
	private static int id=1000;
	
	//constructor=asks user to enter the name and year 
	public Student1() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student FirstName:- ");
		this.FirstName= sc.nextLine();
		System.out.println("Enter Student LastName:- ");
		this.LastName= sc.nextLine();
		System.out.println(" 1-First year\n 2-Second year\n 3-Third year\n 4-Final year\n Enter the year of Student  ");
		this.GradYear= sc.nextInt();
		setStudentID();
	}
	//generate id
	private void setStudentID() 
	{
		//gradlevel+id
		id++;
		this.StudentID = GradYear +""+id; 
	}
	//enroll course
	public void enroll() 
	{
	//get inside the loop,where hits to 0
		do {
		System.out.print("Enroll to course(Q to quit):");
		Scanner sc = new Scanner(System.in);
		String courses =sc.nextLine();
		if (!courses.equals("Q"))
		{
			courses = courses + "\n  " + courses;
			tutionBalance = tutionBalance + costofcourse;
		}
		else
		{
		break;
		}
		}while(1!=0);
		}
	
	//view balance
   public void viewbalance() 
   {
	   System.out.println("your Balance is "+tutionBalance);
   }
	//pay tution
   public void paytution()
   {
	   viewbalance();
	   System.out.print("enter the your payment ");
	   Scanner sc=new Scanner(System.in);
	   int payment=sc.nextInt();
	   tutionBalance=tutionBalance-payment;
	   System.out.println("thank you for your payment of "+payment);
	   viewbalance();
   }
	// show status 
   public String showinfo() 
   {
	   return "Student Name:- "+FirstName+" "+ LastName +
			   "\nGradlevel:- " + GradYear +
			   "\ncourses enroll " + courses +
			   "\nStudentID "+StudentID+
	   		  "\nBalance :- "+tutionBalance;
	  
	   }
   }
