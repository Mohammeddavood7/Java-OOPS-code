package Com.arrays.logicalsection;
//Given an array of integers of odd length, return a new array length 3 containing 
//the elements from the middle of the array.One element should be before middle and 
//another one should be after middle. The original array length will be at least 3.
import java.util.Arrays;

public class SevenDay4 
{
	public static void main(String[] args) 
	{
	   int[] arr = {1,2,3,4,5,6,7,8};
	   
	  int[] caught = SevenDay4.caught(arr);
	  System.out.println(Arrays.toString(caught));
	   
	}
	
	public static int[] caught(int[] a)
	{
		if(a.length/2 < 3 ||a.length%2 == 0 )
		{
			return a;
		}
		else
		{
			int valueGot = a.length/2;
			int result [] = {a[valueGot-1],a[valueGot],a[valueGot+1]};
			return result;
		}
		
		
		
		
	}

}
