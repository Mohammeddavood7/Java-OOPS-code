package Com.march8.stacticMcqs;



public class Test111 
{
	public static void main(String[] args) 
	{
		System.out.println(Test111.class.getClassLoader()); //to string invoke of getClassLoader();
		
		ClassLoader test = Test111.class.getClassLoader();
		Class name = Test111.class;
		System.out.println(name);
		System.out.println(Test111.class.getClassLoader().getParent());//platForm OR Extension class loader
		System.out.println(Test111.class.getClassLoader().getParent().getParent()); //null
		
	}
}