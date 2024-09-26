package has_a_relation_labprogram;

public class Customer 
{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private Order order;
	
	
	public Customer(int customerId, String customerName, String customerAddress, Order order) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.order = order;
	}

	public String usePrice()
	{
	  if(order.getItemPrice()<=0)
	  {
     System.err.println("Price must in positive values !!!");
	  }
	  else
	  {
		  return ""+order.getItemPrice();
	  }
	  return ""+0;
	}
     

	@Override
	public String toString()
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", order=" + order +"itemPrice: "+usePrice()+"]";
	}
	
	

	
	
	
	
	

}
