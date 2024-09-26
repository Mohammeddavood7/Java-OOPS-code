package Com.arrayDay3.task;

import java.util.Arrays;

public class MergeDecendingOrder 
{
	
	public static void mergeDecendingOrder(int arr1[],int arr2[])
	{	
	
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int newArr[] = new int[arr1.length+arr2.length];
		int index = 0;

		for(int i=0; i<newArr.length;i++)
		{
			if(i<arr1.length)
			{
				newArr[i]=arr1[i];
			}
			else
			{
				newArr[i]=arr2[index++];
			}

		}	
		
		
		for(int i=0;i<newArr.length;i++)
		{
			for(int j=i+1;j<newArr.length;j++)
			{
				if(newArr[i] < newArr[j])
				{
					int temp = newArr[i];
					newArr[i] = newArr[j];
					newArr[j] = temp;		
				}
			}
		}

		System.out.println(Arrays.toString(newArr));

	}
	

	public static void main(String[] args)
	{
		int arr1 [] = {1,2,3};  
		int arr2 [] = {1,2,3};
		MergeDecendingOrder.mergeDecendingOrder(arr1,arr2);		
	}

}




































//int newArr [] = new int[arr1.length+arr2.length];
//Arrays.sort(arr1);
//Arrays.sort(arr2);
//int index = 0;
//for(int i=0;i<newArr.length;i++)
//{
//	if(i<arr1.length)
//	{
//		newArr[i] = arr1[i];
//	}
//	else
//	{
//		newArr[i] = arr2[index++];
//	}
//}
//
//System.out.println(Arrays.toString(newArr));