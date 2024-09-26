package Com.arrayDay3.task;

public class SeparateEvenAndOddNumber
{
	public static void evenOdd(int arr[])
	{ 
		System.out.print("The Even elements are: ");
		for(int i=0; i<arr.length;i++)
		{
			
			if(arr[i]%2 == 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.print("\nThe Odd elements are: ");
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]%2 != 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}
	
	public static void main(String[] args)
	{
		
		int arr[] = {25,47,42,56,32};
		SeparateEvenAndOddNumber.evenOdd(arr);
		
	}

}
