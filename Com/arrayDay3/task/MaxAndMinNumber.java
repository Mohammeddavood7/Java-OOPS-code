package Com.arrayDay3.task;

public class MaxAndMinNumber
{
	public static void maxNum(int arr[])
	{
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Maximum Number: "+max);
	} 
	
	
	public static void minNum(int arr[])
	{
		int min = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Minimum number: "+min);
	}
	
	public static void main(String[] args) 
	{
		
		int arr[] = {1,2,44,7,2,8,5,4};
		MaxAndMinNumber.minNum(arr);
		MaxAndMinNumber.maxNum(arr);
		
	}

}
