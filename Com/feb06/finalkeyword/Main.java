package Com.feb06.finalkeyword;

sealed class Bird permits Parrot,Peacock
{

	public void fly()
	{
		System.out.println("Generic bird fly");
	}
}

non-sealed class Parrot extends Bird
{
	@Override
   public void fly()
   {
	   System.out.println("Parrot bird flying ");
   }
	
}
final class Peacock extends Bird
{
	@Override
	public void fly()
	{
		System.out.println("Peacock bird flying ");
	}
}


public class Main
{
	public static void main(String[] args) {
		Bird b;
		b = new Parrot(); b.fly();
		b = new Peacock(); b.fly();
				
	}
	
	
}