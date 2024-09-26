package Com.arrays.logicalsection;

import java.util.Arrays;

public class FiveDay5 
{
	public static int[] num(int []a)
	{
		int res[] = new int[] {a[0],a[2]};
		return res;
	}
	
	
	
	public static void main(String[] args) 
	{
		int [] a = {1,2,3};
		
		int [] num1 = FiveDay5.num(a);
		System.out.println(Arrays.toString(num1));
		
		
	}
}

