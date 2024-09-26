package Com.feb14.task;


abstract class Shape
{
	protected double x;
	public Shape(double x)
	{
		this.x = x;
	}
	public abstract double getArea();
	
	public abstract String printDetails();
}


class Rectangle extends Shape
{
	private double breadth;
	public Rectangle(double x, double breadth) {
		super(x);
		this.breadth = breadth;
	}

	

	@Override
	public double getArea()
	{   
		
		return x*breadth;
	}
	
	@Override
	public String printDetails()
	{
		return "Type= Rectangle \n"+
				"Length= " +x+
				"\nBreadth= " +breadth+
				"\nArea= " +getArea();
	}
}



public class TestingShape
{
	public static void main(String[] args) 
	{
		Shape s  =  null;
		s = new Rectangle(30.3, 45.4);
		String printDetails = s.printDetails();
		System.out.println(printDetails);
		
	}

}






































