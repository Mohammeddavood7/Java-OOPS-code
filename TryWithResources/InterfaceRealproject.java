package TryWithResources;

public class InterfaceRealproject 
{
	public static void main(String[] args) throws Exception
	{
		@SuppressWarnings("deprecation")
		Object obj = Class.forName(args[0]).newInstance();
		
		if(obj instanceof Addition)
		{
			Addition a = (Addition)obj;
			a.setN1(6);
			a.setN2(5);
			System.out.println("Addition of 2Numbers: "+a.calculat());
		}
		else if(obj instanceof Multiplication)
		{
			Multiplication  m = (Multiplication)obj;
			m.setN1(6);
			m.setN2(5);
			System.out.println("Multiplication of 2Numbers: "+m.calculat());
		}
		else
		{
			System.out.println("invalid class...");
		}
		
	}

}




















































