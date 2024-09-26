package Com.jan23_heriachal;

class CodeCircle
{
	 protected double radius;


	CodeCircle(double radius)
	{
	    this.radius = radius;
	}
	
	
	public double getArea()
	{
		return 3.14*(radius*radius);
	}
}


class Cylinder extends CodeCircle
{
   private double height;
   
	Cylinder(double radius , double height)
	{
	    super(radius);
	    this.height = height;
		
	}
	
	
	public double getVolume() {
		
		
		return 3.14*(radius*radius)*height;
	}
}
public class ShapeTester
{

	public static void main(String[] args)
	{
	    Cylinder c = new Cylinder(5, 5);
	  
	    System.out.println("Area of the Circle: "+c.getArea());
	  
	    if(c.getVolume() < 0)
	    {
	        System.out.println("-1");
	    }
	    else
	    {
	        System.out.println("Volume of the Cylinder: "+c.getVolume());
	    }
		
	
	}

}

