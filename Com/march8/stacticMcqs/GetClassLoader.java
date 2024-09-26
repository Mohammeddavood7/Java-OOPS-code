package Com.march8.stacticMcqs;

public class GetClassLoader 
{
	
		
			public static void main(String[] args) 
			{
				ClassLoader loader = GetClassLoader.class.getClassLoader();
				Class<GetClassLoader> cls = GetClassLoader.class;
				System.out.println(cls);
				System.out.println("Demo .class is loaded by :"+loader);

				System.out.println("Demo .class is loaded by :"+loader.getParent());
				System.out.println("Demo .class is loaded by :"+loader.getParent().getParent());

			}
		

	

}
