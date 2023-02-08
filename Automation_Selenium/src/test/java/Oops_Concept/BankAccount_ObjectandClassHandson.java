package Oops_Concept;

public class BankAccount_ObjectandClassHandson {
	
	private long account_number;
	private String account_name;
	private double account_Balance;
	
public void deposit(double amt)
{
	if(amt>0)
	{
		account_Balance=account_Balance+amt;
		System.out.println("Successfully deposited $"+amt);
	}
	else {
		System.out.println(" Cannot deposite $"+amt);
	}
	
}
public void withdraw(double amt)
{if(amt>0)
{
	account_Balance=account_Balance-amt;
	System.out.println("Successfully withdraw $"+amt);
}
else {
	System.out.println(" Cannot withdraw $"+amt);
}
	
}
public void currentbalance() {
		
	System.out.println("Your current balance is $"+ account_Balance);

}

public BankAccount_ObjectandClassHandson(long account_number,String account_name, double account_Balance ){
	this.account_number=account_number;
	this.account_name=account_name;
	this.account_Balance=account_Balance;
}
}

