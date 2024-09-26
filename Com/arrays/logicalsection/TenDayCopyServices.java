package Com.arrays.logicalsection;

import java.util.Arrays;
import java.util.Scanner;

public class TenDayCopyServices
{

	static Scanner sc = new Scanner(System.in);
	
	public int[] Copy(int arr[],int element)
	{
		int index  = arr.length;
		int newarr[] = new int[arr.length+element];
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			newarr[i] = arr[i];
		}
		for(int i=1;i<=element;i++)
		{
		   System.out.print("Enter the element: ");
		   newarr[index] = sc.nextInt();
		   index++;
		   
			
		}	
		return newarr;
	}
	public static void main(String[] args)
	{		
		int[] arr1 = {1,2,3,4};
		
		TenDayCopyServices cs = new TenDayCopyServices();
		System.out.print("How many want to element insert: ");
		int ele = sc.nextInt();
		int[] copy = cs.Copy(arr1,ele);
		System.out.println(Arrays.toString(copy));
		
		
		
	}

}



























