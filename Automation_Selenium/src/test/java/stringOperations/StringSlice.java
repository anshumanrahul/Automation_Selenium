package stringOperations;

public class StringSlice {

	public static void main(String[] args) {
		// Chat at
		//Substring
		//Split
		
		String str1="ABCDEF";
		
		System.out.println(str1.charAt(4));
		
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(2,4));

		String str2="A_B_C_D_E_F";
		String str3="_";
		
		String[] arr=str2.split(str3);
		for(String x:arr)
		{
			System.out.println(x);
		}
		
	}

}
