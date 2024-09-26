package Com.jan29.methodloading;

public class MethodLoading4
{
	// int - > b , s , c
	// long -> i , b, s, c
	// byte - > b 
	// s -> b s
	
//	public int printNumber(int x)
//	{
//		System.out.println("Int :");
//		return x;
//	}
	
	public short printNumber(Short x)
	{
	    System.out.print("Short: ");
		return x;
	}
     public long printNumber(long x)
     { int y=0;
    	 System.out.print("long ");
    	 return y+x;
     }
	
	public static byte printNumber(byte x)
	{
		System.out.print("static byte: ");
		return  x;
	}
	
//	public int printNumber(byte x)
//	{
//		System.out.print("non static byte: ");
//		return x;
//	}
//	
	
	
	
//	public double printNumber(double x)
//	{
//		System.out.print("double: ");
//		return x;
//	}
	
	public static void main(String []args)
	{
		MethodLoading4 m = new MethodLoading4();
		//long f = 'c';
	     
		//new Short((short) 10);
	    //System.out.println(m.printNumber(new Short((short)5)));
		
		// m.printNumber(20);
      //System.out.println(b);
		 
		 
		
	}


}
