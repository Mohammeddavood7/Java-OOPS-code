package Com.jan26.jan25testquestion;

public class Main
{
     public static void main(String[] args)
     {
		
	
	Employee e = new Employee(1, "scott", 40000, 2000, 3000);
	double calculateTax = TaxUtil.calculateTax(e);
	System.out.println("Tax of employee: "+calculateTax);
	Manager m = new Manager(2, "smith", 10000, 2000, 3000, 1000);
	double calculateTax2 = TaxUtil.calculateTax(m);
	System.out.println("Tax of manager: "+calculateTax2);
	
	Trainer t = new Trainer(3, "warner", 10000, 2000, 3000, 3, 3000);
	double calculateTax3 = TaxUtil.calculateTax(t);
	System.out.println("Tax of trainer: "+calculateTax3);
	Sourcing s = new Sourcing(4, "king", 10000, 2000, 3000, 3, 4, 29999);
	double calculateTax4 = TaxUtil.calculateTax(s);
	System.out.println("Tax of sourcing: "+calculateTax4);
	
	
     }
	
	
	
	
	
}
