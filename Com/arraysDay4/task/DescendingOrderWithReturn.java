package Com.arraysDay4.task;

import java.util.Arrays;

public class DescendingOrderWithReturn 
{
	
	public static int[] sortReturn(int arr[])
	{
		System.out.println("Original Arrays: "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] < arr[j])
				{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {5,1,6,8,4};
		int[] sr = DescendingOrderWithReturn.sortReturn(arr);
		System.out.print("Desceding Order: ");
		for(int sorting : sr)
		{
			System.out.print(sorting+" ");
		}
		
	}

}
