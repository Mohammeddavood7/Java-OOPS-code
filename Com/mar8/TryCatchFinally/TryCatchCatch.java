package Com.mar8.TryCatchFinally;

public class TryCatchCatch
{
	public static void main(String[] args) 
	{
		System.out.println("Main started....");
		
		try
		{
			int arr[] = {1,2,3,4,5,6};
			System.out.println(arr[6]);
			
			String str = "one";
			int a = Integer.parseInt(str);
			System.out.println(a);
		}
		catch(NumberFormatException e )
		{
			System.err.println("printing Array more than what have provided");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("provide appropriate input");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Main ended....");
	}

}









































