package Com.arraysDay5.task;

public class OccuranceElment
{
	public static void occuranceElement(int arr[])
	{
		
		for(int i = 0; i < arr.length; i++)
		{
			//1,6,4,3,9,6,3,4,6
			//0 1 2 3 4 5 6 7 8
			
			int value = arr[i];
			int count = 0;
			if(arr[i] == -1)
			{
				continue;
			}
			
			for(int j = 0 ; j < arr.length; j++)
			{       
				if(arr[j] == value)
				{
					arr[j] = -1;
					count++;
				}
			}
			
			if(count != 1 )
			{
				System.out.println( "Occurance of "+ value +" is "+count+" Times");
			}
		}
		
		
		
		
	}
	
	
	
   public static void main(String[] args) 
   {
	   int arr[] = {1,6,4,3,9,6,3,4,6};
	   OccuranceElment.occuranceElement(arr);
	
   }
}
