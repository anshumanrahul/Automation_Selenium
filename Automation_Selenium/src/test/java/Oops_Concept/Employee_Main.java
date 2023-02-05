package Oops_Concept;

public class Employee_Main {

	public static void main(String[] args) {
		EmployeeClass ec=new EmployeeClass();
		ec.EmployeeName="Arsh";
		ec.EmployeeID="007";
		ec.EmployeeSalry=40000;
		
		ec.displayEmployeeBonus();
		System.out.println("*******************************************");
		
		EmployeeClass ec1=new EmployeeClass();
		ec1.EmployeeName="Shilpa";
		ec1.EmployeeID="008";
		ec1.EmployeeSalry=60000;
		
		ec1.displayEmployeeBonus();

	}

}
