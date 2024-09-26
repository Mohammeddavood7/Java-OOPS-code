package Com.arrays.logicalsection;

public class sixteenDayCountElements
{
	public static void main(String[] args)
	{
		int [] arr = {1,1,2,3,1,2,3,1,2,3,3,3,3,3};
		
		for(int i =0;i<arr.length;i++)
		{ 
		  int value = arr[i];
		  int count = 0;
			  if(arr[i] == -1)
			  {
				  continue;
			  }
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j] == value)
				{
				    count++;
					arr[j] = -1;
				}

			}
			System.out.println("Occurance of elements "+value+" is :"+count+" Times");
		}
	}
   
}
