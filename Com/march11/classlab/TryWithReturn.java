package Com.march11.classlab;

public class TryWithReturn
{
	//public static int m1()
	//{
		//int res = 0;
//		try
//		{ 
//			res = 12/0;
//			System.out.println(res);
//			System.out.println(10/10);
//			return res;
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			//System.err.println(e);
//			return res;
//		}
//		
		
//		try
//		{
//			System.out.println(10/0);
//			
//		}
//		finally
//		{
//			
//		}
		
		
		public static int methodReturningValue()
	    {
	        try
	        {
	            System.out.println("Try block");
	            System.out.println(10/0);
	            return 10;    
	        }
	        catch (Exception e)
	        {
	            System.out.println("catch block");         
	            return 20;  //return statement is compulsory  
	        }
	               
	    }

	

	public static void main(String[] args)
	{
	
		  int methodReturningValue = TryWithReturn.methodReturningValue();
		System.out.println(methodReturningValue);
		
	}

}
