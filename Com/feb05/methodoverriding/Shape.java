package Com.feb05.methodoverriding;

class Shape 
{
	
	public static Shape randshape()
	{
		int randome = (int) (Math.random()*3);
		switch(randome) 
		{
		case 0: return new Circle(); 
		
		case 1: return new Square(); 
		
		case 2: return new Triangle(); 
		
        default : System.out.println("Please enter 0-2 elements only");
		}
		
		return null;
	}
	
	public void draw()
	{
		System.out.println("Shape draw");
	}
	
	public void erase()
	{
		System.out.println("Shape erase");

	}
	
}
class Circle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Circle draw");
	}
	@Override
	public void erase()
	{
		System.out.println("Circle erase");

	}
	
}

class Triangle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Triangle draw");
	}
	@Override
	public void erase()
	{
		System.out.println("Triangle erase");

	}
}

class Square extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Square draw");

	}
	@Override
	public void erase()
	{
		System.out.println("Square erase");

	}
	
}

