package Com.arrayDay3.task;

import java.util.Arrays;

public class ArrayUniqueElement
{
	
	public static void uniqueElements(int arr[]) 
	{
		
		//3,32,2,2,3,7,6,1
		
		System.out.println("Original Arrays: "+Arrays.toString(arr));
		System.out.print("Unique Elements: ");
	   for(int i = 0 ; i < arr.length ; i ++ )
		{
			int c = 1;
			for(int j = 0 ; j < arr.length ; j++)
			{
				if(i!=j && arr[i] == arr[j])
				{
					c = 0;
					 break;
				} //1 
			}
			
			if(c == 1)
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		
		int [] arr = {3,32,2,2,3,7,6,1};
		ArrayUniqueElement.uniqueElements(arr);
	}

}


