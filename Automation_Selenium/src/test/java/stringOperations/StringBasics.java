package stringOperations;

public class StringBasics {

	public static void main(String[] args) {
		// Concatenate
		//length
		//trim
		//uppercase
		//lowercase
		//Empty
		
		String a="Rahul";
		String b="Anshuman";
		
		System.out.println("Concetinate a+b: " +a+" "+b);
		
		String Str4=a.concat(b);
		System.out.println(Str4);
		
		//if any of the side is String then + sign will act as concatination not addition.
		//Example:
		
		int num1=40;
		System.out.println(a+num1);
		
		//Note : Output will be Rahul40

	}

}
