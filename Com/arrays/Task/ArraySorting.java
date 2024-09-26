package Com.arrays.Task;

import java.util.Arrays;

public class ArraySorting
{
	
	public static void generalSorting(int arr[])    
	{
		
		for(int i=0;i<arr.length;i++)// holding index 
		{                       //8                   
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];   
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		System.out.println(arr[arr.length-1]);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args)
	{
	    int arr[] = {2,6,1,8,3,8,2,6};
	    
	    ArraySorting.generalSorting(arr);
	    
	}

}




























































