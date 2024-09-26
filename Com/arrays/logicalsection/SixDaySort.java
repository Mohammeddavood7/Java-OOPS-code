package Com.arrays.logicalsection;

import java.util.Arrays;
import java.util.Scanner;

public class SixDaySort 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter '"+(i+1)+"' element: ");
			int ele = sc.nextInt();
			arr[i]=ele;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
			   int temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
				}
			   
			}
		}
		
		System.out.print("Ouput : "+Arrays.toString(arr));
	}

}
