package Com.feb15yesterdaytest.answer;

//class A
//{
//	private int x = 100;
//	public void setData()
//	{
//		x = 120;
//        this.x=x+30;
//		System.out.println(x);
//	}
//}
//class B extends A 
//{   
//}
//public class FinalClassEx
//{
//	public static void main(String[] args)
//	{
//		B b1 = new B();
//		b1.setData();		
//	}
//}

//sealed class A permits B {
//	public void m1() {
//		System.out.println("Class A");
//	}
//}
//
// class B extends A {
//	@Override
//	public void m1() {
//		System.out.println("Class B");
//	}
//}
//
//public class Test {
//	public static void main(String[] args) {
//		A a = new B();
//		a.m1();
//	}
//}



//sealed class Human permits Manish, Vartika, Anjali {
//	public void printName() {
//		System.out.println("Default");
//	}
//}
//
//non-sealed class Manish extends Human {
//	public void printName() {
//		System.out.println("Manish Sharma");
//	}
//}
//
//sealed class Vartika extends Human {
//	public void printName() {
//		System.out.println("Vartika Dadheech");
//	}
//}
//
//final class Anjali extends Human {
//	public void printName() {
//		System.out.println("Anjali Sharma");
//	}
//}
//
//public class Test {
//	public static void main(String[] args) {
//		Human h1 = new Anjali();
//		Human h2 = new Vartika();
//		Human h3 = new Manish();
//
//		h1.printName();
//		h2.printName();
//		h3.printName();
//	}
//}

//class A {
//	private final void m1() {
//		System.out.println("Good Morning");
//	}
//}
//
//class B extends A {
//	public void m1() {
//		System.out.println("Good Aftrnoon");
//	}
//}
//
//public class Test {
//	public static void main(String[] args) {
//		new A().m1();
//	}
//}


//class A {
//	final int a = 10;
//
//	public A() {
//		this.a = 20;
//	}
//
//	public void m1() {
//		System.out.println((a + a));
//	}
//}
//
//public class Test {
//	public static void main(String[] args) {
//		A a1 = new A();
//		a1.m1();
//	}
//}


//public class Test {
//    final int a = 10;
//    static final int b = 20;
//    
//	public static void main(String[] args) {
//		final Test t=new Test();
//		int x=t.b;
//		int y=t.a;
//		System.out.println(x+" "+y);	
//	}
//}


//public class Test {
//	final int a;
//	int b = 20;
//
//	void m1() {
//		this.a = 10;
//		m2();
//	}
//	
//	void m2() {
//		this.a = 50;
//	}
//
//	public static void main(String[] args) {
//		Test t = new Test();
//		t.m1();
//		System.out.println(t.a + t.b);
//	}
//}


//abstract class Alphabates {
//	
//	public abstract Alphabates checkupper(char c);
//}
//
//class A extends Alphabates 
//{
//	@Override
//	public Alphabates checkupper(char c) {
//		if (c >= 'A' && c <= 'Z')
//			System.out.println("Upper_case");
//		else
//			System.out.println("Lower_case");
//		return new Alphabates();
//	}
//}
//
//class B extends Alphabates {
//
//	@Override
//	public Alphabates checkupper(char c) {
//		if (c >= 'A' && c <= 'Z')
//			System.out.println("Upper_case");
//		else
//			System.out.println("Lower_case");
//		return new B();
//	}
//}
//
//public class Test {
//	public static void main(String[] args) {
//		A a = new A();
//		B b = new B();
//		a.checkupper('A');
//		b.checkupper('B');
//	}
//}


abstract class Poly {
	abstract void m1(Integer... i);
}

//class Overload extends Poly {
//
//	@Override
//	void m1(Integer[] i) {
//		System.out.println("Integer[]");
//	}
//
//	void m1(Number... i) {
//		System.out.println("Number...");
//	}
//
//	void m1(Object... i) {
//		System.out.println("Object...");
//	}
//
//}
//
//public class Test {
//	public static void main(String[] args) 
//	{
//		Overload o = new Overload();
//		int b1 = 10;
//		o.m1(b1, 20);
//	}
//}















//
//abstract class Base {
//	int x = 9, y = 8;
//
//	void show() {
//		System.out.println("x");
//		System.out.println("y");
//	}
//
//	abstract void display();
//}
//
//class child extends Base {
//	void set(int x, int y) {
//		this.x = x;
//		super.y = y;
//		System.out.println("x " + x);
//		System.out.println("y " + y);
//
//	}
//
//	void display() {
//		System.out.println("display");
//
//	}
//
//}
//public class MainMain
//{
//public static void main(String args[]) {
//		child c1 = new child();
//		c1.set(10, 20);
//		c1.show();
//		c1.display();
//	}
//}




//class Car {
//	private int fuel;
//
//	public Car() {
//		fuel = 0;
//	}
//
//	public Car(int g) {
//		fuel = g;
//	}
//
//	public void addFuel() {
//		fuel++;
//	}
//
//	public void display() {
//		System.out.print(fuel + " ");
//	}
//}
//
//public class RaceCar extends Car {
//	public RaceCar(int g) {
//		super(2 * g);
//	}
//
//	public static void main(String[] args) {
//		Car car = new Car(5);
//		Car fastCar = new RaceCar(5);
//		car.display();
//		car.addFuel();
//		car.display();
//		fastCar.display();
//		fastCar.addFuel();
//		fastCar.display();
//	}
//}



//abstract class Shape {
//    abstract void draw();
//}
//
//class Circle extends Shape {
//    void draw() {
//        System.out.println("Drawing a Circle");
//    }
//
//    void calculateArea() {
//        System.out.println("Calculating Circle Area");
//    }
//}
//
//class Square extends Shape {
//    void draw() {
//        System.out.println("Drawing a Square");
//    }
//
//    void calculateArea() {
//        System.out.println("Calculating Square Area");
//    }
//}
//
//public class Test{
//public static void main(String [] args){
//Shape shape1 = new Circle();
//Shape shape2 = new Square();
//
//((Circle) shape1).calculateArea();
//((Square) shape2).calculateArea();
//
//}
//}


//public class Student {
//	private String name;
//	private int rollNo;
//
//	public Student(String name, int rollNo) {
//		super();
//		this.name = name;
//		this.rollNo = rollNo;
//	}
//
//	@Override
//	public String toString() {
//		this.rollNo++;
//		return rollNo;
//	}
//
//	public static void main(String[] args) {
//		Student s = new Student("Rahul", 101);
//		System.out.println(s);
//
//	}
//}


//public class RecordConstructorChainingExample {
//	public static void main(String[] args) {
//
//		Person person1 = new Person("Raj", 30);
//		Person person2 = new Person("Abhi");
//		Person person3 = new Person(1);
//
//		System.out.println(person1);
//		System.out.println(person2);
//		System.out.println(person3);
//
//	}
//
//	record Person(String name, int age) {
//
//		Person(String name) {
//			this(name, 0);
//		}
//
//		Person(int age) {
//			this("suraj", age);
//		}
//	}
//}



//record Person(String name, int age) {
//
//	public void displayInfo() {
//		System.out.println(" Age: " + age+ ", Name: " + name );
//	}
//}
//
//public class RecordAsChildClassExample extends Person {
//	public static void main(String[] args) {
//		Person p = new Person("Amit", 29);
//		p.displayInfo();
//
//	}
//}



























































































































































































