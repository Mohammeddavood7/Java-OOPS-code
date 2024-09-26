package Com.arrays.Task;

import java.util.Arrays;

public class ArraysBubbleSort 
{
	
	
	
	public static void bubbleSort(int arr[]) 
	{
		int flag = 0;
		             //3
		for(int i=0;i<arr.length-1;i++)//2,7,4,5,9
		{ 
			
			flag =0;
			for(int j=0;j<arr.length-1;j++)
			{ 		
				
				if(arr[j] >  arr[j+1])
				{
					int temp = arr[j]; 
					arr[j] = arr[j+1];  
					arr[j+1] = temp;
					flag = 1;
				}
			}
			
			if(flag == 0)
			{
				break;
			}
		}
		
			System.out.println(Arrays.toString(arr));
}
		
	

	
	public static void main(String[] args) 
	{
		int arr[] = {0,9,2,1,7,4,5};
		ArraysBubbleSort.bubbleSort(arr);
	}

}
