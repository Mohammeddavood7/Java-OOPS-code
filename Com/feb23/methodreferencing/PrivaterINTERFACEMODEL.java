package Com.feb23.methodreferencing;

public interface PrivaterINTERFACEMODEL
{
	void show();
	
	static void m1()
	{
		System.out.println("interface static method m1 invoked");
		m3();
		
	}
	
	default void m2()
	{
		System.out.println("interface default method  m2 invoked");
		m3();
		this.m4();
	}
	
	private static void m3()
	{
		System.out.println("interface private static method m3 invoked");
	}
	
	private void m4()
	{
		System.out.println("interface private non-static method m4 invoked ");
	}	
	
}
