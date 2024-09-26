package Com.march9.TryResources;

public class ClassNotFoundExceptionDemo
{
    public ClassNotFoundExceptionDemo()
    {
    	Class<?> c;
    	try
    	{
    		c = Class.forName("Com.march9.TryResources.ClassNotFoundExceptionDemo");
    		System.out.println(c);
    		Class<?> cls = ClassNotFoundExceptionDemo.class;
    		System.out.println(cls);
    	}
    	catch(ClassNotFoundException e)
    	{
    		System.out.println("provided class is not available please check class name");
    	    e.printStackTrace();
    	}
    }
    
    public static void main(String[] args)
    {
    	 new ClassNotFoundExceptionDemo();
		
	}
}











































































