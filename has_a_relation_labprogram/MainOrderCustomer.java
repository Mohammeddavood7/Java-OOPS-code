package has_a_relation_labprogram;

public class MainOrderCustomer 
{

		public static void main(String[] args)
		{
			Order or = new Order(111, "Biryani", 230.4);
			or.setItemPrice(299);
			Customer c1 = new Customer(101, "smith", "hyderabad", or);
			System.out.println(c1);
			
		}
}
