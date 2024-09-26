package Com.feb19.tasklab;

import java.util.Objects;

public class Customer
{
	  private int productId;
	  private String productName;
  
	public Customer(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}

	
	public int getProductId()
	{
		return productId;
	}
	

	public String getProductName()
	{
		return productName;
	}

//
//	@Override
//	public int hashCode() {
//		return Objects.hash(productId, productName);
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Customer other = (Customer) obj;
//		return productId == other.productId && Objects.equals(productName, other.productName);
//	}
//	  
//     
//	
	
	
	
}












































































