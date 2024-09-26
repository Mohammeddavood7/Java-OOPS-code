package Com.mar8.TryCatchFinally;

public class TryEnhancedCatch 
{
    public static void main(String[] args)
    {
    	System.out.println("Main started");
    	try
    	{
    	   int arr[] = new int[2];
    	   arr[0] = 99;
    		System.out.println(10/0);
    	}
    	catch(ArithmeticException | NegativeArraySizeException e )
    	{
    		System.err.println(e);
    	}
    	
    	System.out.println("Main ended");
	}
    
    
}
















































