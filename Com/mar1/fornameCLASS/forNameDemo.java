package Com.mar1.fornameCLASS;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


class Employee
{
	int x,y,z;
	int a,b,c;
	
	public Employee()
	{
		
	}
	public Employee(int a)
	{
		
	}
	
	public Employee(int a,int b)
	{
		
	}
	
	
	
	public void show()
	{
		System.out.println("show");
	}
	
	
	public void display()
	{
		System.out.println("display");
	}
	public void details()
	{
		System.out.println("Details");
	}


	
}


public class forNameDemo
{
	public static void main(String[] args) throws Exception
	{
		Class<?> cls = Class.forName(args[0]);
		//System.out.println(cls.getPackageName());
//		
//        Method[] methods = cls.getDeclaredMethods();     
         int count = 0;
//        for(Method method : methods)
//        { 
//        	count++;
//        	System.out.println(method);
//        }
//        
//        System.out.println("Methods :"+count);
//        
//        count =0;
//        Field[] fields = cls.getDeclaredFields();
//        for(Field field: fields)
//        {
//        	count++;
//        	System.out.println(field);
//        }
//        
//        System.out.println("Fields or variable : "+count);
        
        Constructor<?>[] cons = cls.getDeclaredConstructors();
        for(Constructor con : cons)
        {
        	count++;
        	
        	System.out.println(con);
        }
		System.out.println("Total no.on constructor: "+count);
	}

}

































































