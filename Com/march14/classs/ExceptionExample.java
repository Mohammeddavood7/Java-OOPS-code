package Com.march14.classs;

/*public class ExceptionExample 
{
    public static void main(String[] args)
    {
        try 
        {
            String str = null;
            System.out.println(str.length());
        } 
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException occurred.");
        }
        finally 
        {
            System.out.println("End of program.");
        }
        
    }
    
}*/


public class ExceptionExample
{
    public static void main(String[] args)
	{
        try 
		{
        	String str = "one";	
        	int num = Integer.parseInt(str);
        	System.out.println(num);
        }
		catch (ArithmeticException e)
		{
            System.out.println("Cannot divide by zero.");
        } 
		catch (ArrayIndexOutOfBoundsException e)
		{
            System.out.println("Please provide two integers as command-line arguments.");
        } 
		catch (NumberFormatException e) 
		{
            System.out.println("Please provide valid integers as command-line arguments.");
        } 
		finally 
		{
            System.out.println("End of program.");
        }
    }
}





















