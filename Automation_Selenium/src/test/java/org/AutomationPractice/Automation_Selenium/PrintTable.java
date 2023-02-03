package org.AutomationPractice.Automation_Selenium;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a=s.nextInt();
		for(int i=a; i<=a*10; i+=a)
		{
System.out.println(i);
	}

}
}
