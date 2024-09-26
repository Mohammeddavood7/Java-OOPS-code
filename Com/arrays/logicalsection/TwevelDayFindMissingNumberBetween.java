package Com.arrays.logicalsection;

public class TwevelDayFindMissingNumberBetween
{
	public static void main(String[] args)
	{
		int [] arr = {2,4,7,12,16};
		
		if(arr[0]==1)
		{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=arr[i];j<arr[i+1];j++)
			{
				if(j!=arr[i])
				{
					System.out.println("Missing elements are: "+j);
				}
			}
		}
		}
		else
		{
			System.out.println("Missing elements are: "+1);
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=arr[i];j<arr[i+1];j++)
				{
					if(j!=arr[i])
					{
						System.out.println("Missing elements are: "+j);
					}
				}
			}
			
		}
		
	
	}

}
