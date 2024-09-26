package Com.feb19.innerclassandlambda;

@FunctionalInterface
interface Alpha
{
	void run();
	//void running();
	

}

public class InnerClasswithLAMBDA
{
	public static void main(String[] args)
	{
		Alpha a = () -> System.out.println("bus is running");
		a.run();
		
	}
}



//new Alpha()
//{
//	public void run()
//	{
//		System.out.println("peacock is running");
//	}
//	
//};