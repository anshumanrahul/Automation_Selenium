package org.AutomationPractice.Automation_Selenium;

public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println(i +"," + j);
			}
			System.out.println("All the iteration of J is done");
		}

	}

}
