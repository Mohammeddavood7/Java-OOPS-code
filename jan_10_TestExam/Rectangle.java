package jan_10_TestExam;

public class Rectangle 
{
	private int length=1;
    private int width=1;
    
	public Rectangle(int lenth ,int width) 
	{
		super();
		this.length = lenth;
		this.width = width;
	}
	
	public int getRectangle()
	{
		return (length*width);
	}
	

	public int getLength() {
		return length;
	}



	@Override
	public String toString() {
		return "Rectangle = "+ getRectangle();
	}
	
	
	
    
    
    
}
