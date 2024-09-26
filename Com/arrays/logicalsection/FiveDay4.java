package Com.arrays.logicalsection;

import java.util.Arrays;

public class FiveDay4 
{
	
	public static int[] num(int a[],int b [] )
	{
		int arr[] = new int[] {a[a.length/2],b[b.length/2]};
		return arr;
	}
	public static void main(String[] args) 
	{
		int [] arr1 = {11,22,33,55,4};
		int [] arr2 = {22,11,22,99,2};
		int[] num = FiveDay4.num(arr1,arr2);
		System.out.println(Arrays.toString(num));
		
		
	}

}
