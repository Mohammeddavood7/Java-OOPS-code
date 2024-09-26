package Com.jan_lab;

public class ElcMain
{
    public static void main(String[] args)
    {
    	
        DayScholar ds = new DayScholar(111, "Scott", 25000, 25000);
        System.out.println(ds);
        System.out.println(ds.displayDetails());
         double payFee = ds.payFee(42000);
         
         double pf =  payFee - ds.getTransportFee();
         System.out.println(ds);
         if(pf > 0)
         {
        	 System.out.println("Remaining amount to pay : "+pf);
         }
         else
         {
        	 System.out.println("You Paid Extra,You will get amount back: "+(-pf));
         }
         
         Hosteller h = new Hosteller(111, "Scott", 25000, 8000);
        
         System.out.println(h);
         
		
	}
}
