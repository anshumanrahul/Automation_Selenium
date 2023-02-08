package Oops_Concept;

public class BankAccount_Main {

	public static void main(String[] args) {
		BankAccount_ObjectandClassHandson b1=new BankAccount_ObjectandClassHandson(12345, "Rahul", 567854.77);
		b1.currentbalance();
		b1.withdraw(1000);
		b1.currentbalance();
		b1.deposit(200);
		b1.currentbalance();
		b1.deposit(-200000);
		b1.currentbalance();
	}

}
