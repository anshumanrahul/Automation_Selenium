package stringOperations;

public class ProgramtoReverseTheString {

	public static void main(String[] args) {
		// Reverse String Program
		
		String str1="ABCDE";
		String str2="";
		
		for(int i=0;i<=str1.length()-1;i++)
		{
			str2=str1.charAt(i)+str2;
		}
		
		System.out.println(str2);

	}

}
