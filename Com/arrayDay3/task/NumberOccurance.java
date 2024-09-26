package Com.arrayDay3.task;

import java.util.Arrays;

public class NumberOccurance
{
	public static void numberOccurance(int arr[])
	{
       //25,12,43,43,43,43,25,25,12
	   //0, 1, 2, 3 ,4, 5, 6, 7, 8 
	     for(int i=0; i<arr.length; i++)
	     {
	    	 int value = arr[i]; 
	    	 int count = 0;
	    	 if(arr[i] == -1)
	    	 {
	    		 continue;
	    	 }
	    	 
	    	 for(int j=0; j<arr.length; j++)
	    	 {
	    		 if(arr[j] == value) //25
	    		 {
	    			 arr[j] = -1;
	    			 count++;
	    		 }
	    	 }
				System.out.println("Occurance " +value+ " Element: "+count+" Times");
		}
	     
	    // System.out.println(Arrays.toString(arr));
		
	}
	
	
	public static void main(String[] args)
	{
		int arr[] = {25,12,43,43,43,43,25,25,12};
	 NumberOccurance.numberOccurance(arr);
		
	}

}
