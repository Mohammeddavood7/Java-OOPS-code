package Com.feb19.innerclassandlambda;

abstract class MainInnerClass
{
	public void display()
	{
		//System.out.println();
		
	}

}

public class InnerclassAbstract extends MainInnerClass
{
	public static void main(String[] args) 
	{
		MainInnerClass mic = new MainInnerClass()
		{
			public void display()
			{
				System.out.println("display 1");
			}
			
			
		};
		mic.display();  
		
		MainInnerClass mic2 = new MainInnerClass()
		{
			public void display()
			{
				System.out.println("display 2");
			}
			
		};
		mic2.display();
		
		
	}
}





















































