package Com.arrays.logicalsection;

import java.util.Arrays;

public class TenDayMerge 
{
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7,8};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		int length = arr1.length+arr2.length;
		int[] mergeArr = new int[length];
		int index=0;
		System.out.println(Arrays.toString(mergeArr));
		for(int i=0;i<arr1.length;i++)
		{
			mergeArr[index] = arr1[i];
			index++;
		}
		for(int j=0;j<arr2.length;j++)
		{
			mergeArr[index] = arr2[j];
			index++;
					
		}
		System.out.println(Arrays.toString(mergeArr));
		
	}

}
