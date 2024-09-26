package Com.arraysDay4.task;

import java.util.Arrays;

public class FrequencyOccuranceElement
{

	public static void frequencyElement(int arr[])
	{
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			int value = arr[i];
			int count = 0;
			if(value == -1)
			{
				continue;
			}
			
		 for(int j=0;j<arr.length;j++)
			{
				if(arr[j] == value)
				{
					arr[j] = -1;
					count++;
					
				}
			}
		 
		 System.out.println(value+" Frequency is "+count+" times");
			
		}
	}
	
	
	
	
	public static void main(String[] args)
	{
		int arr[] = {1,4,1,2,4,5};
		FrequencyOccuranceElement.frequencyElement(arr);
	}
}
