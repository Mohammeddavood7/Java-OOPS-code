package dec.reuse;

public class EvenOrOdd {
	public static String isEven(int num)
	{
		String valid ="",notValid="";
		if(num<=0)
		{
			return ""+1;
		}
		else if(num%2==0)
		{
		  valid = "It is Even Number.";	
		}
		else
		{
			notValid ="It is Odd Number";
		}
		return valid+notValid;
		
	}

}
