package Com.march11.classlab;

public class VariableInitialization 
{
	public static void main(String[] args) 
	{      
	   int x;
       try
       {   
    	   
    	   x = 10;
    	   System.out.println(x);
       }
       catch(Exception e)
       {    
    	   x = 15;
    	   System.out.println(x);
    	  System.err.println(e.getMessage());
       }
      
       System.out.println("Main completed!!!");
	}

}