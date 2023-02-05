package stringOperations;

public class StringReplace {

	public static void main(String[] args) {
		// Replace  normal
		//ReplaceAll  regex
		
		String str1="abcde1234 gdtrhfu1234 jkjiuriu1234";
		String str2="1234";
		String str3="Rahul";
		
		System.out.println(str1.replace(str2,str3));
		
		
		String str4="adsd12345fsd%hj# dfshjsdhsjdh% sdshjdhkjkj* sdsds^";
		String patt="[^A-Za-z0-9\\s]";
		
		System.out.println(str4.replaceAll(patt,""));

	}

}
