package Com.arraysDay4.task;

import java.util.Arrays;

public class RemoveElementPractice
{
	
	public static void removeEle(int arr[],int remove)
	{
		//int indexRemove = -1;
		int count = 0;
		//1,2,3,4,5
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == remove)
			{
				count++;
			}
		}
		
		if( count > 0)
		{
			
			int newArr[] = new int[arr.length-count];
			
			for(int i=0,j=0;i<arr.length;i++)
			{
				if( arr[i] != remove)
				{
					newArr[j++]= arr[i];
				}
			}
			System.out.println("Original Array: "+Arrays.toString(arr));
			System.out.println("After Element Removed :"+Arrays.toString(newArr));
			
			
		}
		else
		{
			System.out.println("Original Array: "+Arrays.toString(arr));
			System.out.println("Element '"+remove+"' is not Found in the Given Array");
		}
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,3,3,4,5};
		int remove = 3;
	    RemoveElementPractice.removeEle(arr,remove);
	}

}















































































