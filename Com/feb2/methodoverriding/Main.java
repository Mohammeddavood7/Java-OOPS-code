package Com.feb2.methodoverriding;

//class NIT
//{	int name;
//		NIT(int name)
//		{	this.name = name;
//		}
//}
//public class OopsTest
//{	public static void main(String[] args) 
//{	NIT f1 = new NIT(10);
//	NIT f2 = new NIT(10);
//	NIT f3 = f2;
//	System.out.println(f1==f2);//false
//	System.out.println(f2==f3);//true 
//	System.out.println(f1.name==f2.name);//true
//	System.out.println(f2.name==f3.name);//true
//	System.out.println(f1!=f3);//true
//		}
//}


//public class OopsTest 
//{ 
//	public static void main (String args [ ] ) 
//	{ 
//		int nit1 [ ] = new int [10];
//		int nit2 [ ] = { 26,55,6,75,41 };
//		int nit3 [ ] = { -5,2,44,558,66,-8}; 
//		System.out.println (nit1.length); //10
//		System.out.println (nit2.length); //5
//		System.out.println (nit3. length); //6
//        } 
//}


//class NIT
//{
//	int a;
//	public NIT(int a) {
//		this.a=a;
//	}
//	static int getNum()
//	{
//		return this.a;
//	}
//}
//class NIT1 extends NIT
//{
//	int a;
//	public NIT1(int a,int b) {
//		super(a);
//		this.a=b;
//	}
//	int getVal()
//	{
//		return this.a;
//	}
//}
//class OopsMCQ{
//public static void main(String[] args)
//        {
//	NIT1 nit = new NIT1(74,152);
//	System.out.print(nit.getNum()+" "+nit.getVal());//74,152
//	}
//}



//class NIT
//{
//	public int nit() { 
//		return 10;
//	}
//	
//	protected  int nit1() 
//	{
//		return 5;
//	}
//}
//
//class NIT1 extends NIT
//{
//	@Override
//	public int nit() {
//		return super.nit();
//	}
//	
//	public int nit1() 
//	{
//		return 15;
//	}
//	
//	private int nit2() 
//	{
//		return 20;
//	}
//}
//
//class NIT2 extends NIT1
//{
//	public int nit() 
//	{
//		return 0;
//		
//	}
//	
//	int nit1() 
//	{
//		return 50;
//	}
//}
//class OopsTest
//{
//	public static void main(String[] args) {
//		NIT object = new NIT();
//		NIT object1 = new NIT1();
//		NIT object2 = new NIT2();
//		NIT1 object3 = new NIT2();		
//		System.out.println(object.nit()+object1.nit1()+object1.nit()+object3.nit1()+object2.nit1());  //10,15,10.eeror,15
//	}
//}//compiler error
//


//class NIT{
//	String name;
//	public NIT(String name) {
//		this.name=name;
//	}
//}
//class NIT1 extends NIT{
//	String programmingLanguage;
//	public NIT1(String programmingLanguage, String name) {
//		super(name);
//		this.programmingLanguage=programmingLanguage;
//	}
//}
//class NIT2 extends NIT{
//	String faculty;
//	public NIT2(String faculty) {
//		super("Naresh");
//		this.faculty=faculty;
//	}
//}
//class OopsTest{
//public static void main(String[] args) {
//	NIT nit = new NIT("Project");
//	System.out.print(nit.name+" ");//project 
//	NIT1 nit1= new NIT1("Java","NareshIT");
//	System.out.print(nit1.name+" "+nit1.programmingLanguage+" ");//NareshIT Java 
//	NIT2 nit2 = new NIT2("Naidu");
//	System.out.println(nit2.name+" "+nit2.faculty);//Naresh Naidu
//	}
//}


//class NIT
//{
//	static String val = "Welcome to nareshIT";
//	String language;
//	String faculty;
//	String student;
//	
//	public NIT(String language, String faculty, String student) {
//		this.faculty = faculty;
//		this.language = language;
//		this.student = student;
//	}	
//	public void get() 
//	{
//		System.out.println(this.faculty+" "+this.language+" "+this.student);
//	}
//}
//class OopsTest
//{
//	public static void main(String[] args) {
//		NIT nit = new NIT("Java", "Naresh", "IT");
//		nit.get();
//	}//Naresh Java IT
//}


//class NIT
//{
//	String val = "NareshIT";
//	String language;
//	String faculty;
//	String student;
//	
//	public NIT(String language, String faculty, String student) {
//		this.faculty = faculty;
//		this.language = language;
//		this.student = student;
//	}
//	
//	static public String get() 
//	{
//		return val; // line 1
//	}
//	
//	public void getValues() 
//	{
//		System.out.println(NIT.this.faculty+" "+NIT.language+" "+NIT.student); // line 2
//	}
//	
//}
//
//class OopsTest
//{
//	public static void main(String[] args) {
//		System.out.println("Welcome to "+NIT.get());
//		new NIT("Java", "Naresh", "IT");
//		
//		NITgetValues(); // line 3
//	}//Welcome to NareshIt 
//         //Naresh Java ITs
//}

//class A
//{
//	public void access(String x)
//	  {
//	    System.out.println("String is invoked :"+x);
//	  }
//
//	  public void access(Object x)
//	  {
//	    System.out.println("Object is invoked :"+x);
//	  }
//}
//public class Main2 
//{
//   public static void main(String[] args) 
//   {
//	  A a1 = new A(); 
//	  a1.access("Ravi");
//	  a1.access(null);
//   }
//}


//class B
//{
//	  public void access(Integer x) 
//	  {
//	    System.out.println("Autoboxing is invoked :"+x);
//	  }
//
//	  public void access(long x)  
//	  {
//	    System.out.println("Widening is invoked :"+x);
//	  }
//}
//public class Main3 {
//
//	public static void main(String[] args) 
//	{
//		B b1 = new B();
//		b1.access(15);
//
//	}
//
//}// Widening is invoked 15
//
//



//class C
//{
//	  public void access(Integer x) 
//	  {
//	    System.out.println("Autoboxing is invoked :"+x);
//	  }
//
//	  public void access(int ...x) 
//	  {
//	    System.out.println("Var-Args is invoked :"+x);
//	  }
//}
//public class Main4 {
//
//	public static void main(String[] args) 
//	{
//		C c1 = new C();
//		c1.access(15);
//
//	}
//
//}//



//class A
//{
//            public void access(Integer x)
//	  {
//	    System.out.println("Integer is invoked :"+x);
//	  }
//
//
//	public void access(String x)
//	  {
//	    System.out.println("String is invoked :"+x);
//	  }	 
//}
//public class Main4
//{
//   public static void main(String[] args) 
//   {
//	  A a1 = new A(); 
//	  a1.access("Ravi");
//	  a1.access(null);
//  
//   }
//}

//class Check
//{
//   public void accept(int y ,int ...x)
//   {
//      System.out.println(x[0] +":"+y[0]);
//   }
//}
//public class Test
//{
//  public static void main(String [] args)
//  {
//     Check c = new Check();
//     c.accept(12,56,89.90F,67.56F);
//  }
//} //COMPILER ERROR


//class Super
//{
//	private void show()
//	{
//		System.out.println("Show method of super class!!!!");
//	}
//}
//class Sub extends Super
//{
//	
//	public void show() 
//	{
//		System.out.println("Show method of sub class!!!!");
//	}
//}
//public class VisibilityMode 
//{
//	public static void main(String[] args) 
//	{
//		Super s = new Super();
//		s.show();
//	}
//}//compiler error



//class Super
//{
//	public void access(int ...x)
//	{
//	  System.out.println("Var args method :"+x[0]);	
//	}
//}
//class Sub extends Super
//{	
//
//	public void access(int x)
//	{
//		//System.out.println("Sub.access()");
//	  System.out.println("Instance method :"+x);	
//	}
//	
//}
//public class Overriding 
//{
//	public static void main(String[] args)
//	{
//		Super s1 = new Super();  s1.access(10);
//		
//		Sub s2 = new Sub(); s2.access(20);
//		
//		Super s3 = new Sub(); s3.access(30);
//	}
//}
//



//class Super
//{
//	public void access(long x)
//	{
//	  System.out.println("Widening");	
//	}
//}
//class Sub extends Super
//{	
//	public void access(Integer x)
//	{
//	  System.out.println("Autoboxing");	
//	}
//	
//}
//public class OverloadingWithSuperAndSub 
//{
//
//	public static void main(String[] args)
//	{
//		Sub s1 = new Sub(); s1.access(30);
//	}
//}



class Super
{
	public void accept()
	{
		System.out.println("Super class");
	}
}
class Sub extends Super
{
	public void accept()
	{
		System.out.println("sub class ");
	}
	
	
	public void accept1()
	{
		System.out.println("sub class ");
	}
	
	
}

public class Main
{
    public static void main(String[] args)
    {
		Super s =new Sub();
		Sub s1 = new Sub();
		s1.accept1();
	}	
}
























