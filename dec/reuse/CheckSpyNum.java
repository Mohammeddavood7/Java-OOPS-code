package dec.reuse;


public class CheckSpyNum 
{
	public static void getSpyNumber(int num)
	{
		 int originalNum = num; 
		
		int sum=0,mul=1;
		while(num>0)
		{
			
			 int num1 = num%10;
			 sum += num1;
			 mul *= num1;
			 num/=10;
			
		}
		
		if(sum==mul)
		{
			System.out.println(originalNum+" = yes!! It is Spy Number.");
		}
		else
		{
			System.out.println(originalNum+" =  No!! It is not Spy Number.");
		}
	}

}
