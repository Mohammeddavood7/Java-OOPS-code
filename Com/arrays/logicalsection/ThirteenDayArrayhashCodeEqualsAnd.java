package Com.arrays.logicalsection;

import java.util.Arrays;

public class ThirteenDayArrayhashCodeEqualsAnd
{


	public static boolean compare(int[] arr1,int[] arr2)
	{
		boolean result = false;
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i] == arr2[i])
					{
					    result = true;
					}
			}
		}
		return result;

	}
	
	public static boolean comparing(int[] arr1,int [] arr2)
	{
		boolean result = false;
		if(arr1.length == arr2.length)
		{
			if(Arrays.hashCode(arr1)==Arrays.hashCode(arr2))
			{
				result = true;
			}
		}
		
		return result;
		
	}
	
	
	public static void main(String[] args)
	{
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,3,4,5};
		
		boolean compare = ThirteenDayArrayhashCodeEqualsAnd.compare(arr1, arr2);
		System.out.println(compare);
		boolean comparing = ThirteenDayArrayhashCodeEqualsAnd.comparing(arr1, arr2);
		System.out.println(comparing);
	}
}
