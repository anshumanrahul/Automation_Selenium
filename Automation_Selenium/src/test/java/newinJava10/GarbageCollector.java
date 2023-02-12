package newinJava10;

public class GarbageCollector {

	public static void main(String[] args) {
		String str1="AEZFDTFYFSJDHFJFKGLGL";
		
		for(int i=0;i<=str1.length()-1;i++)
		{
			String temp="ch"+i+":"+str1.charAt(i);
		}

	}

}
