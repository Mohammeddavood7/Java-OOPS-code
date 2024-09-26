package Com.jan23_heriachal;

public class Rectangle extends Shape
{
	protected int length;
	public Rectangle(int shape,int length)
	{
		super(shape);
		this.length = length;
	}
	
	public void getRectangleResult()
	{
		double res = length*x;
		System.out.println("Area of the Rectangle: "+res);
	}
}
