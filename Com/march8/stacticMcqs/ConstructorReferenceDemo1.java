package Com.march8.stacticMcqs;

@FunctionalInterface
interface A 
{
    Test createObject();
}

class Test 
{
    public Test() 
    {
        System.out.println("Test class Constructor invoked");
    }
}
public class ConstructorReferenceDemo1
{
    public static void main(String[] args) 
    {
        //By using Lambda
        A a1 = ()-> new Test();
        a1.createObject(); 
        
       A a2 = new A()
       {
    	   @Override
        	public Test createObject()
        	{
    		   return new Test();
        		
        	}
        		
       };
       a2.createObject();
       
      
           
        
      
        
        System.out.println("...................");        
        
        //By Using Method Reference
        A a3 = Test::new;   //calling Test class constructor 
        a3.createObject(); 
    }
}