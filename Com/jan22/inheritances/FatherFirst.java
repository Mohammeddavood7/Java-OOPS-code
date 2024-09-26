package Com.jan22.inheritances;

public class FatherFirst
{
	public FatherFirst()
	{
		this("ravi");
	   System.out.println("Super class constructor.");	
	}
	
	public FatherFirst(String name)
	{
		System.out.println("Super class : "+name);
	}
}
