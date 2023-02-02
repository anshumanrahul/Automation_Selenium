package org.AutomationPractice.Automation_Selenium;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter Two Numbers");
		// nextDouble() reads the next double from the keyboard
		double firstnumber=reader.nextDouble();
		double SecondNumber=reader.nextDouble();
		System.out.print("Enter the Operator(+,-,*,/): ");
		char operator=reader.next().charAt(0);
		double result;
		switch(operator)
		{
		case '+':
			result=firstnumber+SecondNumber;
			break;
		
		case '-':
			result=firstnumber-SecondNumber;
			break;
		
		
		case '*':
			result=firstnumber*SecondNumber;
			break;
		
		case '/':
			result=firstnumber/SecondNumber;
			break;
			
			default:
				System.out.printf(" Error! Operator is not cprrect");
				return;
				
		}
		System.out.printf("%.1f+%.1f=%.1f", firstnumber,SecondNumber, result);
		

	}

}
