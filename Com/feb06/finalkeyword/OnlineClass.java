package Com.feb06.finalkeyword;

sealed class OnlineClassAttend permits Laptop,Mobile
{
	public void onlinceClassAttend()
	{
		System.out.println("Attending on Generic");
		
	}
}

non-sealed class Laptop extends OnlineClassAttend
{
	public void onlinceClassAttend()
	{
		System.out.println("Attending on Laptop");
		
	}

}
non-sealed class Mobile extends OnlineClassAttend
{
	public void OnlinceClassAttend()
	{
		System.out.println("Attending on Mobile");
		
	}

}

//final class Keyboard extends OnlineClassAttend
//{
//	public void onlinceClassAttend()
//	{
//		System.out.println("Attending on Keyboard");
//		
//	}
//
//}

//non-sealed Elephant extends OnlineClassAttend
//{
//	public void onlinceClassAttend()
//	{
//		System.out.println("Attending on Keyboard");
//		
//	}
//}

public class OnlineClass
{
	public static void main(String[] args) {
		OnlineClassAttend oca ;
		oca = new Laptop();
		oca.onlinceClassAttend();
		oca = new Mobile();
		oca.onlinceClassAttend();
//		oca = new Keyboard();
//		oca.onlinceClassAttend();
		
		
	}

}
