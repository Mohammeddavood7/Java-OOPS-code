package Com.march8.stacticMcqs;

class Test2 {
	static void m1() 
		{
		 System.out.println("Test8 : m1() called");
     	}

	public static void main(String[] args) throws Exception 
		{
		   Test2.m1();
		   Test2 t1 = new Test2();
		   t1.m1();
		   
		   Test2 obj = (Test2) Class.forName("Com.march8.stacticMcqs.Test2").newInstance();
	        //System.out.println("Object is created: " + obj.getClass().getName());
	       // Test2 test = (Test2)obj;
	        obj.m1();


	   }
}