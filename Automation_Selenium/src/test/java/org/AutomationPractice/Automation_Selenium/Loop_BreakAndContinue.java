package org.AutomationPractice.Automation_Selenium;

public class Loop_BreakAndContinue {

	public static void main(String[] args) {
		int a=100;
		while(a>50)
		{
			a-=5;
			if(a==75)
			{
				continue;
			}
			System.out.println(a);
		}

	}

}
