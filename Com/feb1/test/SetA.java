package Com.feb1.test;

public class SetA 
{
	
	public double calculate(double a,double b)
	{
		return a+b;
	}
	
	public int calculate(int a,int b)
	{
		return a-b;
	}
	
	
	public double calculate(double a,double b)
	{
		return a*b;
	}
	
	public int calculate(int a,int b)
	{
		return a/b;
	}
	
	public static void main(String[] args)
	{ 
		SetA s = new SetA();
		   
		double d1 = s.calculate(10.5, 5.5);
		
		System.out.println(d1);
		
		int t1 = s.calculate(20, 10);
		
		System.out.println(t1);
		
		double d2 = s.calculate(30.0, 30.0);
		
		System.out.println(d2);
		
		int t2 = s.calculate(4, 2);
		
		System.out.println(t2);
		
	}
	

}


