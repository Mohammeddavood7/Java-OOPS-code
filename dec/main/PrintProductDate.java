package dec.main;

import java.util.Scanner;

public class PrintProductDate 
{
	int productId;
	String productName;
	double productPrice;
	
    public void setProductDate()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Id of Product: ");
         productId = sc.nextInt();
        System.out.print("Enter the Product Name: ");
         productName = sc.nextLine();
         productName = sc.nextLine();
        System.out.print("Enter the product Price: ");
         productPrice = sc.nextDouble();
         sc.close();
    }
    
    
    public String getProductDate()
    {
    	String result= "";
        result += "ProductId: "+productId+"\nProduct Name: "+productName+"\nProduct Price: "+productPrice;
        return result;
    }
   
	public static void main(String[] args)
	{
		PrintProductDate customer = new PrintProductDate();
		customer.setProductDate();
		String productDate = customer.getProductDate();
		System.out.println("...............Answer/Result...............");
		System.out.println(productDate);
	}
	
}
