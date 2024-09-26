package Com.arrays.Task;

import java.util.Arrays;

public class ArrayDuplicateRemove
{
	
	public static int[] arrayDuplicateRemove(int[]arr)
	{
		Arrays.sort(arr);
		int newArr[] = new int[arr.length];
		int index = 0;
		
		for(int i=0;i<arr.length-1;i++)  //1,2,3,3,4,5
		{
			if(arr[i] != arr[i+1])
			{
				newArr[index] = arr[i];
			    index++;
			}
		}
		
		newArr[index] = arr[arr.length-1];
		
		int result [] = Arrays.copyOf(newArr, newArr.length);
		
		return result;
		
		
	}
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,3,4,5};
		int[] arrayDuplicateRemove = ArrayDuplicateRemove.arrayDuplicateRemove(arr);
		System.out.println(Arrays.toString(arrayDuplicateRemove));
		
	}

}
