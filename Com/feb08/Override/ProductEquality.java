package Com.feb08.Override;

public class ProductEquality 
{
	public static void main(String[] args)
	{
		
		Product pt = new Product(111, "potato");
		Product pt1 = new Product(222, "tamoto");
		Product pt3 = new Product(222,"tamoto");
		
		boolean equals = pt1.equals(pt3);
		System.out.println(equals);
		
//		System.out.println(pt.hashCode());
//		System.out.println(pt1.hashCode());
		
	}

}
