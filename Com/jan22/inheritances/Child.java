package Com.jan22.inheritances;

public class Child extends Parent
{
	public void show()
	{
		super.show();
		System.out.println("Sub class method-1");
		this.display();
	}
	
	public void display()
	{
		System.out.println("Sub class method-2");
	}

}
