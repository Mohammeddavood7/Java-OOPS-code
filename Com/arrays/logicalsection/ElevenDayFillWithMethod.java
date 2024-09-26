package Com.arrays.logicalsection;

import java.util.Arrays;
import java.util.Scanner;

public class ElevenDayFillWithMethod
{
	public int[] fill(int arr[],int element)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i>=0 && i<arr.length)
			{
				arr[i] = element;
			}
			
		}
		return arr;
	}
	
	
	
	public int[] fill(int arr[],int start ,int end,int element)
	{
	    int index = start-1;
		if(start>=0&&start<arr.length)
		{
		
		for(int i=0;i<arr.length;i++)
		{
			if(i>=start && i<=end)
			{
				arr[index] = element;	
				index++;
			}
		}
		}
		
		return arr;
		
		
	}
	
	public static void main(String[] args)
	{
		int arr1[] = {1,2,3,4,5,6};
		ElevenDayFillWithMethod efm = new ElevenDayFillWithMethod();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element rewrite all element: ");
		int ele = sc.nextInt();
		int[] fill = efm.fill(arr1, ele);
		System.out.println(Arrays.toString(fill));
		int arr2[] = {1,2,3,4,5,6,7,8,9};
		System.out.print("Enter starting index: "); 
		int start = sc.nextInt();
		System.out.print("Enter ending index: ");
		int end = sc.nextInt();
		System.out.print("Enter the element rewrite all element: ");
		int element = sc.nextInt();
		int[] fill2 = efm.fill(arr2, start, end, element);
		System.out.println(Arrays.toString(fill2));
		
	}

}
