package Com.arrays.logicalsection;

import java.util.Arrays;
import java.util.Scanner;

public class SixDayBubbleSort 
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
			int flag=0;
			
			for(int j=0;j<arr.length-1;j++)
			{ flag=0;
				if(arr[j]>arr[j+1])
				{
			      int temp=arr[j];
			      arr[j]=arr[j+1];
			      arr[j+1]=temp;
			      flag=1;
				}
				
			   
			}
			if(flag==0)
			  {
				break;
			  }
			 
			}
		
		System.out.print("Ouput : "+Arrays.toString(arr));
	}

}

