package Com.feb19.tasklab;

public class Product {
	private int productId;
	private String productName;

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj instanceof Product) {
			Product p = (Product) obj;

			if (this.productId == p.productId && this.productName.equals(p.productName)) {
				result = true;
				return result;
			} else {
				return false;
			}
		} else {
			System.out.println("check the object, it is different object you inserted");
		}

		return result;

	}

}
