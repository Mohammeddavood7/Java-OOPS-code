package dec.main;

public class CopyOfInstanceVariable 
{
	static int a= 10;
	int x =10;
	
	public static void main(String[] args)
	{
		CopyOfInstanceVariable copy1 = new CopyOfInstanceVariable();//one copy instance variable created
		CopyOfInstanceVariable copy2 = new CopyOfInstanceVariable();//one copy instancce variable created
		   
		++copy1.x;     --copy2.x;   
		System.out.println(copy1.x);//11
	    System.out.println(copy2.x);//9
		
	    ++a; --a;
		System.out.println(a);
		System.out.println(a);
		
	}

}
