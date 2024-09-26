package Com.mar7.examTest;

abstract class Enginee
{
	public abstract void model();
}

class MockSuccess extends Enginee
{

	@Override
	public void model() 
	{
		
		System.out.println("Mock success");
	}
		
}


class MockFail extends Enginee
{

	@Override
	public void model() 
	{
		System.out.println("MockFail&Retrive the car");
	}
		
}

class MockServicing extends Enginee
{

	@Override
	public void model() 
	{
		System.out.println("Mock servicing the car");
	}
		
}

class Car
{
	Enginee e;
	public Car(Enginee e)
	{
		this.e = e;
	}
	
	public void drive(int num)
	{
		 e.model();
		 //System.out.println(model);
		
		
	}
	
	
	
}



public class Composition
{
	public static void main(String[] args)
	{
		Car car1 = new Car(new MockSuccess());
		Car car2 = new Car(new MockFail());
		Car car3 = new Car(new MockServicing());
		
	    car1.drive(3);
	    car2.drive(3);
	    car3.drive(3);
				
				
	}

}












































