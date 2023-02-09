package special_Classes;

public class StringBuilder_Method {

	public static void main(String[] args) {
		StringBuilder sb2=new StringBuilder("Learning is fun");
		sb2.insert(9, "Java ");
		
		System.out.println(sb2);
		
		sb2.replace(9, 13, "everything");
		System.out.println(sb2);
		
		sb2.delete(9, 12);
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
	

	}

}
