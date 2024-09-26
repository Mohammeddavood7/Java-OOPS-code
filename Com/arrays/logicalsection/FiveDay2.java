package Com.arrays.logicalsection;

import java.util.Arrays;

public class FiveDay2
{
	public static int[] num(int []arr)
	{
		int big = arr[0];
		if(arr[2]>big)
		{
			big=arr[2];
		}
		arr[0]=big;
		arr[1]=big;
		arr[2]=big;
		return arr;

	}
	
	public static void main(String[] args) 
	{
		
		
		int [] arr = {67,7,10};
		int[] num = FiveDay2.num(arr);
		System.out.println(Arrays.toString(num));
		
	}

}
