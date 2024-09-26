package Com.arrays.Task;

import java.util.Arrays;

public class ArraysSortingandInsert
{

	public static void sortInsert(int arr[],int ele) //2,5,7,9,11
	{
		
		System.out.println(Arrays.toString(arr));

		int newArr[] = Arrays.copyOf(arr, arr.length+1);
		int index = newArr.length-1;
		
		for(int i=newArr.length-1;i>0;i--)
		{
		  newArr[index] = newArr[i-1];
				  index--;
			
		}
		//System.out.println(Arrays.toString(newArr));

		
		for(int i=0;i<arr.length-1;i++)  //2,5,7,9,11
		{
			if(arr[i]<ele) //8
			{
				newArr[i] = arr[i];
				
			}
			else 
			{
				newArr[i] = ele;
				break;
			}
		}
		System.out.println(Arrays.toString(newArr)); //printed
	}
	
	
	
	
	public static void main(String[] args)
	{
		int arr[] = {2,5,7,9,11};
		int ele = 8;
		ArraysSortingandInsert.sortInsert(arr, ele);
		
	}
}
