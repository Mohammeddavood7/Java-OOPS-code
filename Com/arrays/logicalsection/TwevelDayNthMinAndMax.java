package Com.arrays.logicalsection;

import java.util.Scanner;

public class TwevelDayNthMinAndMax
{
	
	
	//2,6,1,7,9,3
	// 1,2,3,6,7,9 ===min:2=2
	public void min(int arr[],int nmin)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
					
				}
			}
			
			if(i == nmin-1)
			{
				System.out.println((i+1)+" Minimum Number is: "+arr[i]+"  ");
				break;
			}
		}
		
	}
	
	//9,7,6,3,2,1 ==max:3=6
	public void max(int arr[],int nmin)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
					
				}
			}
			
			if(i == nmin-1)
			{
				System.out.println((i+1)+" Maximum Number is: "+arr[i]+"  ");
				break;
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TwevelDayNthMinAndMax tmm = new TwevelDayNthMinAndMax();
		int arr[] = {2,6,1,7,9,3};
		System.out.print("Find the Nth minimun Press 1: \n");
		System.out.println("Find the Nth maximum Press 2: ");
		int choice = sc.nextInt();
		
			if(choice == 1)
			{
	             System.out.print("Enter element to find min: ");
				 int nMin = sc.nextInt();
			    tmm.min(arr, nMin);
				
			}
			else if(choice == 2)
			{
	             System.out.print("Enter element to find max: ");
				 int nMin = sc.nextInt();
			     tmm.max(arr, nMin);
				
			}
			else
			{
				System.err.print("Please selecte 1 or 2 !! ");
			}
			
		
	}

}
