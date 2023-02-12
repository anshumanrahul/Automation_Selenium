package superKeyword;

public class Class_B_Super_Keyword extends Class_A_Super_Keyword{
	
	int num1=200;
	
	public void dothis()
	{
		System.out.println("DO this from B");
	}
	public void XYZ()
	{
		System.out.println(super.num1);   // When a method or a field we have call from the Superclass then we use super keyword.
		super.dothis();
		System.out.println("XYZ executed");
	}

}
