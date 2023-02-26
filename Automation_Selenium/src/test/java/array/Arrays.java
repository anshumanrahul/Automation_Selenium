package array;

public class Arrays {

	public static void main(String[] args) {
		String [] DaysofWeek= {"Mon", "Tue","Wed","Thurs","Friday","Sat","Sun"};
		
		System.out.println(DaysofWeek.length);
		System.out.println(DaysofWeek[2]);
		DaysofWeek[2]="RRR";
		System.out.println(DaysofWeek[2]);
		
		for(int i=0;i<=DaysofWeek.length-1;i++)
		{
		System.out.println(DaysofWeek[i]);	
		}

	}

}
