package inheritance_Abstraction_Polymorphism;

public class PolyMain {

	public static void main(String[] args) {
		Triangle_Inheritance t1 = new Triangle_Inheritance();
		t1.setBaseandHeight(10.0, 20.98);
		Ractangle_Inheritance R1 = new Ractangle_Inheritance();
		R1.setBaseandHeight(15.0, 20.0);
		
		t1.calculateArea();
		R1.calculateArea();

	}

}
