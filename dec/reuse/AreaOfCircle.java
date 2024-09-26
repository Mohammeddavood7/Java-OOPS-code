package dec.reuse;

public class AreaOfCircle {
	public static String getAreaOfCircle(double num) 
	{
		
		if(num<=0)
		{
			return ""+0;			
		}
		else
		{
			final double PI= 3.14;
			return ""+PI*num*num;
			
		}
	}

}
