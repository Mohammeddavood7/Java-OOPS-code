package Com.arrays.Task;

import java.util.Arrays;

public class ArraysMissingNumber 
{
	
	public static void missingElements(int arr[])
	{
		 
     	if(arr[0] == 1)
		{
			
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=arr[i];j<arr[i+1];j++) //
				{
					if(j!=arr[i])   
					{
					System.out.println("Missing Number is: "+j);
					}
					  
				}
			}
		
		}
		else
		{   
			//0 1 2 3
			//2 5 9 0
			//2 5 9 9 
			//2 5 5 9
			//2 2 5 9
			
			int element = 1; 
			int newArr [] = Arrays.copyOf(arr, arr.length+element);
	
			for(int i=newArr.length-1; i>0;i--)
			{
				newArr[i] = newArr[i-1];
			}
	
			newArr[0] = element;
			System.out.println("MIssing Number is :"+element);
			
			for(int i=0;i<newArr.length-1;i++)
			{
				for(int j=newArr[i];j<newArr[i+1];j++) 
				{
					if(j!=newArr[i])
					{
					System.out.println("Missing Number is: "+j);
					}
				}
			}
			
			
		}
		
	}

	public static void main(String[] args)
	{
		int arr[] = {5,9}; //1,3,4,6,7,8
		ArraysMissingNumber.missingElements(arr);
	
		
		
	}

}

















































































