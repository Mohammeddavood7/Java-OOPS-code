package Com.feb17.interfaces;


//class A
//{
//	public void m1()
//	{
//		System.out.println("class A method");
//	}
//}
//class B extends A
//{
//	public void m1() 
//	{
//		
//		System.out.println("class B method");
//
//	}
//}
//
//class D extends B
//{
//	
//}
//
//
//
//public class demo17
//{
//		  public static void main(String[] args)
//		  {
//			  D d = new D();
//			  d.m1();
//		  }
//}



interface Vechicle
{
	void run();
}

interface BatterySuper extends Vechicle
{
	void battery();
}
class BatterySub extends Car implements BatterySuper
{
	
	public void battery()
	{
		System.out.println("Battery is added to Car");
	}
}



class Car implements Vechicle
{
	public void run()
	{
		System.out.println("Car is runninng");
	}
}

class Bike implements Vechicle
{
	public void run()
	{
		System.out.println("Bike is running");
	}
}


public class demo17
{
	public static void main(String[] args)
	{
		Vechicle v = null;
		BatterySub bs = new BatterySub();
		bs.run();
		bs.battery();
		v = new Bike();
		v.run();
	    
		
	}
}































