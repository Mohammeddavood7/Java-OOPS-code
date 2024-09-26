package Com.feb21.FunctionPREDEFINED;

import java.util.function.Supplier;

public class SuppilerDemo 
{
	record products(int id,String name)
	{

		
		
	}

	public static void main(String[] args)
	{
	    int val = 88;
		Supplier<Integer> s = () -> val;
		System.out.println(s.get());
		
		Supplier<products> sp = () -> 
		{
			products p = new products(111,"miller");
			return p;
		};
		 System.out.println(sp.get());
	}
}
