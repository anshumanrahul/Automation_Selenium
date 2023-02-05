package stringOperations;

public class StringCompare {

	public static void main(String[] args) {
		String str1="ABCD";
		String str2="ABcd";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		if(str1.equals(str2))
		{
			System.out.println("str1 equaals to str2");
		}
		else {
			System.out.println("str1 not equaals to str2");
		}
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		
		String patt="[A-Z]{1,}";
		
		System.out.println(str1.matches(patt));

	}

}
