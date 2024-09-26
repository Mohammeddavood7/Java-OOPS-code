package Com.feb06.finalkeyword;

//class Final
//{
//	final int VAL = 10;
//	public void calculate()
//	{
//		VAL = 30;
//		System.out.println(VAL);
//	}
//}



//class A
//{
//	protected int a = 10;
//	protected int b = 20;
//
//      private final void calculate()
//	  {
//		int sum = a+b;
//		System.out.println("Sum is :"+sum);
//	  } 
//}
//class B extends A
//{
//	public void calculate() 
//	{
//		int mul = a*b;
//		System.out.println("Mul is :"+mul);	
//	}
//}
//public class FinalMethodEx1 
//{
//	public static void main(String [] args) 
//	{
//		new B().calculate();
//	}
//}





class A
{
	protected int a = 10;
	protected int b = 20;

     public void calculate()
	  {
		int sum = a+b;
		System.out.println("Sum is :"+sum);
	  } 
}

class B extends A
{	
	@Override
	public void calculate() 
	{
		int mul = a*b;
		System.out.println("Mul is :"+mul);	
	}
}

public class FinalMethodEx1
{
	public static void main(String [] args) 
	{
//		 A a1 = new B();
//		 a1.calculate();
		
//		B b = new B();
//		b.calculate();
	}
}
//public class VariableFinal 
//{
//    public static void main(String[] args) {
////		Final f = new Final();
////		System.out.println();
////		f.calculate();
//    	
////    	final int num = 126;
////    	byte b = num;
////    	System.out.println(b);
////    	
////    	final int num1 = 13;
////    	byte b1 = num1*2;
////    	System.out.println(b1);
////    	
////    	int num2 = 2;
////    	byte b3 = (byte) num2;
////    	System.out.println(b3);
//    	
//    	
//	}	
//
//}
