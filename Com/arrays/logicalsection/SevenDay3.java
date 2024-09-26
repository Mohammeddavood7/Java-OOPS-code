package Com.arrays.logicalsection;

import java.util.Arrays;

public class SevenDay3
{
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50};
		
		SevenDay3 d = new SevenDay3();
		int result[] = d.arrayTaken(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(result));
		
	}
	
	public int[] arrayTaken(int a[])
	{
		int len = a.length;
		int arr2[] = new int[len*2];
		
		arr2[arr2.length-1] = a[a.length-1];
		
		return arr2;
		
	}
	
	

}
