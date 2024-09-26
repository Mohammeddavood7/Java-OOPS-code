package Com.feb23.methodreferencing;

//interface NIT
//{
//	public int myInterface(int a);
//}
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (int a) -> a*5;
//		int i = nit.myInterface(6);
//		System.out.println(i);
//	}
//}


//interface NIT
//{
//	public int myInterface(int a);
//}
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (String a) -> a*5;
//		int i = nit.myInterface(6);
//		System.out.println(i);
//	}
//}


//interface NIT
//{
//	void myInterface(int a);
//	
//}
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (int a) -> System.out.println(a+5);
//	}
//}


//interface NIT
//{
//	void myInterface(int a);
//	
//}
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (int a) -> System.out.println(a+5);
//		nit.myInterface(15);
//	}
//}

//interface NIT
//{
//	void myInterface(int a);
//	default void defalutFunction() 
//	{
//		System.out.println("Naresh I Technologies");
//	}
//	
//}
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (int a) -> System.out.println(a/5);
//		nit.myInterface(15);
//	}
//}


//interface NIT
//{
//	void myInterface(int a);
//	default void defalutFunction() 
//	{
//		System.out.println("Naresh I Technologies");
//	}
//	
//}
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (int a) -> System.out.println(a/5);
//		nit.myInterface(15);
//	}
//}


//public class Java8 {
//	public static void main(String[] args) {
//		String a = (a) -> {return "NareshITechnologies";};
//	}
//} 


//interface NIT
//{
//	String myInterface();
//}
//public class Java8
//{
//  public static void main(String[] args) {
//		NIT nit = () -> {return "NareshITechnologies";};		
//	}
//}



//interface NIT
//{
//	String myInterface();
//}
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = () -> {return "NareshITechnologies";};
//		System.out.println(nit.myInterface());
//	}
//}





//interface NIT
//{
//	void myInterface(int a, int b);
//}
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (int a, int b) -> System.out.println(a+b);
//		nit.myInterface(5, 10);
//	}
//}



//interface NIT
//{
//	int myInterface(int a, int b);
//}
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (int a, int b) -> System.out.println(a+b);
//		nit.myInterface(5, 10);
//	}
//}


//interface NIT
//{
//	int myInterface(int a, int b);
//}
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (int a, int b) ->
//		{
//			return a+b;
//		};
//	}
//}


//interface NIT
//{
//	int myInterface(int a, int b);
//}
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (a, b) ->
//		{
//			int div = a/b;
//			int addition = a+b;
//			return addition;
//		};
//	}
//}


//interface NIT
//{
//	int myInterface(int a, int b);
//}
//public class Java8 {
//	int calculate(int i, int j, NIT nit)
//	{
//		return nit.myInterface(i,j);
//	}
//	public static void main(String[] args) {
//		NIT addition = (a,b) -> a+b;
//		NIT multiplication = (a,b) -> a*b;
//		NIT division = (a,b) -> a/b;
//		Java8 java = new Java8();
//		int result = java.calculate(15, 5, multiplication);
//		System.out.println(result);
//	}
//}


//interface NIT
//{
//	int myInterface(int a, int b);
//}
//public class Java8 {
//	int calculate(int i, int j, NIT nit)
//	{
//		return nit.myInterface(i,j);
//	}
//	public static void main(String[] args) {
//		int result = 0;
//		NIT addition = (a,b) -> a+b;
//		NIT multiplication = (a,b) -> a*b;
//		NIT division = (a,b) -> a/b;
//		Java8 java = new Java8();
//		result = java.calculate(15, 5, multiplication);
//		System.out.println(result);
//		result = java.calculate(result, result, addition);
//		System.out.println(result);
//		result = java.calculate(result, result, division);
//		System.out.println(result);
//	}
//}













//public class Java8
//{
//	interface NIT 
//	{
//		int myInterface(int a, int b); 
//	}
//	
//	public static void main(String[] args) {
//		NIT nit = (int a, int b) -> a/b;
//		int a = nit.myInterface(15, 110);
//		System.out.println(a);
//	}
//}



//interface NIT
//{
//	String myInterface(String a);
//}
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (a) -> {return a;};
//		System.out.println(nit.myInterface("NIT"));
//	}
//}

//interface Calculate
//{
//	int myinterface(int a, int b);
//}
//
//interface NIT
//{
//	String myInterface(String a);
//}
//public class Java8 {
//	public static void main(String[] args) {
//		Calculate cal = (a) -> a+5;
//		cal.myinterface(1, 5);
//		NIT nit = (a) -> {return a;};
//		System.out.println(nit.myInterface("NIT"));
//	}
//} 



interface Calculate
{
	int myinterface(int a, int b);
}
interface NIT
{
	String myInterface(String a);
}

public class Java8 
{
	
	private void operation(int a, int b, Calculate cal) 
	{
		System.out.println(cal.myinterface(a, b));//behaviour modification takes
	}
	
	public static void main(String[] args)
	{
		Java8 java = new Java8();
		Calculate cal = (a,b) -> a+b;
		java.operation(1, 5, cal); //6
		cal = (a,b) -> a*b;
		java.operation(17, 0, cal); //0
		NIT nit = (a) -> {return a;};
		System.out.println(nit.myInterface("NIT"));//NIT
	}
}






//interface NIT
//{
//	String myInterface(String a);
//}
//public class Java8 {
//	
//	public static void main(String[] args) {
//		
//		//without parameter
//		NIT nit = information -> System.out.println("Welcome to " + information);
//		nit.myInterface("NIT");
//	}
//}

//interface NIT
//{
//	void myInterface(String a);
//}
//public class Java8 {
//	
//	public static void main(String[] args) {
//		
//		//without parameter
//		NIT nit = information -> System.out.println("Welcome to " + information);
//		nit.myInterface("NIT");
//	}
//}
























