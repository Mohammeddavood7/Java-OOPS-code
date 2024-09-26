package Com.feb13.abstraction;

abstract class Book
{
	protected String title;
	

	public abstract void setTitle(String title);

	public abstract String getTitle();

}
class MyBook extends Book
{
	@Override
	public void setTitle(String title)
	{
		super.title = title;
	}
	
	@Override
	public String getTitle()
	{
		return super.title;
	}
	
}


public class Testing
{
	public static void main(String[] args)
	{
		Book b  = null ;
		b = new MyBook();
		b.setTitle("A tale of two cities");
		String title = b.getTitle();
		System.out.println(title);
		
	}
}
   
























