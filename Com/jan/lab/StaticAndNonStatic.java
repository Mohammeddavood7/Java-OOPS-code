package Com.jan.lab;

public class StaticAndNonStatic 
{
	static int a = 10;//  1sto/p  // static first assign (0 is default values of integer 0)0->10;
	
	{
		System.out.println("1st non-static"); //non-static ---1st o/p
	}
	
	static
	{
		System.out.println("1st static");//2nd o/p(compiler will show this output)
	}
	int b = 1; // non-static assign

	static void m1()//even it is static ,but it is method,i.e when is method called,it show by compiler
	{
		System.out.println("m1 output");
	}
	
	void m2()//non-static method,when method is called that it will show o/p otherwise not shown
	{
		System.out.println("m2 output");
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("output from main");//4th o/p
		StaticAndNonStatic obj = new StaticAndNonStatic();
		System.out.println(obj);//garbage
	   
		
	}
	
	static
	{
		System.out.println("2nd static ");//3rd o/p
	}
	
	{
		System.out.println("2nd non static");//3rd o/p
	}

}
