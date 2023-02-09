package stringOperations;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str1=s1.nextLine();
		System.out.println(str1);
		String temp="";
		
		for(int i=0;i<=str1.length()-1;i++)
		{
			temp=str1.charAt(i)+temp;
		}
		
		System.out.println("Original String: "+str1);
		System.out.println("Reversed String: "+temp);
		
	}

}
