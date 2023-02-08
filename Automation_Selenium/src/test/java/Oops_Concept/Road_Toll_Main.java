package Oops_Concept;

public class Road_Toll_Main {

	public static void main(String[] args) {
		Road_Toll_Contructor RT=new Road_Toll_Contructor();
		
		RT.Vehicle_Type="SEDAN";
		RT.NoOfTyres=4;
		RT.calculatetoll();
		
		Road_Toll_Contructor RT1=new Road_Toll_Contructor("SUV", 6);
		RT1.calculatetoll();

	}

}
