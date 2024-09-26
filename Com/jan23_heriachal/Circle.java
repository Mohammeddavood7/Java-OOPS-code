package Com.jan23_heriachal;

public class Circle extends Shape 
{
    public Circle(int shape)
    {
     super(shape);
    }
    public void getCircleRadius()
    {
    	final double PI = 3.14;
    	double radius = PI*(x*x);
    	System.out.println("Radius of the Circle: "+radius);
    	
    }
}
