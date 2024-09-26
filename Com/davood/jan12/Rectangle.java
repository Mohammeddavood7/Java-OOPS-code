package Com.davood.jan12;

public class Rectangle
{
	private double width;
	private double height;
	
	{
		width = 0.0;
		height = 0.0;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		return width*height;
	}

	public double getParimeter()
	{
	
		return (width+height)*2;
	}
	
	

}
