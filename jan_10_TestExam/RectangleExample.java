package jan_10_TestExam;

public class RectangleExample 
{

	private double length = 1;
	private double width = 1;
	private String a;
	private String b;
	
	public RectangleExample(int length,int width)
	{
		this.length = length;
		this.width = width;
	}
	public RectangleExample(String recName,String recColor)
	{
		this.a = recName;
	     this.b = recColor;
		
		
	}
	
	public String toString()
	{
		return ""+"width = "+width+",  length = "+length+"\n"+"recName = "+a+",  recColor = "+b;
	}
	
	

	
	
	
	
}
