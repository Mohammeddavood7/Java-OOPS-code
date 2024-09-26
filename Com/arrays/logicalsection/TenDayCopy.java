package Com.arrays.logicalsection;

import java.util.Arrays;

public class TenDayCopy
{
	
	public static void main(String[] args)
	{
		int [] arr = {1,2,3,4};
		int length = arr.length;
		int [] newarr =new int[length];	
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newarr));

		for(int i=0;i<arr.length;i++)
		{
			 newarr[i] = arr[i];
			 
		}
		System.out.println(Arrays.toString(newarr));
	}

}
