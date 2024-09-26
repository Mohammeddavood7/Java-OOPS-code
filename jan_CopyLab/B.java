package jan_CopyLab;

public class B 
{
	private A a;

	public B(A a) 
	{
		super();
		this.a = a;
	}
	
	public int display()
	{
		return a.show();
		
	}

	@Override
	public String toString() {
		return "B [A=" + display() + "]";
	}
	
	

}
