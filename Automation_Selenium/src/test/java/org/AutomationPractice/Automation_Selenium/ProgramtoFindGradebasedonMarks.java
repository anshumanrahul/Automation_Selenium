package org.AutomationPractice.Automation_Selenium;

import java.util.Scanner;

public class ProgramtoFindGradebasedonMarks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Marks");
		int a=s.nextInt();
		
		if(a>=90)
		{
			System.out.println("A Grade");
		}
		else if (a>=75)
		{
			System.out.println("B Grade");
		}
		else if (a>=60)
		{
			System.out.println("C Grade");
		}
		else if(a>=40)
		{
			System.out.println("D Grade");
		}
		else if(a<40)
		{
			System.out.println("Fail");
		}

	}

}
