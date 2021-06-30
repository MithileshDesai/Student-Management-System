package StudentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp
{
	public static void main(String[] args) 
	{
		//how many student want to add
		System.out.println("enter the number of student to enroll:");
		Scanner sc=new Scanner(System.in);
		int numofstudent=sc.nextInt();
		Student1[] students= new Student1[numofstudent];
		
		//create n number new students
		for (int i = 0; i < numofstudent; i++) 
		{
			students[i] =new Student1();
			students[i] .enroll();
			students[i] .paytution();
		}
		for (int i = 0; i < numofstudent; i++) 
		{
			System.out.println(students[i].showinfo());	
		}
		
	}

}
