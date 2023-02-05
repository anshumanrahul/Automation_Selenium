package Oops_Concept;

public class Method {

	public static void main(String[] args) {
		Method m = new Method();
		m.dothis();
		m.addition(100, 200);
		int x = m.multiply(10, 20);
		System.out.println("Multiplication of two numbers are: " +x);

	}

	public void dothis() {
		System.out.println("Do this Executed");
	}

	public void addition(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public int multiply(int num1, int num2) {
		int num3 = num1 * num2;
		return num3;
	}
}
