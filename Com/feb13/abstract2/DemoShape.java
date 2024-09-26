package Com.feb13.abstract2;

abstract class Shape
{
private int x;


	public Shape(int x) {
		super();
		this.x = x;
	}
	public abstract double area();

		public int getX() {
			return x;
		}
}

class Rectangle extends Shape
{
	private int breadth;

	public Rectangle(int length, int breadth) {
		super(length);
		this.breadth = breadth;
	}
	
	public double area()
	{
	    double result = super.getX()*breadth;
		System.out.print("Area of Rectangle: ");

	    return result;
		
	}
}

class Square extends Shape
{
	public Square(int side)
	{
		super(side);
		
	}
	
	public double area()
	{
		System.out.print("Area of Square: ");

		return getX()*getX();
	}
}


class Circle extends Shape
{
	final double PI = 3.14;
	public Circle(int side)
	{
		super(side);
		
	}
	
	
	public double area()
	{
		System.out.print("Area of circle: ");
		return PI*(getX()*getX());
		
	}
}


public  class DemoShape 
{
	
	public static void main(String[] args) 
	{
		Shape s = null;
		s = new Rectangle(5, 9); System.out.println(s.area()); 
		s = new Square(40); System.out.println(s.area()); 
		s = new Circle(9); System.out.println(s.area());  
		
		
	}

}

