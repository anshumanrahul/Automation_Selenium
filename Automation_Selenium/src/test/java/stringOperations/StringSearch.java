package stringOperations;

public class StringSearch {

	public static void main(String[] args) {
		// contains
		//start with
		//end with
		//Index of
		//Last Index of
		
		String str1="This is Rahul Anshuman";
		String str2="Rahul";
		
		//Use of Contains
		
		System.out.println(str1.contains("h"));
		
		if(str1.contains("h"))
		{
		System.out.println("str1 contains h character");
		}
		else
		{
			System.out.println("str1 does not contains h character");
		}
		System.out.println(str1.contains(str2));
		
		//use of IndexOf
		
		System.out.println(str1.indexOf("h"));
		
		System.out.println(str1.indexOf("h", 9));
		
		//use of lastIndex of
		
		System.out.println(str1.lastIndexOf("h"));

	}

}
