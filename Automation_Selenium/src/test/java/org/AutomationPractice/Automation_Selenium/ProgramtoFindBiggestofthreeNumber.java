package org.AutomationPractice.Automation_Selenium;

import java.util.Scanner;

public class ProgramtoFindBiggestofthreeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		System.out.println("Enter Third Number");
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("num1 is bigger: " +num1);
		}
		if(num2>num1 && num2>num3)
		{
			System.out.println("num2 is bigger: " +num2);
		}
		if(num3>num1 && num3>num1)
		{
			System.out.println("num3 is bigger: " +num3);
		}
	}

}
