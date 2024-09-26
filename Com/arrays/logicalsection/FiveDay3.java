package Com.arrays.logicalsection;

public class FiveDay3 
{
	public static int num(int a[])
	{
		int sum=0;
		
		if(a.length<=2)
		{
			
			if(a.length<1)
			{ 
				sum += 0;  
			}
			else
			{
				sum = a[0];
			}
			
		}
		else
		{
			sum = a[0]+a[1];
		}
	
		 return sum;
	}

	public static void main(String[] args) 
	{
		int [] arr = {11,22};
		int num = FiveDay3.num(arr);
		System.out.println(num);		
	}
}
