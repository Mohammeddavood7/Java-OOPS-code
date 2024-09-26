package Com.arrays.logicalsection;

import java.util.Arrays;

public class sixteenDayRemove
{
	
	public static int[] removeElements(int arr[],int ele)
	{
		
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i] == ele)
				{
					for(int j=i ;j<arr.length-1; j++)
					{
						arr[i] = arr[i+1];
						
					}
                  flag = true;
                  break;
                  
				}
		}
		if(flag == false)
		{
		    System.out.println("Element is not found");	
		}
		else
		{
			System.out.println("Element is found");
		}
		
		int []newArr =Arrays.copyOf(arr, arr.length-1);
		//System.out.println(Arrays.toString(newArr));
		newArr[newArr.length-1] = arr[arr.length-1];
		
		return newArr;
	}
	
	public static void main(String[] args)
	{
		int arr1[] = {1,2,3,4,5};
		int element = 3;
		
		int[] removeElements = sixteenDayRemove.removeElements(arr1, element);
		System.out.println(Arrays.toString(removeElements));
		
	}

}
