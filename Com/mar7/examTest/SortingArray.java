package Com.mar7.examTest;

import java.util.Arrays;


public class SortingArray
{
	public static int [] sorting(int arr[])
	{
		
		System.out.println("Original Array: "+Arrays.toString(arr));
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
		
		int newArr [] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			newArr[i] = arr[i];
		}
		return newArr;
	}
	
	
	
	
     public static void main(String[] args)
     {
		int arr[] = {1,2,3,4,5};
		int[] sorting = SortingArray.sorting(arr);
		System.out.println("Descending Ordee: "+Arrays.toString(sorting));
	 }
}



















