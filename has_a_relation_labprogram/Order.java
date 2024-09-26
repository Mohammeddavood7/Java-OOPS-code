package has_a_relation_labprogram;

public class Order
{
	private int orderId;
	private String itemName;
	private double itemPrice;
	
	
	public Order(int orderId, String itemName, double itemPrice) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
     
	public double getItemPrice()
	{
		return itemPrice;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + "]";
	}
	
	
	

}
