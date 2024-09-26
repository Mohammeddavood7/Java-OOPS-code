package Com.feb13.abstraction;

abstract class Shape
{
	public abstract void show();
	public abstract void demo();
	
}

abstract class Rectangle extends Shape
{
	@Override
	public void show()
	{
		System.out.println("Show method is invoked ");
	}
	
}

class Cylinder extends Rectangle
{
//	@Override
//	public void show()
//	{
//		System.out.println("Show method is invoked ");
//	}
//	
	
	@Override
	public void demo()
	{
		System.out.println("demo method is invoked ");
	}
}

//class Circle extends Shape
//{
//   @Override
//   public void show()
//   {
//	   System.out.println("Show method is invoked in circle");
//   }
//   
//   @Override
//   public void demo()
//   {
//	   System.out.println("demo method id invoked in Circle");
//   }
//	
//}


public class DemoAbstraction 
{
	
	public static void main(String[] args)
	{
		Shape s = null;
		s = new Cylinder(); s.demo(); s.show();
		
	}
	
}




























