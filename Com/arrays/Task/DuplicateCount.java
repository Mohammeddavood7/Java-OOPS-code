package Com.arrays.Task;

public class DuplicateCount 
{
	public static void main(String[] args)
	{
		int []arr = {5,1,1,6};
		          // 0 1 2 3
		
		int count = 0; 
		int value = 0;
		
		for(int i=0;i<arr.length-1;i++)
		{
		     if(arr[i] == arr[i+1]) 
		     {
		    	count++;
		    	value = arr[i];
		     }
		}
		
	    System.out.println("Element is '"+value+"' And count of duplicate element is: "+(count+1));

		//System.out.println(count);
	}

}









































































