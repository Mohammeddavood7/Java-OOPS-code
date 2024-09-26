package dec_18;

public class Celsius
{
	public static void main(String[] args)
	{
		System.out.println("Enter the fahrenheits");
		double fehren = Double.parseDouble(args[0]);
		double cel = ((fehren-32)*5)/9;
		System.out.println("Total celsius of body: "+cel);
	}

}
