package Com.feb20.task;

import java.util.function.Consumer;

//interface Cube
//{
//	int cube(int b);
//}
//public class FunctionalInterface 
//{
//	
//	public static void main(String[] args) {
//		int a = 21;
//		
//		Cube cube = b -> b*b*b;
//		System.out.println(cube.cube(a));
//	}
//}//compiler error


//@FunctionalInterface
//interface Str
//{
//	int methodStr(String str);
//}
//
//public class FunctionalInterface1 
//{
//	public static void main(String[] args)
//	{
//		Str str =  s -> s.length();
//		
//		System.out.println(str.methodStr("2"));
//	}
//}


//@FunctionalInterface
//interface Str
//{
//	int methodStr(String str);
//}
//public class FunctionalInterface1 {
//	public static void main(String[] args) {
//		Str str =  s -> 2;
//		System.out.println(str.methodStr("5"));
//	}
//}//compiler error

//public class FunctionalInterface1
//{
//	public static void main(String[] args) 
//        {
//		String str  -> str.compareTo("goolge");
//		System.out.println(str);
//	}
//}//compiler error
//

//@FunctionalInterface
//interface NIT
//{
//	String get(String nit);
//}
//public class FunctionalInterfaceExample
//{
//	public static void main(String[] args) {
//		NIT nit = (str) -> str +"Welcome to"; // str concatenate to "Welcome to" 
//		NIT nit1 = (str) -> str + "NARESHIT"; // str1 concatenate to "NARESHIT"
//		information("Hai ", nit); // HAI + Welcome to
//		information("Hai ", nit1); // HAI + NARESHIT
//	}
//	public static void information(String str, NIT obj) {
//		String result = obj.get(str);
//		System.out.println(result);
//	}
//}//HAI + Welcome to
 //HAI + NARESHIT



//@FunctionalInterface
//interface NIT
//{
//	String myInterface(String a);
//	String newInterface();
//	
//}


//@FunctionalInterface
//interface NIT{
// int square(int x);
// default int add(int a, int b){
//     return a+b;
// }
// default int sub(int a, int b){
//     return a-b;
// }
// static int multiply(int a, int b){
//     return a*b;
// }
// static int divide(int a, int b){
//     return a/b;
// }
//}
//public class FunctionalInterfaceExample implements NIT{
// public static void main(String[] args){
//     int a = 25;
//     int b = 5;
//     FunctionalInterfaceExample fun = new FunctionalInterfaceExample();
//     int add = fun.add(a,b);
//     int sub = fun.sub(a,b);
//     int mul = NIT.multiply(a,b);
//     int div = NIT.divide(a,b);
//     System.out.println(add+" "+sub+" "+mul+" "+div+" "+fun.square(6));
//} 
// @Override
// public int square(int x) {
//     return x*x;
// }
//}

//@FunctionalInterface
//interface NIT{
// int square(int x);
// static int add(int a, int b){
//     return a+b;
// }
// static int sub(int a, int b){
//     return a-b;
// }
// static int multiply(int a, int b){
//     return a*b;
// }
// static int divide(int a, int b){
//     return a/b;
// }
//}
//public class FunctionalInterfaceExample{
// public static void main(String[] args){
//     int a = 25;
//     int b = 5;  
//     int add = NIT.add(a,b);
//     int sub = NIT.sub(a,b);
//     int mul = NIT.multiply(a,b);
//     int div = NIT.divide(a,b);
//     System.out.print(add+" "+sub+" "+mul+" "+div+" ");
//      
//     NIT sq = (x) -> 
//     {
//    	 return x*x;
//     };
//     System.out.print(sq.square(6));
// }
//}



// public class FunctionalInterfaceExample
//{
//	public static void main(String[] args)
//    {
//		Function<String, String> fun = str -> str.substring(2, 5);
//		System.out.println(fun.apply("Hyderabad"));
//	}
//}


//@FunctionalInterface
//interface NIT
//{
//	String myInterface(String a);
//	default void nit() 
//	{
//		
//	}
//	default int newInterface(int a) 
//	{
//		return a;
//	}
//}



//@FunctionalInterface
//interface NIT
//{
//	String myInterface(String a); //abstract method 
//	int hashCode(); //Object class methods
//	String toString();	
//    boolean equals(Object obj);
//    //public Class getClass();
//    
//}

//interface demo
//{
//	void show();
//}
//class domo1 implements demo
//{
//	public void show()
//	{
//		
//	}
//}




//@FunctionalInterface
//interface NIT
//{
//	String myInterface(String a); //abstract method
//	@Override
//	String toString(); //Object class method
//	void wait();
//	void notify();
//	
//}//compiler error


//public class FunctionalInterfaceExample
//{
//	public static void main(String[] args) 
//	{
//		String str[]= {"Java","Python","Naresh","IT"};
//		
//		Predicate<String> prediacte = p -> p.endsWith("va");
//		for(String s: str) 
//		{
//			if(prediacte.test(s))
//				System.out.println(s);
//		}
//	}
//}


//interface NIT
//{
//	public int myInterface(int a);
//}
//
//public class Java8 {
//	public static void main(String[] args) 
//	{
//		 NIT nit = a -> a+1;
//		 int myInterface = nit.myInterface(6);
//		System.out.println(myInterface);
//	}
//}


//interface NIT
//{	
//	int myInterface(int a);
//}
//
//@FunctionalInterface
//interface NewInterface
//{
//	void alpha(String a);
//}
//
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (a) -> a*a*a;
//		System.out.println(nit.myInterface(5));
//		NewInterface result = (a) -> System.out.println("Welcome to NareshIT");
//		result.alpha("");
//	}
//}


//public class Java8<T>  
//{
//	public static void main(String[] args) 
//	{
//		Consumer<Integer> value = (a) -> System.out.println(a*3);
//		value.accept(5); 
//	}
//}


//interface Add
//{
//	int add(int b);
//	int add(int a, int b);
//}
//public class FunctionalInterface {
//	public static void main(String[] args) {
//		//int a = 21;
//		Add add = b -> b+b;
//		add.add(3);
//		Add add1 = (c,d) ->{ return c+d};
//		add1.add(12, 12);
//		System.out.println(add.add(a));
//	}
//}





















































































































































































	









































































