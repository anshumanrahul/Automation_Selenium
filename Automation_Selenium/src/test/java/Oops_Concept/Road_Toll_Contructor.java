package Oops_Concept;

public class Road_Toll_Contructor {

String Vehicle_Type;
int NoOfTyres;

public void calculatetoll()
{
	if(NoOfTyres==2)
	{
		System.out.println("Your Toll amount is 0");
	}
	else if(NoOfTyres==4)
	{
		System.out.println("Your toll amount is 10");
	}
	else if(NoOfTyres>4)
	{
		System.out.println("Your toll amount is 20");
	}
	else {
		System.out.println("Incorrect Type count");
	}
}
	public Road_Toll_Contructor()
	{
		System.out.println("Constructor is executed");
		
	}
	public Road_Toll_Contructor(String Vehicle_Type, int NoOfTyres)
	{
		this.Vehicle_Type=Vehicle_Type;
		this.NoOfTyres=NoOfTyres;
	}
}


