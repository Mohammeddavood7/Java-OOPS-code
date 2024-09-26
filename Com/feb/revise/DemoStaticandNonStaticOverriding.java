package Com.feb.revise;

class Parent
{
	Parent()
	{
		super();
	}
	public static void behavior()
	{
		
		System.out.println("behavior is printing");
	}
}
 
class Son extends Parent
{
	public void behavior()      
	{
		System.out.println("son behavior");    
	}
}

public class DemoStaticandNonStaticOverriding
{
public static void main(String[] args)
{
	Parent p = new Son();
	
	//p.behavior();
	
	Son s = new Son();
	s.behavior();
	
	
}
}








































































