package Com.arraysDay5.task;

import java.util.Arrays;

public class InsertElement
{
	
	public static void insertElement(int arr[],int indexEle)
	{
		int newArr[] = Arrays.copyOf(arr, arr.length+1);
		//1,2,3,4,5,6,0
		//0 1 2 3 4 5 6 ==index
		
		//1 2 3 4 5 6 6
		//1 2 3 4 5 5 6
		//1,2,3,4,4,5,6
		//1,2,3,3,4,5,6
		
		               //5
		for(int i = newArr.length-1 ; i>indexEle; i-- )
		{
			newArr[i] = newArr[i-1];  
		}
		
		newArr[indexEle] = 99;
		
		System.out.println(Arrays.toString(newArr));
		  
	}
	
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6};
		int ele = 2;
		InsertElement.insertElement(arr,ele);
		
	}

}
