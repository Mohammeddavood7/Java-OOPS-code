package Com.feb29.forName.newInstancess;

//class Super
//{
//	public void m1()
//	{
//		System.out.println("super m1 method");
//	}
//}
//class Sub extends Super
//{
//	@Override
//	public void m1()
//	{
//		System.out.println("Sub m1 method");
//	}
//	public void m1(int a)
//	{
//		System.out.println("Sub m1 argument method ");
//	}
//}
//public class UsingInheritance
//{
//	public static void main(String[] args)
//	{
//		Super ss = new Sub();
//		ss.m1();
//		
//	}
//
//}

class A{}
class B extends A{}
class C extends B{}
interface I1 
{
//  default B m1()
//  {
//	  System.out.println("object m1");
//	  return new B();
//  }
}
interface I2
{
    default C m1()
    {
       System.out.println("String m1");
       return new C();
       	
    }
}
class A1 implements I1,I2 
{
	
	@Override
	public C m1() 
	{
		//I1.super.m1();
		I2.super.m1();
	  System.out.println("m1");
	 
	  return new C();
	}
}
public class TestMcq
{
	public static void main(String[] args) 
	{
			A1 a = new A1();
			a.m1();
	}
}


//interface A1
//{
//	public abstract double m2();
//}
//
//interface B1
//{
//	public abstract double m3();
//}
//
//interface C1 extends A1,B1
//{
//
//	//@Override
//	public double m1();
//	
//}
//
//class D1 implements C1
//{
//
//	@Override
//	public double m2() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public double m3() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public double m1() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	
//	
//}





































































