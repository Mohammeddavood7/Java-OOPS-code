package Com.feb04.hiddenclass;

class Super
{
	String name = "Krishna Kumar";
	protected void fly()
	{
		System.out.println("Generic fly");
	}
}
	
class Sub extends Super
{
	String name = "Ravi Shankar";
	 @Override
	 public void fly()
	 {
		System.out.println("Sub is fly");
		 
	 }
}

public class Shadow
{
   
	public static void main(String[] args) 
	{
		Super sp;
		sp = new Sub();
		
		//Sub s = new Sub();
		 sp.fly();
		System.out.println(sp.name+" ");
	}
}