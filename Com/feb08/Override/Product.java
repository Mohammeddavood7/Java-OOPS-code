package Com.feb08.Override;

public class Product
{
	private int productId;
	private String productName;

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	@Override
	public boolean equals(Object obj)
	{
		Product p = (Product) obj;
		
		if (this.productId == p.productId && this.productName ==p.productName) {
			return true;
		}

		return false;

	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

}
