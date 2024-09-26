package Com.arraysDay4.task;

import java.util.Arrays;

public class FindMissingElement
{
	
	public static void missingElement(int arr[])
	{
		if(arr[0] == 1) 
		{		
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=arr[i];j<arr[i+1];j++)
				{
					if( j != arr[i])
					{
						System.out.println("Missing Elements is: "+j);
					}
				}
			}
		}
		else
		{
			int element = 1;
			
			int newArr[] = Arrays.copyOf(arr, arr.length+element);
			
			for(int i=newArr.length-1;i>0;i--)
		      {
				  newArr[i] = newArr[i-1];
				
			  }
			    newArr[0] = element;
			    System.out.println(Arrays.toString(newArr));
			   System.out.println("Missing Elements is: "+element);
			   
			for(int i=0;i<newArr.length-1;i++)
			{
			    for(int j=newArr[i];j<newArr[i+1];j++)
			    {
			    	if(j != newArr[i])
			    	{
			    		System.out.println("Missing Elements is: "+j);
			    	}
			    }
			}
			
			
		}
	}
	
	public static void main(String[] args)
	{
		int arr[] = { 2, 3, 5};    //1,3,4,7,10
		FindMissingElement.missingElement(arr);
		
	}

}
