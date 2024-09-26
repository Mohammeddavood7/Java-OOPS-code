package Com.arrays.logicalsection;

import java.util.Scanner;

public class NineDay1
{
	
	public static void linearSelection(int []arr,int ele)
	{
		int flag =0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("Element "+ele+" is found at index: '"+i+"' ");
				flag = 1;
			}
			
		}
		if(flag==0) {
			System.out.println("Element Is Not Found");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("Enter  '"+(i+1)+"'  element: ");
		    arr[i] = sc.nextInt();
		}
		System.out.print("Search the element: ");
		int element = sc.nextInt();
		NineDay1.linearSelection(arr,element);
		
		
		
	}

}
