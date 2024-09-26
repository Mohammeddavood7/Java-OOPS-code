package Com.jan_25_lab;

public class Main 
{
	public static void main(String[] args)
	{
		DayScholar ds = new DayScholar(111, "Smith", 3000, 3000);
		double payFee = ds.payFee(10000);
		System.out.println(payFee);
		System.out.println(ds.displayDetails());
	}

}
