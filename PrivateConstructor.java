import java.text.DecimalFormat;

public class PrivateConstructor 
{
	static int num1;
	static int num2;
	PrivateConstructor(int num11, int num22) 
	{
		super();
		  num1 = num11;
		num2 = num22;
	}

	public static int getAdd(int num1,int num2) 
	{
		 return num1+num2;
	}
	public static int getSub(int num1,int num2)
	{
		return num1-num2;
	}
	public static String getDiv(int num1,int num2) 
	{
		
		
		
		int num = num1/num2;
		DecimalFormat dc = new DecimalFormat("00.00");
		return dc.format(num);
	}
	public static int getMul(int num1,int num2)
	{
		return num1*num2;
	}

	
		
}
	
