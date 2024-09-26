package Com.feb04.hiddenclass;
//class A{
//}
//class B extends A{}

class CoVariant 
{
	public Object vehicle()
	{
		//System.out.println("Gerenic Vehicle ");
		return ""+"Gerenic Vehicle";
	}
}

class Bike extends CoVariant
{
	
	public String vehicle()
	{
		//System.out.println("This Bike Enginee is Petrol");
		return ""+"This Bike Enginee is Petrol";
	}
	
}

public class Main
{
	
	public static void main(String[] args) 
	{
//		A a = new B();
//		a.vehicle();
		
		CoVariant cv;
		
		cv = new Bike(); 
		Object vehicle = cv.vehicle();
		System.out.println(vehicle);
	}

}
