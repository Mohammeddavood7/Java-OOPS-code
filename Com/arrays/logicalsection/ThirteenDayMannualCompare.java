package Com.arrays.logicalsection;

public class ThirteenDayMannualCompare
{
	//1,2,3,4,5
	public static int compare(int[] arr1, int[] arr2) {
	    int result = 0;
	    int min = Math.min(arr1.length, arr2.length);

	    for (int i = 0; i < min; i++)
	    {
	        if (arr1[i] < arr2[i])
	        {
	            result = -1;
	            break; 

	        } else if(arr1[i] > arr2[i])
	        {
	            result = 1;
	            break; 

	        }
	    }
	    if (result == 0)
	    {
	        if (arr1.length < arr2.length) 
	        {
	            result = -1; 
	        }
	        else if (arr1.length > arr2.length)
	        {
	            result = 1; 

	        }
	    }

	    return result;
	}
	public static void main(String[] args)
	{
	   int[] arr1 = {1,2,3,4,5};
	   int[] arr2 = {1,2,3,4,5};
	   int compare = ThirteenDayMannualCompare.compare(arr1, arr2);
	   System.err.println(compare);
 	}

}




































