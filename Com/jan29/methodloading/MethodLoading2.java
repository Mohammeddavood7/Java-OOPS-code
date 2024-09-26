package Com.jan29.methodloading;

public class MethodLoading2 
{
	
	public static double Area(double side)
	{
		return side*side;
		
	}
	
	public static double Area(double len,double wid)
	{
		return len*wid;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Area of the Square: "+MethodLoading2.Area(5));
		System.out.println("Area of the Rectangle: "+MethodLoading2.Area(4, 3));
		
	}

}
