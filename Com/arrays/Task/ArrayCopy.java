package Com.arrays.Task;

import java.util.Arrays;

public class ArrayCopy 
{
	public static void main(String[] args) 
	{
		int arr1[] = {1,6,18,5,5,14};
		            //0 1  2 3 4  5 
		
	   	int copyArr[] = new int[6]; //to store // 0 0 0 0 0 0
	   	
	   	for(int i=0;i<arr1.length;i++)
	   	{
	   		copyArr[i] = arr1[i];
	   	}
	   	System.out.println("Original Array: "+Arrays.toString(arr1));
	   	System.out.println("Copy array: "+Arrays.toString(copyArr));
		
	}

}
