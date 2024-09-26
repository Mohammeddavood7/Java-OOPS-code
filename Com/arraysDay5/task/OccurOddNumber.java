package Com.arraysDay5.task;

public abstract class OccurOddNumber 
{
	
	public static void occurOdd(int arr[])
	{
		
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
			
		   if(count%2 != 0 )
		   {
			   System.out.println("Occuring elemen odd number times are:  "+value);
		   }
		}	
		
	
	}

	public static void main(String[] args)
	{
		int arr[] = {6,7,3,6,8,7,6,8,3,3};
		OccurOddNumber.occurOdd(arr);
	}

}

//6,7,3,6,8,7,6,8,3,7
//1,2,3,4,5,6,7,8,9,10






































































