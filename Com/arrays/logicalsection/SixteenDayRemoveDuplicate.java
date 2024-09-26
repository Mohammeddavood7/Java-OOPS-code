package Com.arrays.logicalsection;

import java.util.Arrays;

public class SixteenDayRemoveDuplicate
{
	//1,2,2,3,4,5
	
	public static int[] removeDuplicate(int arr[])
	{
		Arrays.sort(arr);
		int index =0;
		int newArr1 []= new int[arr.length-1];
		
		for(int i=0;i<arr.length-1;i++)
		{
				if(arr[i] != arr[i+1])
				{
					newArr1[index] = arr[i];
					index++;
				}
				
		}
		
	    	newArr1[index] = arr[arr.length-1];
	    	int result [] = Arrays.copyOf(newArr1, newArr1.length-1);
		
		 return result;
		
		
	}
	
	
	public static void main(String[] args)
	{
		int arr[] = {1,2,2,3,3,4,5,5,5,5,5};
		

      	int[] removeDuplicate = SixteenDayRemoveDuplicate.removeDuplicate(arr);
      	System.out.println(Arrays.toString(removeDuplicate));

		
		
	}

}
































