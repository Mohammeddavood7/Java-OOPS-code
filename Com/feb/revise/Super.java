package Com.feb.revise;

@FunctionalInterface
interface Super     
{
	public abstract void show(); //public abstract
	 
	 
    //public void showing();
	
	//	 default void display()
	//	 {
	//		
	//		 System.out.println("display"); 
	//		 m1(); //non static method
	//		 m3(); //static method 
	//		 
	//	 }
	 
	 
	 private void m1()
	 {
		 Super.m3();
		 System.out.println("interface m1 non-static ");
	 }
	 
	 public static void m2() //default public
	 {
		 Super.m3();
		 System.out.println("interface m2 static");
	 }
	 
	 private static void m3()
	 {
		 System.out.println("interface m3 static method");
	 }
	
}










































