package has_a_relation_labprogram;


public class MainAddressEmployee 
{
	public static void main(String[] args)
	{
	Address hyd = new Address("hyderabad", "R.r.reddy", "Telangana");
	
	Employee smith = new Employee(111, "smith", hyd);
	
	System.out.println(smith);
	
	}
	
}
