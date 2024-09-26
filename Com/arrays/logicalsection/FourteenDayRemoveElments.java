package Com.arrays.logicalsection;

import java.util.Arrays;

public class FourteenDayRemoveElments
{
	
	public static int[] removeElment(int arr[],int element)
	{
		boolean flag = false;
		arr = FourteenDayDuplicate.DuplicateMethod(arr);
		
		for( int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				for(int j=i	;j<arr.length-1;j++)
				{
					arr[j] = arr[j+1];
				}
				flag = true;
				break;
			}
		}
		

		
		if(flag==false)
		{
			System.out.println("Element is not found");
		}
		else
		{
			System.out.println("Element is found");

		}
		
		   int newArr[] = Arrays.copyOf(arr, arr.length-1);
		
		 return newArr;
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		int arr1[] = {1,2,2,3,4,5};
		int element = 2;
		int[] removeElment = FourteenDayRemoveElments.removeElment(arr1,element);
		System.out.println(Arrays.toString(removeElment));
		
		
	}

}
