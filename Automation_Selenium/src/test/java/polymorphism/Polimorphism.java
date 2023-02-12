package polymorphism;

import methodOverriding.AnimalClass_Method_Overriding;
import methodOverriding.Cat_MethodOverriding;
import methodOverriding.Dog_MethodOverriding;

public class Polimorphism {
	public static void main(String[] args) {
	
	//Polymorphism is the ability of an object to get multiple forms.  Poly- Many   Morphism- forms
		
		// In Java we can declare an object with the parent and we can call the constructor of child to instantiate.
	AnimalClass_Method_Overriding a;
	a=new AnimalClass_Method_Overriding();
	a.WhoIAm();
	a=new Dog_MethodOverriding();    // Here as soon as we call the constructor of the dog to Instantiate a again it take the form of DOG.
	a.WhoIAm();
	a=new Cat_MethodOverriding();    // Here as soon as we call the constructor of the Cat to Instantiate a again it change the form of CAT.
	a.WhoIAm();

}
}