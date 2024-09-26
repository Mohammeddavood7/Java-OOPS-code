package Com.jan31.labquestion;

//class Test {
//	public void accept(long... b) {
//		System.out.println("long :");
//	}
//
//	public void accept(double... s) {
//		System.out.println("double :");
//	}
//
//	public void accept(float... s) {
//		System.out.println("float :");
//	}
//}
//
//public class AmbiguityDemo1 {
//	public static void main(String[] args) {
//		Test t1 = new Test();
//		t1.accept();
//	}
//}


//class Test
//{	
//	    
//	public void accept(byte ...s)
//	{
//		System.out.println("byte :");
//	}	
//	
//	public void accept(short ...s)
//	{
//		System.out.println("short :");
//	}	
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test();
//		t1.accept();
//
//	}
//}

//class Test
//{		    
//	public void accept(int ...s)
//	{
//		System.out.println("int :");
//	}	
//	
//	
//	public void accept(boolean ...s)
//	{
//		System.out.println("boolean :");
//	}	
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test();
//		t1.accept();
//
//	}
//}
//

//class Test
//{	
	    
//	public void accept(int ...s)
//	{
//		System.out.println("int :");
//	}	
//	
//	public void accept(short ...s)
//	{
//		System.out.println("short :");
//	}
	
    
//public void accept(int ...s)
//{
//	System.out.println("int :");
//}	
//
//public void accept(short s)
//{
//	System.out.println("short :");
//}	
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test();
//		t1.accept();
//	}
//}

//class Test
//{		    
//	public void accept(int ...s)
//	{
//		System.out.println("int :");
//	}	
//	
//	public void accept(char ...s)
//	{
//		System.out.println("char :");
//	}	
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test();
//		t1.accept();
//
//	}
//
//}

//	class Test
//	{	    
//		public void accept(byte b, int i) {
//			System.out.println("byte-int");
//		}
//		public void accept(int i, byte b) {
//			System.out.println("int-byte");
//		}
//	}
//	public class AmbiguityDemo1
//	{
//		public static void main(String[] args) 
//		{
//			Test t1 = new Test();  
//			t1.accept(1,(byte)2);
//
//		}
//
//	}

//class Test
//{		    
//	public void accept(byte b, int i) {
//		System.out.println("byte-int");
//	}
//	public void accept(int i, byte b) {
//		System.out.println("int-byte");
//	}
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test(); 
//		byte b1 = 1;
//		byte b2 = 2;
//		t1.accept(b1, b2);
//	}
//}

//class Test
//{		    
//	public void accept(int b, int i) {
//		System.out.println("int-int");
//	}
//	public void accept(int i, byte b) {
//		System.out.println("int-byte");
//	}
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test(); 
//		byte b1 = 1;
//		byte b2 = 2;
//		t1.accept(b1, b2);
//
//	}
//}

//class Test
//{		    
//	public void accept(int b, int i) {
//		System.out.println("int-int");
//	}
//	public void accept(Byte i, int b) {
//		System.out.println("byte-int");
//	}
//	public void accept(Byte b1 , byte b2) {
//		System.out.println("Byte-byte");
//	}
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test(); 
//		byte b1 = 1;
//		byte b2 = 2;
//		t1.accept(b1, b2);
//	}
//}

//class Test
//{		    
//	public void accept(int b, int i) {
//		System.out.println("int-int");
//	}
//	public void accept(Byte i, int b) {
//		System.out.println("byte-int");
//	}
//	public void accept(Byte b1 , byte b2) {
//		System.out.println("Byte-byte");
//	}
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test(); 
//		byte b1 = 1;
//		byte b2 = 2;
//		t1.accept(b1, b2);
//	}
//}



//class Test
//{		    
//	public void accept(int b, Integer i) {
//		System.out.println("int-Integer");
//	}
//	public void accept(long i, int b) {
//		System.out.println("long-int");
//	}
//	public void accept(long i, Object b) {
//		System.out.println("long-Object");
//	}
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test(); 
//		t1.accept(2,4);
//
//	}
//
//}

//class Test
//{		    
//	public void accept(int b, Integer i) {
//		System.out.println("int-Integer");
//	}
//	
//	public void accept(Byte b, byte i) {
//		System.out.println("Byte-byte");
//	}
//	
//	public void accept(byte... l) {
//		System.out.println("byte...");
//	}
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test(); 
//		t1.accept(2,4);
//		
//		byte b1 = 8;
//		byte b2 = 9;		
//		t1.accept(b1, b2);

//	}
//}

//class Test
//{		    
//	public void accept(int ...s)
//	{
//		System.out.println("int var args :");
//	}	
//	
//	public void accept(int x, int ...y)
//	{
//		System.out.println("int int var args");
//	}	
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test();
//		t1.accept();
//
//	}
//}
	
//class Test
//{		    
//	public void accept(int x)
//	{
//		System.out.println("int");
//	}	
//	
//	public void accept(long y)
//	{
//		System.out.println("long");
//	}	
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test();
//		t1.accept(9);
//
//	}
//}


//class Test
//{		    
//	public void accept(String x)
//	{
//		System.out.println("String");
//	}
//	
//	public void accept(Integer x)
//	{
//		System.out.println("String");
//	}	
//	
//	public void accept(Object y)
//	{
//		System.out.println("Object");
//	}	
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test();
//		t1.accept(null);
//
//	}
//}

//class Test
//{		    
//	public void accept(Integer x)
//	{
//		System.out.println("Integer");
//	}	
//	
//	public void accept(long y)
//	{
//		System.out.println("long");
//	}	
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test();
//		t1.accept(15);
//
//	}
//}//long


//class Test
//{		    
//	public void accept(Integer x)
//	{
//		System.out.println("Integer");
//	}	
//	
//	public void accept(int ...y)
//	{
//		System.out.println("var args");
//	}	
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test();
//		t1.accept(15);
//
//	}
//}//Integer

//class Test
//{		    
//	public void accept(long x)
//	{
//		System.out.println("long");
//	}	
//	
//	public void accept(int ...y)
//	{
//		System.out.println("var args");
//	}	
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test();
//		t1.accept(15);
//
//	}
//}//

//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("String array variable");
//	}
//	
//	public static void main(String args) 
//	{
//		System.out.println("String variable");
//	}
//}//String array variable


//public class AmbiguityDemo1
//{
//	public static void main(int[] args) 
//	{
//		System.out.println("int array variable");
//	}
//	
//	public static void main(String args) 
//	{
//		System.out.println("String variable");
//	}
	
	//public static void main(String[] args) {
		

//	Integer x = 14;
//	int b1 = x.intValue();//1.4
//	int b2 = x;//1.5
//	System.out.println(b1);
//	System.out.println(b2);
//	
//	Long l = 24l;
//	//long ll = l;
//	System.out.println(l.longValue());
//	//buffer value : 0 - 127
//	Long l1 = (333l);
//	Long l2 = (333l);
//	System.out.println(l1==l2);
//	//strictly equal
//	System.out.println(l1.equals(l2));
//	
//	Float f = 444.0f;
//}
//}
	
	
//	class Test
//	{
//		public void accept(float a,  int b)
//		{
//			System.out.println("float - int");
//		}
//		
//		void accept(int a, int b)
//		{
//			System.out.println("int - float");
//		}	
//	}
//
//
//	public class AmbiguityDemo1 {
//
//		public static void main(String[] args) 
//		{
//			Test t1 = new Test();  
//			t1.accept(20, 30); //error	
//		}
//
//	}
//
//


//
//	class Test
//	{
//		
////		byte x = (byte)10;
//		//byte x =10;
//		
//		public void accept(int ...s)
//		{
//			System.out.println("int var args :");
//		}	
//		
//		public void accept(int x, int ...y)
//		{
//			System.out.println("int int var args");
//		}	
//	}
//	public class AmbiguityDemo1
//	{
//		public static void main(String[] args) 
//		{
//			Test t1 = new Test();
//			t1.accept(9);
//
//		}
//	}

//class Test
//{
//	float x = 2000l;
//	
//	
//	public void accept(Integer x)
//	{
//		System.out.println("Integer");
//	}	
//	
//	public void accept(int ...y)
//	{
//		System.out.println("var args");
//	}	
//}
//public class AmbiguityDemo1
//{
//	public static void main(String[] args) 
//	{
//		Test t1 = new Test();
//		t1.accept(15);
//
//	}
//}s


class Test
{		    
	public void accept(int ...s)
	{
		System.out.println("int var args :");
	}	
	
	public void accept(long x, int ...y)
	{
		System.out.println("int int var args");
	}	
}
public class AmbiguityDemo1
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.accept(9);

	}
}




































































































































