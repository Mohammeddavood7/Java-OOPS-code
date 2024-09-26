package Com.feb05.methodoverriding;

class GeometricShape
{
	String shapeType;
	double area;
	
	public GeometricShape()
	{
		this.shapeType = "Square Shape";
		this.area = 0.0;
	}
	
	public double computeArea(double val1 ,double val2)
	{
		return this.area=val1*val2;
	}
	
	public String show()
	{
		return "Shape of the Geometric Shape : "+shapeType+" Area of the shape: "+area;
	}

}
class Rectangle extends GeometricShape
{
	
	private double width;
	private double length;
	public Rectangle() 
	{
		super();
		this.width = 10;
		this.length = 10;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	 @Override
	public double computeArea(double width,double length)
	{
		 this.width = width;
		 this.length = length;
		return width*length;
		
	}
	 @Override
	 public String show()
	 {
		 return "width : "+width+" length :"+length+" Area of rectangle: "+computeArea(width,length);
	 }
	
}

class Cuboid extends Rectangle
{
	
   private double height ;
   //private double area;

	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
   
  	
   public double computerArea(double height,double width,double length)
   {
	  
	   return  2*(this.height+super.computeArea(width, length));
   }
   
   @Override
   public String show()
   {
	   return (("Height: "+this.height+" Breadth: "+super.getWidth()+" Length: "+super.getLength()+" Area of cuboid: "+computerArea(height,getWidth(),getLength())));
   }

public Cuboid() {
	super();
	this.height = 15;
}
}

class Test
{
	private Rectangle rectangle;
	private Cuboid cuboid;
	public Test(Rectangle rec,Cuboid cub) {
		super();
		this.rectangle = rec;
		this.cuboid = cub;
		
	}
    
	public String display()
	{
		return rectangle.show()+"\n"+cuboid.show();
	}
	
	
}

public class OverrideProgram01 
{
	public static void main(String[] args)
	{
		
		
		GeometricShape gs = new Rectangle();
        gs.computeArea(10, 10);
		Cuboid cub = new Cuboid();
		cub.computerArea(10,10,20); 
		Test t = new Test(new Rectangle(),cub);
		String display = t.display();
		System.out.println(display);
		
		
		
		
		
		
	}
}

























