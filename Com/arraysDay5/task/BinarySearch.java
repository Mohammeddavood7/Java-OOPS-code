package Com.arraysDay5.task;


public class BinarySearch
{
	public static int binarySelection(int arr[],int ele)
	{
		//3 5 2 8 1 6 9  //length = 7
		      //3 4 5 6
		int result = 0;
		
		int low = 0; 
		int high = arr.length;
		int middle = (low+high)/2;      //7/2 = 3 (9)
		
		     //0 < 7 always T
		while(low<high)//3 5 2 8  1 6 9  
		{
			if(arr[middle] == ele)  // 1 == 6
			{
                System.out.println("Output 1: ");
			      result = middle;
				  break;
			}
			else if(arr[middle]<ele) // 1 < 6
			{
				low = middle+1;
			}
			else
			{
				high = middle-1;
			}
			
			middle = (low+high)/2; 
		}
		
		return result;
	}
	
	public static void main(String[] args) 
	{
		int arr[] =  {3,5,2,8,1,6,9}; 
		int element = 6;
		int binarySelection = BinarySearch.binarySelection(arr, element);
		System.out.println(binarySelection);
		
	}


}
