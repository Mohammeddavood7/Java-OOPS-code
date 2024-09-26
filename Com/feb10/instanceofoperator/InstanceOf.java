package Com.feb10.instanceofoperator;

public class InstanceOf 
{

	public static void main(String[] args)
	{
		String str = "DELHI";
		
		if(str instanceof Object)
		{
			System.out.println("it belongs to String class");
		}
		else {
			System.out.println("it not belongs to String class");
		}
		
		String str1 = "Hyderabad";
		
		if(str1 instanceof Object)
		{
			System.out.println("it belongs to String class");
		}
		else {
			System.out.println("it  belongs to BufferSting class");
		}


		
		
		Integer i = 133;
		if(i instanceof Object)
		{
			System.out.println("it belongs to Integer class");
		}
		else {
			System.out.println("it not  belongs to Integer class");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
