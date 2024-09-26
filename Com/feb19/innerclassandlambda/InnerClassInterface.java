package Com.feb19.innerclassandlambda;

interface Super1
{
    void show();
}

public class InnerClassInterface 
{
	public static void main(String[] args)
	{
		Super1 sub = new Super1()
	    {
			@SuppressWarnings("unused")
			public void display()
			{
				System.out.println("display method is executed");
			}

			@Override
			public void show()
			{
                 		System.out.println("show method is executed");		
			}
		};
		sub.show();
		
	}
}
