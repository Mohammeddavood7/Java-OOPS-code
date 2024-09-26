package Com.SingleLevel.Inheritance;

public class Son extends Father 
{
	public Son()
	{
		
		super(100, 200);
	}

	@Override
	public String toString() {
		return "Son [x=" + x + ", y=" + y + "]";
	}
	
	
	

}
