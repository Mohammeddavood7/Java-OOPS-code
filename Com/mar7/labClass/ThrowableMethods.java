package Com.mar7.labClass;

public class ThrowableMethods
{
	public static void main(String[] args)
	{
		try
		{
			String str  = "one";
			int num = Integer.parseInt(str);
			System.out.println("Result: "+num);
			
//			Exception e =  new ArithmeticException("please don't take alphabet name as number");
//			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
//			System.out.println(".......................");
//			e.printStackTrace();
//			System.out.println("..................................");
//			System.out.println(e.getMessage());
//			System.out.println("...................................");
//			System.out.println(e.toString());
			System.out.println(e);
		}
	}

}
