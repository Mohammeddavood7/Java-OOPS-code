package Com.march11.Exception;

public class MutliCatchBlock 
{
	public static void mutliCatch()
	{
		int a[]=new int[2];
		try
		{
		  a [4]=10/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		   e.printStackTrace();
		}
		catch (ArithmeticException e)
		{
		   e.printStackTrace();
		} 
	}
	
	public static void main(String[] args)
	{
		MutliCatchBlock.mutliCatch();
		
	}

}
