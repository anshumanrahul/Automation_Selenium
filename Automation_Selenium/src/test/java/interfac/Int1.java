package interfac;

public interface Int1 {
	void doThis();
	
	static void xyz()
	{
		System.out.println(" This is Static method");
	}
	
	default void UVW()
	{
		System.out.println("This is Default method");
	}

}
