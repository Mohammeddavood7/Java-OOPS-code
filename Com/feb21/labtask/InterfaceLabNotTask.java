package Com.feb21.labtask;


 interface Super
 {
	 void show();
	 void display();
	 void view();
	
 }
 interface Sub extends Super
 {
	 void details();
 }
 
 class implementions implements Sub
 {

	@Override
	public void details()
	{
		System.out.println("hello");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

	 
 }

 
 interface MAINTAIN extends Super
 {
	 void maintain();
 }
 
 class maintaining extends implementions implements MAINTAIN
 {
	 @Override
	 public void maintain()
	 {
		 System.out.println("maintaining");
	 }
	 
 }


public class InterfaceLabNotTask
{

   public static void main(String []args)
   {
	   maintaining ext = new maintaining();
	   ext.show();
	   ext.details();
	   ext.display();
	   ext.view();
	   ext.maintain();
   }
}









































