package dec.main;

public class CreateObjectOnDinner 
{
	String name,address;
	String []itemNames = {"Biryani","Coke","WaterBottle","StarCodes"};
	int []price = {300,50,50,200};
	
	public String getAddress()//String name,String address
	{
		String result ="";
		return result += "Name of the Resturent: "+name+"\nAddress of the Resturent: "+address;
	}
	public double getPrice()
	{
		double result=0;
	    
	    for(int bill:price)
	    {
	    	result += bill;
	    }
		return result;
	}
	public String getTotalDetailOnDinner()
	{
		String result = "";
		for(String itemName : itemNames )
		{
		    result += itemName+"\n";
		}
		return result;
	}
	
	
    public static void main(String[] args) 
    {
    	CreateObjectOnDinner dinner = new CreateObjectOnDinner();
    	dinner.name = "Captain Cook";
    	dinner.address="Hyderad, GachiBoli Road Number 5";
    	String result = dinner.getAddress();//dinner.name,dinner.address
    	System.out.println(result);
    	double price2 = dinner.getPrice();
    	String totalDetailOnDinner = dinner.getTotalDetailOnDinner();
    	System.out.println("Total price: "+price2);
    	System.out.println("Number of items: ");
    	System.out.println(totalDetailOnDinner);
		
	}

}
