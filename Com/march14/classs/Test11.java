package Com.march14.classs;

//public class Test11 
//{
/*int x = 10;

public static void operation(int a, int b)
{
    int res;
    try
    {
        if (a < 0 && b < 0) 
        {
            throw new IllegalArgumentException();
        } 
        else 
        {
            res = a / b;
            //System.out.println(res);
        }
    }
    catch (Exception e) 
    {
        System.out.println("catch executed");
        System.out.println(e.getMessage());
                    System.exit(0);
    }
    finally 
    {
        System.out.println("finally executed");
    }
}
	*/
	
	/*public static void main(String[] args)
	{
		try 
		{
			int[] arr = new int[5];
			int value = arr[10];
			
		} 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Caught!");
	     } */
	

//}

//}

	
/*class A
{
		public void m1() throws ArithmeticException
		{
		   System.out.println("hello");
		}
		public void m2()throws Exception
		{
		   System.out.println("hi");
		}
	}
class B extends A
		{
		@Override
		public void m1() throws NullPointerException
		{
		   System.out.println("B class m1 method");
		}
		@Override
		public void m2() throws Exception
		{
		   System.out.println("B class m2 method");
		}
		}
public class Test11
{
		public static void main(String[] args)
		{
			A a=new B();
			a.m1();
			try 
			{
			  a.m2();
			} 
			catch (Exception e)
			{
				e.printStackTrace();
		     }
		}
}
*/

/*public class Test11 {
public static void main(String[] args) throws IOException
{
  System.out.println(m1());
  m2();
}

public static String m1() throws IOException {
    return "m1() executed";
}

public static String m2() {
    return "m2() executed";
}
}*/


/*public class Test {

public static void main(String[] args) {

    int x;
    try {
        x = 10 / 0;
        System.out.println(x+10);
    } catch (Exception e) {
        e.printStackTrace();
    }

    catch (ArithmeticException e) {
        System.out.println("/ by zero");
    }
}
}*/

/*public class Test11 {

public static void main(String[] args) {

    try 
    {
        int x = 10 / 0;
    } 
    catch (ArithmeticException e)
    {
    	
        int x = 10 / 0;
        System.out.println(x);
    }
    catch (Exception e)
    {
        System.out.println("Welcome");
    }

}
}
*/


/*public class Test11
{
int x = 10;
	void display()
	{
	  System.out.println("display()");
	}

	public static void main(String[] args) 
	{
	
	    Test11 t = null;
	    try 
	    {
	        System.out.println(t.x);
	        System.out.println("try executed");
	    } 
	    catch (NullPointerException e)
	    {
	        t = new Test11();
	        t.display();
	    }
	}
}*/


/*public class Test11
{
	public static void main(String[] args)
	{
		try 
		{
		   methodA();
		} 
		catch (NullPointerException e)
		{
		System.out.println("NullPointerException caught");
		} 
		catch (Exception e)
		{
		System.out.println("Exception caught");
		}
	}

static void methodA() 
{
    try 
    {
        methodB();
    } 
    catch (ArithmeticException e)
    {
        System.out.println("ArithmeticException caught");
    } 
    catch (Exception e)
    {
        System.out.println("Exception caught in methodA");
    }
}

	static void methodB()
	{
	    throw new NullPointerException();
	}
}
*/

/*public class Test11 
{

public static void main(String[] args) 
{
    try 
    {
        System.out.println(10 / 0);
    }
    catch (IOException e)
    {
        System.err.println(e);
        System.exit(0);
    } 
    finally
    {
        System.out.println("finally");
    }
}
}
*/








































