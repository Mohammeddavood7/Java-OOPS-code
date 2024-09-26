package Com.march12.classCheckednUnchecked;

class Super1
{
	public void m2() //throws NumberFormatException
	{
		System.out.println();
	}

}
class Sub1 extends Super1
{
	@Override
	public void m2() throws ArithmeticException
	{
		System.out.println(10/0);
	}
}
public class OverridingunCheckedException 
{
	public static void main(String[] args) 
	{
		Super1 s1 =  new Sub1();
		try 
		{
			s1.m2();
		}
		catch(ArithmeticException e)
		{
			System.err.println("divided zero is not possible...");
		}
		
		
	}
}




























