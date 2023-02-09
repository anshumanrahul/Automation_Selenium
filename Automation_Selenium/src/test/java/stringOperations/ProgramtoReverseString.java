package stringOperations;

public class ProgramtoReverseString {

	public static void main(String[] args) {
		String s="Rahul";
		String revstring="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			revstring=revstring+s.charAt(i);
		}
		
		System.out.println("Original String: "+s);
		System.out.println("Reversed String: "+revstring);
		

	}

}
