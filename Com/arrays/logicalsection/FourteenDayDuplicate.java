package Com.arrays.logicalsection;

import java.util.Arrays;

public class FourteenDayDuplicate
{
	public static int[] DuplicateMethod(int [] arr1)
	{
		//1,2,3,3,4,5
		Arrays.sort(arr1);
		int newArr[] = new int[arr1.length];
		int index =0;
		for(int i=0;i<arr1.length-1;i++)
		{
			if(arr1[i] != arr1[i+1])
			{
				newArr[index] = arr1[i];
				index++;
			}
			
		}
		
		newArr[index] = arr1[arr1.length-1];
		
		int result [] = Arrays.copyOf(newArr, newArr.length-1);
		
		return result;
	}
	
	
	
	
	public static void main(String[] args)
	{
		int [] arr1 = {1,2,2,2,3,3,4,5};
		
		
		int[] duplicateMethod = FourteenDayDuplicate.DuplicateMethod(arr1);
		System.out.println(Arrays.toString(duplicateMethod));
		
	}

}
