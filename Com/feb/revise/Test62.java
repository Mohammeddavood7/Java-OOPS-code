package Com.feb.revise;

//@FunctionalInterface
//interface NIT
//{
//	public int myInterface(int a);  
//	
//	static void show()
//	{
//		System.out.println("show method is invoked");
//	}
//}
//public class Java8 
//{
//	public static void main(String[] args)
//	{
//		NIT nit =  a -> a;
//        System.out.println(nit.myInterface(10));
//        NIT.show();
//	}
//}



//interface A
//{
//public void innerMeth();
//}
//public class Test2 
//{
//  A a;
//  int memVar = 1;
//void aMethod()
//	{
//   a = new A()
//		{
//   public void innerMeth()
//		{
//       System.out.println(memVar);
//       } 
//		};
//   }
// public static void main(String[] args)
//	  {
//           Test2 t = new Test2();
//            t.a.innerMeth();
//			 t.aMethod();
//			 
//     }
//     }


//class A 
//{
//private void printName()
//{
//System.out.println("Value-A");
//}
//}
//class B extends A
//{
//public void printName()
//{
//System.out.println("Name-B");
//}
//}
//public class Test35
//{
//public static void main (String[] args) 
//{
//A b = new B();
////b.printName();
//     A a = new A();
//      
//}
//}

//class Base
//{
//    int value=0;
//    Base()
//	{
//    this.addValue();
//    }
//    void addValue()
//    {
//    	System.out.println("Parent");
//    value += 10;
//    }
//    
//   int getValue()
//   {
//     return value;
//   }
//   
// }
//class Derived extends Base
//{
//  Derived()
//  {
//	  super();
//    addValue();
//  }
// void addValue()
// {
//	 System.out.println("child");
//	 super.addValue();
//     value +=  30;
//  }
//}
//public class Test5
//{
//  public static void main(String[] args)
//  {
//      Derived b = new Derived();		  
//      System.out.println(b.getValue());
//  }
//}


// abstract class Test50
//{  
//	void doSomething() 
//	 {  
//	 System.out.println("A");  
//	 }  
//	 
// } 
// 
// class B extends Test50 
//{  
// protected void doSomething()
// {  
// System.out.println("B");  
// }  
// }  
// 
// public class Test5
// {
//	 public static void main(String[] args) 
//	{
//		 Test50 t1;
//		 t1 =  new B();
//		 t1.doSomething();
//		
//	}
// }
 

//class Base
//{
//    int value=0;
//    Base()
//	{
//    addValue(); //10 + 30 = 40 // 40+ 10 =50 // 50 + 30 = 80
//    }
//    
//    void addValue()
//    {
//    value += 10;
//    }
//    
//   int getValue()
//   {
//     return value;
//   }
// }
//class Derived extends Base
//{
//	  Derived()
//	  {
//		  super();
//	   addValue();
//	  }
//   void addValue()
//    {
//	  super.addValue();
//       value +=  30;
//    }
//}
//public class Test5 
//{
//  public static void main(String[] args)
//  {
//      Derived b = new Derived();		  
//      System.out.println(b.getValue());
//  }
//}
 
//class Base{
//    static  int value = 0;
//      Base(){
//      addValue();
//      }
//  static void addValue(){
//      value += 10;
//      }
//     int getValue(){
//       return value;
//     }
//   }
//  class Derived extends Base{
//    Derived(){
//     addValue();
//    }
//  static void addValue(){
//   value +=  20;
//    }
//  }
//  public class Test5 {
//    public static void main(String[] args){
//        Base b = new Derived();
//        System.out.println(b.getValue());
//    }
//  }



//interface ITest
//{
// public void setVal();
//}
//public class Test5
// {
//  private String a;
//  void aMethod()
// {
//  final String b = " World";
//  ITest it = new ITest() {
//               public void setVal(){
//               a = "Hello" + b;
//               }};
//  it.setVal();
//  System.out.println(a);
//  }
//  public static void main(String[] args) {
//  Test5 t = new Test5();
//  t.aMethod();
//  }
//}


//abstract class Test5
//{  
// private void doSomething() 
// {  
// System.out.println("A");  
// }  
// public static void main(String [] args)
// {  
//  Test5 a = new B();  
// a.doSomething();  
// }  
// } 
// 
// class B extends Test5 
//{  
// protected void doSomething()
// {  
// System.out.println("B");  
// }  
//} 


//class A
//{
//static public void main (String[] args) 
//{
//  A a1 = new B();
//  a1.foo1();
//}
//static void foo()
//{
//	System.out.println("A");
//}
//}
//class B extends A 
//{
// void foo1()
//{
//	System.out.println("B"); 
//}
//}


//class A
//{
//static public void main (String[] args) 
//{
//A a1 = new B();
//a1.foo();
//}
//static void foo()
//{
//	System.out.println("A");
//}
//}
//class B extends A 
//{
//void foo()
//{
//	System.out.println("B"); 
//}
//}


//class A 
//{
//static void foo()
//{
//System.out.println("A");
//}
//}
//
//class B extends A
//{
//static void foo()
//{
//System.out.println("B");
//return 1;
//}
//}


//public class Test19 extends Singer
//{
// public static String sing() 
// {
//   return "fa";
// }
//
// public static void main(String[] args) 
// {
//   Test19 t = new Test19();
//   Singer s = new Test19();
//   System.out.println(t.sing() + " " + s.sing());
// }
//}
//
//class Singer {
// public static String sing() {
//   return "la";
// }
//}




//class First 
//{
//	
//	public String method1() 
//	{
//	System.out.println("Subclass method1");
//	return new String("Derived");
//	}
//}
//
//class Second extends First 
//{
//	public Object method1()
//	{
//	System.out.println("super method1");
//	return new String("Base");
//	}
//	
//}
//
//public class Test20
//{
//public static void main(String[] args)
//{
//	First f ;
//	 f = new Second();
//	 String method1 = f.method1();
//	 System.out.println(method1);
//	
//}
//
//}




//class A{
//	
//}
//
//class B extends A
//{
//	
//}
//
//class C extends B
//{
//	
//}
//
//class Alpha99
//{
//	public B show()
//	{
//		System.out.println("Alpha99 show is invoked");
//		return new B();
//	}
//}
//
//class Beta99 extends Alpha99
//{
//	public A show()
//	{
//		System.out.println("Beta99 show is invoked");
//		return new A();
//	}
//}
//
//public class MainOverride
//{
//	public static void main(String[] args)
//	{
//		Alpha99 al ;
//		al = new Beta99();
//		B all = al.show();
//
//
//		
//	}
//}



//class A 
//{
//	private void printName()
//	{
//	System.out.println("Value-A");
//	}
//}
//class B extends A
//{
//	public void printName()
//	{
//	System.out.println("Name-B");
//	}
//}
//public class Test23
//{
//public static void main (String[] args) 
//{
//	A b = new B();
//	b.printName();
//}
//}


//public class Test23
//{
//public static void main (String args[])
//{
//Test23 t1 = new Test23();
//
//if(t1 instanceof Object)
//{
//System.out.println("equal");
//}
//else
//{
//System.out.println("Not equal");
//}
//}
//}



//class A 
//{
//	public void printValue()
//	{
//	System.out.println("Value-A");
//	}
//}
//class B extends A
//{
//	public void printNameB()
//	{
//	System.out.println("Name-B");
//	}
//}
//class C extends A
//{
//	public void printNameC()
//	{
//	System.out.println("Name-C");
//	}
//}
//
//public class Test27
//{
//	public static void main (String[] args) 
//	{
////		B b = ;
////		C c =;
//		newPrint(new B());
//		//newPrint(new C());
//	}
//
//	public static void newPrint(A a)
//	{
//		
//	   a.printValue();
//	}
//
//}


//class A1 
//{
//public void printName()
//{
//System.out.println("Value-A");
//}
//}
//class B1 extends A1
//{
//public void printName()
//{
//System.out.println("Name-B");
//}
//}
//public class Test28
//{
//public static void main (String[] args)
//{
//A1 b = new B1();
//newPrint(b);
//}
//public static void newPrint(A1 a)
//{
//a.printName();
//}
//}
//


//class A 
//{
//public void printName()
//{
//System.out.println("Value-A");
//}
//}
//class B extends A
//{
//public void printName()
//{
//System.out.println("Name-B");
//}
//}
//class C extends A
//{
//public void printName()
//{
//System.out.println("Name-C");
//}
//}
//public class Test29
//{
//public static void main (String[] args) {
//A b = new B();
//C c = new C();
//b = c;
//newPrint(b);
//}
//public static void newPrint(A a){
//a.printName();
//}
//}



//class A 
//{
//public void printName()
//{
//System.out.println("Value-A");
//}
//}
//class B extends A
//{
//public void printName()
//{
//System.out.println("Name-B");
//}
//}
//class C extends A
//{
//public void printName()
//{
//System.out.println("Name-C");
//}
//}
//public class Test30
//{
//public static void main (String[] args) 
//{
//B b = new B();
//C c = new C();
//b = c;
//newPrint(b);
//}
//public static void newPrint(A a)
//{
//a.printName();
// }
// }


//class C 
//{
//}
//class D extends C
//{
//}
//class A
//{
//public C getOBJ()
//{
//System.out.println("class A - return C");
//return new C();
//}
//}
//class B extends A
//{
//public D getOBJ()
//{
//System.out.println("class B - return D");
//return new D();
//}
//}
//public class Test31
//{
//public static void main(String... args) 
//{
//     A a = new B();
//     a.getOBJ();
//}
//}






//class A1 
//{
//public void printName()
//{
//System.out.println("Value-A");
//}
//}
//class B1 extends A1
//{
//protected void printName()
//{
//System.out.println("Name-B");
//}
//}
//public class Test33
//{
//public static void main (String[] args)
//{
//A1 b = new B1();
//newPrint(b);
//}
//public static void newPrint(A1 a)
//{
//a.printName();
//}
//}




//class A 
//{
//private void printName()
//{
//System.out.println("Value-A");
//}
//}
//class B extends A
//{
//public void printName()
//{
//System.out.println("Name-B");
//}
//}
//public class Test35
//{
//public static void main (String[] args) 
//{
//A b = new B();
//b.printName();
//}
//}



//class A  
//{
//   public  A()
//   {
//    System.out.println("A");
//   }
//
//	public  A(int i)
//	{
//	this();
//	System.out.println(i);
//	}
//}
//
//class B extends A
//{
//	public B ()
//	{
//	System.out.println("B");
//	}
//
//	public B (int i)
//	{
//	this();
//	System.out.println(i+3);
//	}
//}
//
//public class Test39
//{
//	public static void main (String[] args)
//	{
//	new B(5);
//    }
//}


//class A 
//{
//public void printName()
//{
//System.out.println("Name-A");
//}
//}
//class B extends A
//{
//public void printName()
//{
//System.out.println("Name-B");
//}
//public void printValue() 
//{
//System.out.println("Value-B");
//}
//}
//public class Test42
//{
//public static void main (String[] args)
//{
//A a = new A();
//B b = (B)a;
//b.printName();
//}
//}


//class A 
//{
//	public void printName() 
//	{
//	System.out.println("Name-A");
//	}
//}
//class B extends A
//{
//	public void printName()
//	{
//	System.out.println("Name-B");
//	}
//	
//	public void printValue()
//	{
//	System.out.println("Value-B");
//	}
//}
//public class Test47
//{
//	public static void main (String[] args){
//	B b = new B();
//	A a = (A)b;
//	a.printName();
//	}
//}

//class A 
//{
//	int i;
//	public A(int i)
//	{
//	this.i=i;
//	}
//	
//	public void printName()
//	{
//	System.out.println("Name-A");
//	}
//}
//
//class C extends A
//{
// 
//	
//}
//
//public class Test47
//{
//	public static void main (String[] args)
//	{
//	A c = new C();
//	c.printName();
//	}
//}



//class A 
//{
////	public A(int i)
////	{
////	System.out.println(i); //6
////	}
//}
//
//class B extends A
//{
//	public B()
//	{
//	 //super(6);  //1. this() or super();
//	 this(7); 
//	 
//	}
//	
//	public B(int i)
//	{
//		System.out.println(i);
//	}
//}
//
//
//public class Test48
//{
//	public static void main (String[] args)
//	{
//	   B b = new B();
//	}
//}


//class A 
//{
//	public A()
//	{ 
//		
//		this(8); // ---
//		int i = 10;
//		System.out.println(i);
//	}
//	
//	public A(int i)
//	{
//		super(); //Object class
//		System.out.println(i);
//		
//	}
//}
//public class Test49
//{
//	public static void main (String[] args)
//	{
//	A a = new A();
//	}
//}





class Vehicle 
{
    public void printSound()
    {
        System.out.print("vehicle");
    }
}

class Car extends Vehicle 
{
    public void printSound()
    {
        System.out.print("car");
    }
}

class Bike extends Vehicle 
{
    public void printSound()
    {
        System.out.print("bike");
    }
}

public class Test62
{
    public static void main(String[] args) 
    {
        Vehicle v = new Car();
        Car c = (Car) v;
        
        v.printSound(); //car
        c.printSound(); //car
    }   
}












































