package Com.feb29.forName.newInstancess;


class Alpha
{
	static int a = 100;
	
	static 
	{
		System.out.println("Alpha static method: "+a);
	}
	public  void show()
	{
		System.out.println("Alpha class");
	}
	
}

public class ForName1
{
	public static void main(String[] args) throws Exception 
	{
	  Class cls = Class.forName("Com.feb29.forName.newInstancess.Alpha");
	   System.out.println(cls);
	 // String name = cls.getName();
	 // System.out.println(name);
	 // System.out.println(cls.getName());
	   
//	  ClassLoader cl = Alpha.class.getClassLoader();	
//	  ClassLoader parent = cl.getParent();
//	  System.out.println(parent);
	}

	

}
