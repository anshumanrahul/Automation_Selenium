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
		
		
		//Finding Length of String
		
		String Str5= "Arsh Anshuman";
		System.out.println(Str5.length());
		
		
		//use of .trim operation to remove unwanted spaces from start of the string and end of the string
		
		String str6="        dfdfdfdf    sTTTTEEEEJJJd  dh tryrtrt      ";
		System.out.println(str6.trim());
		
		
		//Convert String to uppercase
		
		System.out.println(str6.toUpperCase());
		
		//Convert String to Lowercase
		
		System.out.println(str6.toLowerCase());
		
		//Verify the string is empty
		
		String str7="";
		System.out.println(str7.isEmpty());
		

	}

}
