package Com.march14.classs;

public class Test1 
{

	public static int divideByZero()
	{
	    int numerator = 10;
	    int denominator = 0;
	    return numerator / denominator;
	}

	public static void main(String[] args)
	{
	    try 
	    {
	        int result = divideByZero();
	        System.out.println("Result: " + result);
	    }
	
	    finally 
	    {
	        try
	        {
	            System.out.println("Finally block executed.");
	        } catch (Exception e) {
	            System.err.println("Exception caught in finally block: " + e.getMessage());
	        }
	    }
	    
	}
}







































