package Com.mar1.fornameCLASS;

public class minMax 
{
	public static void main(String[] args)
	{
		int [] arr = {2,5,1,3,8,9,6};
		
		int min = arr[0];
		int max = arr[0];
		
	    for(int i=1;i<arr.length;i++)
	    {
	    	if(arr[i] < min)
	    	{
	    		min = arr[i];
	    	}
	    }
		System.out.println("mininum: "+min);
		
		

	    for(int i=1;i<arr.length;i++)
	    {
	    	if(arr[i] > max)
	    	{
	    		max = arr[i];
	    	}
	    }
		System.out.println("maximum : "+max);
		
		
	}

}
