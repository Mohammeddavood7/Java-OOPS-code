package Com.jan26.jan25testquestion;

public class TaxUtil
{

	public static  double calculateTax(Employee e)
	{
		 double calculateGrossSalary = e.calculateGrossSalary();
		 
		 if(calculateGrossSalary > 30000)
		 {
			 return calculateGrossSalary*20/100;
		 }
		 else
		 {
			 return calculateGrossSalary*5/100;
		 }
		 
	}
	
	public static double calculateTax(Manager m)
	{
		 double calculateGrossSalary = m.calculateGrossSalary();
		 
		 if(calculateGrossSalary > 30000)
		 {
			 return calculateGrossSalary*20/100;
		 }
		 else
		 {
			 return calculateGrossSalary*5/100;
		 }
		 
	}
	
	public static double calculateTax(Trainer t)
	{
	   double calculateGrossSalary = t.calculateGrossSalary();
	   if(calculateGrossSalary > 30000)
	   {
		   return calculateGrossSalary*20/100;
	   }
	   else
	   {
		   return calculateGrossSalary*5/100;
	   }
		
	}
	
	public static double calculateTax(Sourcing s)
	{
		double calculateGrossSalary = s.calculateGrossSalary();
		
		if(calculateGrossSalary > 30000)
		   {
			   return calculateGrossSalary*20/100;
		   }
		   else
		   {
			   return calculateGrossSalary*5/100;
		   }
	}
}
