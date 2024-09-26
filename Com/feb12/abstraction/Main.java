package Com.feb12.abstraction;

//class A 
//{
//void foo() 
//{
//System.out.println("A");
//}
//}
//
//class B extends A 
//{
//void foo() 
//{
//System.out.println("B");
//}
//}	
//
//public class Test15
//{
//public static void main(String[] args)
//{
//A obja;
//B objb = new B();
//objb.foo();
//obja = objb;
//obja.foo();
//}
//}

//public class Test15
//{
// public static void main(String[] args)
//{
//    B b = new C();
//    A a = b;
//    if (a instanceof A) System.out.println("A");
//    if (a instanceof B) System.out.println("B");
//    if (a instanceof C) System.out.println("C");
//    if (a instanceof D) System.out.println("D");
//  }
//}
//
//class A {}
//class B extends A {}
//class C extends B {}
//class D extends C {}

//class Singer {
//	
//	
//	public static String sing() {
//		return "la";
//	}
//}
//
//public class Test19 extends Singer {
//
//	public static String sing() {
//		return "fa";
//	}
//
//	public static void main(String[] args) {
//		Test19 t = new Test19();
//		Singer s = new Test19();
//		System.out.println(t.sing() + " " + s.sing());
//	}
//}



//class Animal
//{
//public void eat()
//{
//System.out.println("Animal eating ");
//}
//}
//
//
//class Horse extends Animal
//{
//public void eat() 
//{
//System.out.println("Horse eating");
//}
//
//public void eat(String s) 
//{
//System.out.println("Horse eating "+s);
//}
//}
//
//public class Test21
//{
//public static void main(String [] args) 
//{
//Animal a = new Horse();
//a.eat(); 
//Horse aa = new Horse();
//aa.eat("Grass");
//}
//}




//class A 
//{
//private void printName(){
//System.out.println("Value-A");
//}
//}
//class B extends A
//{
//public void printName(){
//System.out.println("Name-B");
//}
//}
//public class Test23
//{
//public static void main (String[] args) 
//{
//A b1 = new B();
//B b = new B();
//b.printName();
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
//public class Test23
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
//public class Test33
//{
//public static void main (String[] args)
//{
//A a = new A();
//B b = new B();
//b = (B)new A();
//b.printName();
//}
//}


//class Test51
//{
//int count;
//public Test51()
//{
//count = count +1 ;
//}
//public static void main(String argv[])
//{
//new Test51();
//new Test51();
//new Test51();
//System.out.println(count);
//}
//}


//class A
//{
//static String str = "";
//protected A()
//{
//System.out.println(str + "A");
//}
//}
//class B extends A
//{
//private B ()
//{
//System.out.println(str + "B");
//}
//}
//public class Test53 extends A
//{
//private Test53()
//{
//System.out.println(str + "Test");
//}
//public static void main (String[] args)
//{
//new Test53();
//System.out.println(str);
//}
//}


//class A
//{
//public void test1()
//{
//System.out.println("test1 A");
//}
//}
//class B extends A
//{
//public void test1()
//{
//super.test1();
//System.out.println("test1 B");
//}
//}
//public class Test53
//{
//public static void main(String[] args)
//{
//A b = new B();
//b.test1();
//}
//}


//class Dog
//{
//}
//class Cat extends Dog
//{
//}
//
//public class Test60
//{
//	public static void main(String... args)
//	{
//		Dog d = new Dog();
//		Cat c = new Cat();
//		if(d.equals(c))
//		{
//			System.out.println("true");
//		}
//			else
//		{
//				System.out.println("false");
//		}
//	}
//}


//class Test60 
//{
//	public static void main(String[] args) 
//	{
//		Math m = new Math();
//		m.min(88,86);
//	}
//}




//public class Animal 
//{
//       String name;
//       Animal(String name) 
//       {
//              this.name = name;
//       }
//       Animal() 
//       {
//              this(makeRandomName());
//       }
//       String makeRandomName() 
//       {
//              String name = "i";
//              return name;
//       }
//       public static void main (String [] args) 
//       {
//              Animal a = new Animal();
//              System.out.println(a.name);
//              Animal b = new Animal("Zeus");
//              System.out.println(b.name);
//       }
//}


//class Animal { }
//class Horse extends Animal { }
//public class Animals
//{
//      public void doStuff(Animal a) 
//      {
//           System.out.println("In the Animal version");
//      }
//      public void doStuff(Horse h) 
//      {
//           System.out.println("In the Horse version");
//      }
//      public static void main (String [] args) 
//      {
//    	  Animals q = new Animals();
//            Animal ob1 = new Animal();
//            Animal ob2 = new Horse();
//            q.doStuff(ob1);
//            q.doStuff(ob2);
//     }
//}


//class Animal 
//{
//      static void doStuff() 
//      {
//             System.out.print("a  ");
//      }
//}
//public class q31 extends Animal 
//{
//      static void doStuff() 
//      {        
//            System.out.print("d  ");
//      }
//      public static void main(String [] args) 
//      {
//            Animal [] a = {new Animal(), new q31(), new Animal()};
//            for(int x = 0; x < a.length; x++)
//                 a[x].doStuff();               
//      }
//}


//public class Test23 
//{
//	public static void main(String[] args) 
//	{
//		float f = 4.12f;
//		if(f<4.12)
//		{
//          System.out.println("ABC");
//		}
//		else
//		{
//			System.out.println("XYZ");
//		}
//		
//	}
//}



//public class Test12
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("M");
//		Alpha.val=100;
//		System.out.println("F");
//		Alpha a = new Alpha();
//	}
//}
//class Beta
//{
//	static 
//	{
//		System.out.println("Q");
//		
//	}
//	Beta()
//	{
//		System.out.println("D");
//	}
//}
//class Alpha extends Beta
//{
//	static int val;
//	static 
//	{
//		System.out.println("W");
//		val=1000;
//	}
//	
//	Alpha()
//	{
//		System.out.println("C");
//	}
//
//	static 
//	{
//		System.out.println("R");
//		val=1000;
//	}
//}



//class Grandparent {
//    String name = "granparent";
//    void act() {
//        System.out.println(name);
//    }
//}
//
//class Parent extends Grandparent 
//{
//    String name = "parent";
//}
//
//class Child extends Parent {
//    String name = "child";
//    void act() {
//        System.out.println(name);
//    }
//}
//
//public class Test12 {
//    public static void main(String[] args) {
//        Parent yo = new Child();
//        yo.act();
//    }
//}



//public class Test55 {     
//    int a = 10;
//    
//    public void doStuff(int a) {
//        a += 1;
//        System.out.println(a++);
//    }
//    public static void main(String args[]) {
//        Test55 t = new Test55();
//        t.doStuff(3);
//    }
//}


//class Animal {
//	 String name = "Rocky ";
//	 String makeNoise() { return "generic noise"; }
//	 }
//	 class Tiger extends Animal {
//	String name = "stripes ";
//	 String makeNoise() { return "roarrrrrrrrrrr"; }
//	 }
//	 public class Zoo {
//	 public static void main(String[] args) { new Zoo().go(); }
//	 void go() {
//	 Animal m = new Tiger();
//	 System.out.println(m.name + m.makeNoise());
//	 }
//	}


//public class b39
//{
//        public static void main(String[] argv)
//        {
//              int a = 1;
//              System.out.println(a instanceof );
//        }
//}








//abstract class b39
//{
//  public abstract void show();
//}
//
//class b399 extends b39
//{
//	public void show()
//	{
//		System.out.println("b399 method");
//	}
//}
//public class Main
//{
//	public static void main(String[] args)
//	{
//		b39 b;
//		b = new b399();
//		b.show();
//		
//	}
//}


//abstract class A 
//{	
// abstract void m1();
// A(){ }
// 
// static void m2() 
// {
// System.out.println("Hello Java!"); 
// }
//}
//class B extends A {
//  void m1(){
//     A.m2(); 
//  }
// }
//
//public class Main
//{
//	public static void main(String[] args) {
//		A a ;
//		a = new B();
//		a.m1();
//	}
//}



//abstract class A {	
//    abstract void m1();
//   private A(){ }
//   }
//class B extends A { }



// abstract class Alpha {
//	  abstract void m1(Alpha a);
//	}
//	class Beta extends Alpha {
//	void m1(Alpha a) {
//	  System.out.println("One"); 	
//	 }
//	}
// class Gamma extends Beta {
//	void m1(Beta b) {	
//	 System.out.println("Two");
//	 super.m1(new Beta());
//	 }
//	}
//	public class Main {
//	public static void main(String[] args) {
//	Gamma c = new Gamma();
//	 c.m1(new Beta());
//	  }
//	}







































































































































































