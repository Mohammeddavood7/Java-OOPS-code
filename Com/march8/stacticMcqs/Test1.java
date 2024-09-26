package Com.march8.stacticMcqs;

public class Test1 
	{
	
	 int a = 20;
	public static void main(String[] args) throws Exception 
		{
		  //System.out.println(a);
		  Test1 t = new Test1();
		  System.out.println(t.a);
		  
		    Object obj = Class.forName("Com.march8.stacticMcqs.Test1").newInstance();
	        System.out.println("Object is created: " + obj.getClass().getName());
	        Test1 t1 = (Test1)obj;
	        System.out.println(t1.a);
	           

		  
		  
		  
	
		  
		 // System.out.println(cls.a);
	    }
}
