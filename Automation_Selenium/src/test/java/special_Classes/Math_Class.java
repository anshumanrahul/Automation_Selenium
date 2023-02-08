package special_Classes;

public class Math_Class {

	public static void main(String[] args) {
		int num1=100;
		int num2=200;
		
		System.out.println(Math.min(num1, num2));
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.sqrt(num2));
		System.out.println(Math.cbrt(300));
		
		double x=23.56;
		double y=58.28;
		
		System.out.println(Math.ceil(x));
		System.out.println(Math.ceil(y));
		System.out.println(Math.floor(x));
		System.out.println(Math.floor(y));
		
		System.out.println(Math.round(x));
		System.out.println(Math.round(y));
		
		System.out.println("********************************************************");
		System.out.println(Math.random());
	}

}
