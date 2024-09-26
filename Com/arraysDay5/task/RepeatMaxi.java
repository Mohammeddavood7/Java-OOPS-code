package Com.arraysDay5.task;

public class RepeatMaxi
{

	public static void repeateMax(int arr[])
	{
		int holdMax = 0;
		int tempMax = 0;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{ 
					tempMax = arr[i];
				}
				holdMax = tempMax;
				
			}
			
		}
		
		System.out.println(holdMax);
	}
	
	
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,3,3,5,5,5,5};
		RepeatMaxi.repeateMax(arr);
		
	}
}










































































