package Com.march9.TryResources;

public class ArrayIndexException 
{
	public static void main(String[] args) 
	{
		try
		{
			int arr[] = {1,2,3};
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("please read the array upto ArraySIZE..");
		}
		
	}

}
