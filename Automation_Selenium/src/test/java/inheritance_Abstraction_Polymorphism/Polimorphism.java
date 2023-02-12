package inheritance_Abstraction_Polymorphism;

public class Polimorphism {
	public static void main(String[] args) {
	
	//Polymorphism is the ability of an object to get multiple forms.  Poly- Many   Morphism- forms
		
		// In Java we can declare an object with the parent and we can call the constructor of child to instantiate.
	AnimalClass_Method_Overriding a;
	a=new AnimalClass_Method_Overriding();
	a.WhoIAm();
	a=new Dog_MethodOverriding();
	a.WhoIAm();
	a=new Cat_MethodOverriding();
	a.WhoIAm();

}
}