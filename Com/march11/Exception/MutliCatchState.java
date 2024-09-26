package Com.march11.Exception;

public class MutliCatchState
{
	
	public static void mutliCatchD()
	{
		int a[]=new int[2];
		try
		{
		  a [4]=10/0;
		}
		catch(ArrayIndexOutOfBoundsException |ArithmeticException |NumberFormatException e)
		{
		   e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		MutliCatchState.mutliCatchD();
		
	}

}
