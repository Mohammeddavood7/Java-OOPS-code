package Com.feb15.interfacee;

interface Calculator
{
	void doSum(int a,int b);
	
	void doMul(int a,int b);
	
	void doDiv(int a,int b);
}

class Calci implements Calculator
{

	@Override
	public void doSum(int a, int b)
	{
		
		System.out.println("Sum of the two numbers: "+(a+b));
	}

	@Override
	public void doMul(int a, int b) 
	{
		
		System.out.println("Multiplication of the two number: "+(a*b));
	}

	@Override
	public void doDiv(int a, int b) 
	{
		if(a < 0)
		{
			System.out.println("Division number should be in positive.");
		}
		else 
		{
			System.out.println("Multiplication of the two number: "+(a/b));
		}
		
	}

}
public class TestingCalculator
{
	public static void main(String[] args)
	{
		Calculator calculator;
		calculator = new Calci();
		calculator.doSum(100, 50);
		calculator.doMul(9, 9);
		calculator.doDiv(9, 0);
		
	}
}















































































