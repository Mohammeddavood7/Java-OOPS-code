package Com.march14.test;


@SuppressWarnings("serial")
class InvalidUnitsConsumerException extends Exception
{
	public InvalidUnitsConsumerException()
	{
		super();
	}
	
	public InvalidUnitsConsumerException(String errmsg)
	{
		super(errmsg);
	}
	
}

class ElectricityBill1 
{
	public static double calculate(int ub) throws Exception
	{
		double res = 0;
		if(0 > ub)
		{
			throw new InvalidUnitsConsumerException("bill must be in +ive");
		}
		else if(ub < 100)
		{
			res = 1.50 * ub;
		}
		else if(ub == 100)
		{
			res = 2.0 * ub;
		}
		else if(ub > 200)
		{
			res = 2.0 * ub;
		}
		else if( ub == 0)
		{
			res = 50;
		}
		return res;
	}
}


public class Main 
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			double calculate = ElectricityBill1.calculate(-1);
			System.out.println(calculate);
		}
		catch(InvalidUnitsConsumerException e)
		{
		System.err.println(	e.getMessage());
		}
	}
}
















































































