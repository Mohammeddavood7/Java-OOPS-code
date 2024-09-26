package Com.feb19.tasklab;

public class ELCproduct
{
	public static void main(String[] args)
	{
		Product pdt1 = new Product(111, "fan");
		Product pdt2 = new Product(11,"fan");
		
		Customer cust = new Customer(111, "fan");
		
		boolean equals = pdt1.equals(cust);
		System.out.println(equals);
		
	}

}
