package Com.jan29.methodloading;

public class MethodLoading 
{
	public void m1(int a,char c)
	{
		System.out.println("a :"+a+", c :"+c);
		
	}
	
	public void m1(char c,int a)
	{
		System.out.println("c :"+c+", a :"+a);
	}
	
	public static void main(String [] args)
	{
		MethodLoading t = new MethodLoading();
		
		t.m1(66, 'A');
		t.m1('B', 67);
		
	}

}
