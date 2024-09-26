package Com.arrays.logicalsection;


public class FiveDay6 
{

	public static boolean num(int a[])
	{
		boolean s = false;
		if(a[0]==2&&a[1]==3||a[0]==3&&a[1]==2)
		{
			s = true;
		}
		return s;
		
	}
	public static void main(String[] args) 
	{
		int [] a = {2,3};
		
		if(FiveDay6.num(a))
		{
			System.out.println("2  or 3 Available");
		}
		else	
		{
			System.out.println("2  or 3 not Available");
		}
		
		
	}
}
