package Com.arrays.logicalsection;

import java.util.Arrays;
import java.util.Scanner;

public class TenDayMergeAddElements
{
	static Scanner sc = new Scanner(System.in);
	public static int[] merge(int arr1[],int arr2[],int ele)
	{
		int len = arr1.length+arr2.length+ele;
		int [] newarr = new int[len];
		int index = 0;
		System.out.println("Before merging: ");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(newarr));

		for(int i=0;i<arr1.length;i++)
		{
			newarr[index] = arr1[i];
				   index++;
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			newarr[index] = arr1[i];
				   index++;
		}
		
		for(int i=0;i<ele;i++)
		{
			System.out.print("Enter the elements: ");
			    
			newarr[index] = sc.nextInt();
			   index++;
			
		}
		return newarr;
		
		
	}
	
	public static void main(String[] args) 
	{
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {5,6,7,8};
		System.out.print("How elements want to enter: ");
		int ele = sc.nextInt();
		int ele1[]  = merge(arr1,arr2,ele);
		System.out.println("After merging: ");
		System.out.println(Arrays.toString(ele1));

		
		
	}

}
