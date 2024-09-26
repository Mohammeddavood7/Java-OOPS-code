package Com.feb1.test;


//	public class Varargs2 
//	{
//		Varargs2(int... dates)
//		{
//		System.out.println("Inside Varargs(int…)");
//		}
//		
//
//		Varargs2(boolean... yesno)
//		{
//		    System.out.println("Inside Varargs(float...)");
//		}
//
//		public static void main(String[] args) {
//		    Varargs2 varargs2 = new Varargs2();
//		    System.out.println(varargs2);
//		}
//}



//		public class MethodOverloading2 
//		{
//		
//		 int info() 
//		{
//		System.out.println("PLANE");
//		return 0;
//		}
//		
//		   void info()
//		 {
//		     System.out.println("AIRPORT");
//		 }
//		
//		public static void main(String[] args) 
//		{
//		    MethodOverloading2 m = new MethodOverloading2();
//		    int a = m.info();
//		}
//		}
//		







//public class Varargs2
//{
//Varargs2(int... carnums) 
//{
//System.out.println("Inside Varargs(int…)");
//}
//
//Varargs2(float... prices) {
//    System.out.println("Inside Varargs(float...)");
//}
//
//public static void main(String[] args) {
//    new Varargs2();
//}
//}


//class Demo{
//public Demo(int i)
//{
//System.out.println("int");
//}
//
//public void Demo(short s)
//{
//    System.out.println("short");
//}
//}
//
//public class MainClass
//{
//
//public static void main(String[] args){
//    short s = 10;
//    Demo demo = new Demo(s);
//}
//}



//public class Main {
//public static void main(String[] argv) {
//System.out.println(calc(10,20));
//}
//public static int calc(int a, int b) {
//System.out.println("int");
//return a + b;
//}
//public static float calc(Integer a, int b) {
//System.out.println("float");
//return (float) a + b;
//}
//}


//public class MainClass{
//
//double overloadedMethod(double d){
//    return d *= d;
//}
//
//int overloadedMethod(int i){
//    return (i *= i);
//}
//
//float overloadedMethod(float f){
//    return (f *= f);
//}
//
//public static void main(String[] args){
//    MainClass main = new MainClass();
//
//    System.out.println(main.overloadedMethod(100));
//
//}
//}



//class Overload {
//int x;
//double y;
//
//void add(int a, int b) {
//    x = a + b;
//}
//
//void add(double c, double d) {
//    y = c + d;
//}
//
//Overload() {
//    this.x = 0;
//    this.y = 0;
//}
//}
//
//public class Overload_methods {
//public static void main(String args[]) {
//Overload obj = new Overload();
//int a = 2;
//double b = 3.2;
//obj.add(a, a);
//obj.add(b, b);
//System.out.println(obj.x + " " + obj.y);
//}
//}


//public class Main {
//public static void main(String[] args) {
//int i = 3;
//m(i, i);
//}
//static void m(float f1, int ...f2) {
//System.out.println("float f1, float f2");
//}
//static void m(int ...i) {
//System.out.println("int…i");
//}
//}


//
//class A
//{
//public A(int i)
//{
//System.out.print(1+” “);
//}
//
//public A()
//{
//    this(10);
//
//    System.out.print(2+" ");
//}
//
//void A()
//{
//    A(10);
//
//    System.out.print(3+" ");
//}
//
//void A(int i,int b)
//{
//    System.out.print(4+" ");
//}
//}
//
//public class MainClass
//{
//public static void main(String[] args)
//{
//new A().A();
//}
//}


//public class Main {
//public void test(int... i) {
//System.out.println("int var arg");
//}
//public void test(int arr[]) {
//System.out.println("int array arg");
//}
//public static void main(String[] args) {
//int i = 3;
//new Main().test(i, i);
//}
//}


//public class Main {
//public static void main(String[] argv) {
//MySubclass my = new MySubclass();
//my.calc(1);
//}
//}
//class MyClass {
//public void calc(int i) {
//System.out.println("public void calc(int i)");
//}
//}
//class MySubclass extends MyClass {
//public void calc(int f) {
//System.out.println("public void calc(int f)");
//}
//}


//class Doo
//{
//public void meth(int ... x)
//{
//System.out.println("int … x");
//}
//public void meth(byte ... x)
//{
//System.out.println("byte … x");
//}
//}
//public class Main extends Doo
//{
//public void meth(short ... x)
//{
//System.out.println("short … x");
//}
//public static void main(String[] args) {
//new Main().meth();
//}
//}


//class Test {
//    int a;
//    int b;
//    Test (int i, int j){
//        a = i;
//        b = j;
//    }
//    void meth(Test O){
//        O.a *= 2;
//        O.b /= 2;
//    }          
//}    
//public class Output {
//    public static void main(String args[]) {
//        Test obj = new Test (10 , 20);
//        obj.meth(obj);
//        System.out.println(obj.a + " " + obj.b);        
//    } 
//}


//public class Main {
//public static void main(String[] argv) {
//System.out.println(calc(10,20));
//}
//public static int calc(int a, int b) {
//System.out.println("int");
//return a + b;
//}
//public static float calc(int a, int b) {
//System.out.println("float");
//return (float) a + b;
//}
//}




//class One {
//
//public One(int x) {
//    System.out.print("int constructor");
//}
//
//public One(long l) {
//    System.out.print("long constructor");
//}
//}
//
//public class Test {
//
//public static void main(String[] args) {
//    long l = 20L;
//    One one = new One(l);
//}
//}



//public class Main
//{
//public void aMethod(int f, float s) {
//System.out.println("I and S are Printed");
//}
//public void aMethod(float ...s,int b) {
//System.out.println("S and I are Printed");
//}
//public static void main(String[] args) {
//Main main = new Main();
//main.aMethod(1f,2);
//}
//}



//public class MainClass {
//void method(int... a) {
//System.out.println(1);
//}
//
//void method(int[] a) {
//    System.out.println(2);
//}
//
//public static void main(String[] args) {
//    MainClass m = new MainClass();
//    m.method(10);
//}
//}



//class Rabbit{ }
//
//class WildRabbit extends Rabbit{ }
//
//public class MethodOverloading4
//{
//
//Rabbit jump()
//{
//System.out.println("Rabbit Jump");
//return new Rabbit();
//}
//
//WildRabbit jump()
//{
//System.out.println("Wild Rabbit Jump");
//return new WildRabbit();
//}
//
//public static void main(String[] args){
//MethodOverloading4 obj = new MethodOverloading4();
//obj.jump();
//}
//}


//
//class A { 
//	public A()
//	{
//		super();
//	}
//}
//
//class B extends A {
//	public B()
//	{
//		super();
//	}
//}
//
//class C extends B {
//	public C()
//	{
//		super();
//	}
//}
//
//public class MainClass
// {
//
//void overloadedMethod(A a)
// {
//System.out.println("ONE");
//}
//
//void overloadedMethod(B b) 
//{
//    System.out.println("TWO");
//}
//
//void overloadedMethod(Object obj) 
//{
//    System.out.println("THREE");
//}
//
//public static void main(String[] args) {
//    C c = new C();
//  MainClass m = new MainClass();
//   m.overloadedMethod(c);
//   
//   
//    B b = new C();
//}
//}



//class Parent
//{
//public void className(){
//System.out.println("Parent");
//}
//}
//
//class Child extends Parent
//{
//public void className(){
//System.out.println("Child");
//}
//}
//
//public class Test{
//
//public static void main(String[] args){
//    Parent parent = new Child();
//    parent.className();
//}
//}


//class Overload {
//int x;
//
//void add(int a) {
//    x = a + 1;
//}
//
//void add(int a, int b) {
//    x = a + 2;
//}
//}
//
//public class Overload_methods {
//public static void main(String args[]) {
//Overload obj = new Overload();
//obj.add(6);
//System.out.println(obj.x);
//}
//}



//public class Main {
//static void m(Integer i1, Integer i2) {
//System.out.println("Integer i1, Integer i2");
//}
//static void m(Integer...i) {
//System.out.println("int…i");
//}
//public static void main(String[] args) {
//int i = 3;
//m(i, i);
//}
//}




//public class San {
//public void m1(int i, float f) {
//System.out.println(" int float method");
//}
//
//public void m1(float f, int i) {
//    System.out.println("float int method");
//}
//
//public static void main(String[] args) {
//    San s = new San();
//    s.m1(20, 20);
//}
//}


//class Demo{
//void Demo(){
//System.out.println("Demo");
//}
//
//}
//
//public class Test{
//
//public static void main(String[] args){
//    Demo demo = new Demo();
//}
//}
















































