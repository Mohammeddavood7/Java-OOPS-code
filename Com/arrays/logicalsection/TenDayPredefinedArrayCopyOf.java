package Com.arrays.logicalsection;

import java.util.Arrays;
import java.util.Scanner;

public class TenDayPredefinedArrayCopyOf 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr1 = {1,2,3,4};
		System.out.print("How many element want to enter: ");
		int ele = sc.nextInt();
		int[] newarr = Arrays.copyOf(arr1,arr1.length+ele);
		System.out.println(Arrays.toString(newarr));
		int index = arr1.length;
		for(int i=0;i<ele;i++)
		{
			System.out.print("Enter the elements: ");
			newarr[index] = sc.nextInt();
			index++;
		}
		
		System.out.println(Arrays.toString(newarr));
		
		
	}

}
