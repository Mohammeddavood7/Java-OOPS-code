package Com.arraysDay5.task;

public class MaximumBetweenTwoNum
{
	
	public static void maxBetweenNum(int arr[],int start,int end) 
	{
		int count = 0;
		
		for(int i=arr[start-1];i<arr[end-1];i++)
		{
				if(i != arr[end])
				{
					count++;
				}
				
		}
		if(count != 0)
		{
	      System.out.println("The elements which provide maximum difference is: "+arr[start-1]+" , "+arr[end-1]+" count : "+ count);
		}	
		
		
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {7,9,5,6,13,2};
		int start = 4;
		int end = 5;
		MaximumBetweenTwoNum.maxBetweenNum(arr, start, end);
	}

}
