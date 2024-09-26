package Com.arrays.logicalsection;

import java.util.Arrays;

public class FourteenDayMissingNumber
{
	
	
	public static void MissingNumber(int arr1[])
	{
		if(arr1[0]==1)
		{
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=arr1[i];j<arr1[i+1];j++)
			{
				if(j != arr1[i])
				{
					System.out.println("Missing Number is: "+j);
				}
			}
			
		}
		
		}
		else
		{        //7,12 0
			     // 7,12,12
			     // 7,7,12
			int element=1;
			int index = arr1.length;
			int newArr[] = Arrays.copyOf(arr1,arr1.length+element);
			for(int i=newArr.length-1;i>0;i--)
			{
				newArr[index] = newArr[i-1];   
				index--;
			}
			
			newArr[index] = element;
			System.out.println(Arrays.toString(newArr));

			System.out.println("MIssing Number is :"+element);
			
			for(int i=0;i<newArr.length-1;i++)
			{
				for(int j=newArr[i];j<newArr[i+1];j++)
				{
					if(j != newArr[i])
					{
						System.out.println("Missing Number is: "+j);
					}
				}
				
			}
		}
		
	}
	public static void main(String[] args)
	{
		int arr1[] = {4,12};
		
		FourteenDayMissingNumber.MissingNumber(arr1);
		
	}
	
	
	
	
	

}
