package Com.feb09.test;


//what is method hidding in java?
//A.Making a method private in a subclass

//B.Redefining a method with a different return type in a subclass

//C.Creating a static method with the same signature as a superclass method

//D.Defining a new method with the same name in a subclass//ans

//public class Polymorphism2 {
//  public static void main(String[] args) {
//      A ref1 = new C();
//      B ref2 = (B) ref1;
//      System.out.println(ref2.g());
//  }
//}

//class A {
//  private int f() {
//      return 0;
//  }

//  public int g() {
//      return 3;
//  }
//}

//class B extends A {
//  private int f() {
//      return 1;
//  }

//  public int g() {
//      return f();
//  }
//}

//class C extends B {
//  public int f() {
//      return 2;
//  }
//}  ans = 1



// class Superclass 
// {
//     Superclass method()
//     {
//    	 System.out.println("super class");
//
//         return new Superclass();
//     }
// }
//
// class Subclass extends Superclass
// {
//     @Override
//     Superclass method() 
//     {
//    	 System.out.println("sub class");
//         return new Subclass();
//     }
// }
// 
// public class Polymorphism2
// {
//		 public static void main(String[] args)
//		 {
//			 Subclass p = new Subclass();
//			 p.method();
//		 }
// } 

//class Demo1 {
//
//Demo1 m1() {
//    return this;
//}
//
//static void m2() {
//    System.out.println("Welcome");
//}
//}
//
//class Demo2 extends Demo1 {
//@Override
//Demo2 m1() {
//return this;
//}
//
//static void m2() {
//    System.out.println("Hi");
//}
//}
//
//public class Test {
//public static void main(String[] args) {
//Demo1 d1 = new Demo1();
//d1.m1().m2();
//
//    Demo1 d2 = new Demo2();
//    d2.m1().m2();
//
//}
//}



//class A {
//	String s = "NIT1";
//	private void m1() {
//		System.out.println(s);
//	}
//}
//
//public class Test extends A {
//	String s = "NIT2";
////	public void m1() {
////		System.out.println(s);
////		//super.m1();
////	}
//
//	public static void main(String[] args) {
//
//		A a = new Test();
//		a.m1();
//	}
//}




//class A {
//
//	protected String m1() {
//		return "Parrent m1()";
//	}
//	public String m3()
//	{
//		return "m33";
//	}
//      
//	public String m2() {
//		return this.m3();//1
//	}
//}
//
//public class Test extends A
//{
//	@Override
//	protected String m1() 
//	{
//		System.out.println(super.m2());
//		return "";
//	}
//	
//	public String m3()
//
//	{
//		return "m3";
//	}
//	public static void main(String[] args)
//	{
//
//		Test t = new Test();
//		t.m1();
//		
////		System.out.println(m2);
////		System.out.println("main method");
//	}
//}



//class A {
//
//	protected String m1()
//	{
//		return "Parrent m1()";
//	}
//
//	public String m2() {
//		return this.m1();
//	}
//}
//public class Test extends A {
//	protected String m1() {
//		System.out.println(super.m2());
//		return "";
//	}
//
//	public static void main(String[] args) {
//
//		Test t = new Test();
//		t.m1();
//	}
//}
//











//class A {
//
//	public String m1() {
//		return m2() + " HI";
//	}
//
//	public String m2() {
//		return "NIT";
//	}
//}
//
//public class Test extends A 
//{
//	@Override
//	public  String m1() {
//		System.out.print(super.m1() + " ");
//		return "OK";
//	}
//
//	public static void main(String[] args) {
//
//		Test t = new Test();
//		System.out.print(t.m1());
//	}
//}


//class A {
//
//	protected String m1() {
//		return "Parrent m1()";
//	}
//
//}
//
//public class Test extends A {
//	protected String m1() {
//		return this.m1();
//	}
//
//	public static void main(String[] args) {
//
//		Test t = new Test();
//		System.out.println(t.m1());
//	}
//}


















//class Demo {
//	Demo() 	{
//		System.out.println("Demo()");
//	}
//
//	public Demo m1() {
//		return new Demo();
//	}
//
//}
//
//public class Test extends Demo {
//	public Test() 
//	{
//		super();
//		System.out.println("Test()");
//	}
//
//	@Override
//	public Demo m1() {
//		return new Test();
//	}
//
//	public static void main(String[] args) {
//		Demo d = new Test();
//		d.m1();
//
//	}
//}


//class Demo1 {
//
//	public static String m1() {
//		return "Demo1";
//	}
//}
//
//class Demo2 extends Demo1 {
//	
//	public static int m1() {
//		return 1;
//	}
//}
//
//public class Test {
//	public static void main(String[] args) {
//		Demo1 d = new Demo2();
//		System.out.println(d.m1());
//	}
//}


//class Base {
//	Base() {
//		this(10);
//	}
//
//	Base(int a) {
//		m1(a);
//	}
//
//	void m1(int a) {
//		System.out.println(a);
//	}
//
//}
//
//class Derived extends Base {
//	Derived() {
//		this(20);
//	}
//
//	Derived(int a) {
//		m1(a);
//	}
//
//	void m1(int a) {
//		System.out.println(a);
//	}
//}
//
//public class TestMCQ {
//	public static void main(String[] args) {
//		Derived d = new Derived();
//
//	}
//}



//class Demo1 {
//	Demo1() {
//		this(10);
//	}
//
//	Demo1(int a) {
//		this.m1();
//	}
//
//	Demo1 m1() {
//		System.out.println("Good Morning");
//		return new Demo1();
//	}
//}
//
//class Demo2 extends Demo1 {
//	
//	Demo2 m1() {
//		return this.m2();
//	}
//
//	Demo2 m2() {
//		System.out.println("Good Afternoon");
//		return this;
//	}
//}
//
//public class Test {
//	public static void main(String[] args) {
//
//		Demo1 d2 = new Demo2();
//	}
//}





//class Vehicle {
//	Vehicle() {
//		honk().display();
//	}
//
//	public Vehicle honk() {
//		System.out.println("Vehicle is honking");
//		return this;
//	}
//
//	public void display() {
//		honk();
//	}
//}
//
//class BMW extends Vehicle {
//	BMW() {
//		honk().display();
//	}
//
//	public Vehicle honk() {
//		System.out.println("BMW is honking");
//		return this;
//	}
//
//	public void display() {
//		honk();
//	}
//}
//
//public class TestMCQ {
//	public static void main(String[] args) {
//		Vehicle v = new BMW();
//
//	}
//}




//class Base {
//
//	int a;
//
//	Base() {
//		this.a = 10;
//	}
//
//	Base m1() {
//		this.a=20;
//		return this;
//	}
//}
//
//class Child extends Base {
//	int a;
//
//	Child() {
//		this.a = 30;
//	}
//
//	Child m1() {
//		super.a = 40;
//		return this;
//	}
//}
//
//public class Test {
//	public static void main(String[] args) {
//
//		Base base = new Child();
//		System.out.println(base.m1().a);
//		System.out.println(new Child().m1().a + new Base().a);
//	}
//}
//

class ABC
{
    void methodABC()
    {
        new XYZ().methodXYZ();
    }
}
 
class XYZ extends ABC
{
    void methodXYZ()
    {
        methodABC();
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        new ABC().methodABC();
    }
}



























































































