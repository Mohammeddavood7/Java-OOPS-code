package Com.arraysDay5.task;

public class LinearSearch
{
	
	public static void linearSearch(int arr[],int ele)
	{
		int flag = 0;
		//1,2,3,4,5,6,7
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == ele )
			{
				System.out.println("Element is Found in the index: "+i);
				flag = 1;
				break;
				
			}
		}
		
		if(flag == 1)
		{
			System.out.println("ELEMENT IS FOUND");
		}
		else
		{
			System.out.println("ELEMENT IS NOT FOUND");
		}
		
		
	}
	
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7};
		int ele = 2;
		LinearSearch.linearSearch(arr,ele);
		
	}

}
