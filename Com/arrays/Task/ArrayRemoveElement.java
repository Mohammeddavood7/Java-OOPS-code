package Com.arrays.Task;

import java.util.Arrays;

public class ArrayRemoveElement 
{
	
	public static int[] removeElement(int arr[],int ele)
	{
		
		//int index =0;
		
		boolean flag = false;
		 arr = ArrayDuplicateRemove.arrayDuplicateRemove(arr);  //3,5,2,1,4
		                                                        // 1 2 3 4 5
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == ele)
			{
				for(int j=i;j<arr.length-1;j++)
				{
					  arr[j] = arr[j+1];
				}
				flag = true;
				break;
				
			}
		}
		
		if(flag == true)
		{
			System.out.println("Element is found");
		}
		else
		{
			System.out.println("Element is not found");
		}
		
		
		
		
		
		
		
//		System.out.println("Original Arrays:"+Arrays.toString(arr));
//		int index = 0;
//		
//		for(int i=0;i<arr.length;i++)  
//		{       
//			if(arr[i] != ele)
//			{
//     	      arr[index] = arr[i]; 
//			   index++; 
//			}
//		}
		 int newArr[] = Arrays.copyOf(arr, arr.length-1);
		return newArr;
//		
	}
	public static void main(String[] args)
	{
		int arr[] = {3,5,2,1,4};
		int ele = 3;
		int[] removeElement = ArrayRemoveElement.removeElement(arr,ele);
		System.out.println(Arrays.toString(removeElement));
		
	}

}
