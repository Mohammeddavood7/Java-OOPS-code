package Com.arraysDay4.task;

public class SearchElement 
{
	
	
	
	public static void searchingElement(int arr[],int eleFind)
	{
		
		int flag = 0;
		for(int i=0; i<arr.length;i++)
		{
			
			if(arr[i] == eleFind)
			{
				System.out.println(i+" index Element is Found: "+arr[i]);
				flag = 1;
			}
		}
		
		if(flag == 0)
		{
			System.out.println("Element is not Found");
		}
			
	}
	public static void main(String[] args)
	{
		int arr[] = {1,5,3,6,6,6,8};
		int eleFind = 6;
		SearchElement.searchingElement(arr, eleFind);
	}

}































