package Com.arrays.logicalsection;



public class FiveDay1
{
	public static int num(int []arr)
	{
		int big = arr[0];
		if(arr[1]>big)
		{
			big = arr[1];
		}
		if(arr[2]>big)
		{
		   big = arr[2];	
		}
		
		return big;
	}
	
	public static void main(String[] args) 
	{
		
		
		int [] arr = {10,7,7};
		
		for(int i=0;i<arr.length;i++)
		{
			
		}
		int num = FiveDay1.num(arr);
		System.out.println("big number: "+num);
		
	}

}
