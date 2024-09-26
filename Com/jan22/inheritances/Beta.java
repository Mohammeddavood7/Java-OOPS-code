package Com.jan22.inheritances;

public class Beta extends Alpha
{
   protected int balance = 20000;
   public Beta()
   {
	   System.out.println("Sub class value : "+balance);
	   System.out.println("Super class value :"+super.balance);
   }
}
