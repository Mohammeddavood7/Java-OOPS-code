package Com.feb24.labcode;


class SingletonDemo 
{  
	   private SingletonDemo() 
	   {  
	      System. out.println("In a private constructor");  
	   }  
	   
	   public static SingletonDemo getObject()
	   {  
	      // we can call this constructor  
	      if (ref == null) 
	      {
	         ref = new SingletonDemo();  
	      }
	      
	      return ref;
	   } 
	   
	   private static SingletonDemo ref;

}  

public class PrivateConstructor 
{  
	   public static void main(String args[]) 
	   {  
		 SingletonDemo.getObject(); 
		 
		 System.out.println( SingletonDemo.class.getClassLoader());	      
	   }  
} 
































