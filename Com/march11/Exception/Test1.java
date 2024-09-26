package Com.march11.Exception;

public class Test1
{
	public void checkException()
	{
//		 try
//		 {
//			 int num1=30,num2=0;
//			 int operation=num1/num2;
//			 System.out.println("Result:"+ operation);
//		 }
//		 catch(ArithmeticException e)
//		 {
//		    System.out.println("You Shouldn't divide a number by zero");
//		 } 
	
//			try
//			{
//				int a[]=new int [50];
//				a[6]=20;
//			}
//			catch (ArrayIndexOutOfBoundsException a)
//			{
//			    System.out.println("Array Index Out Of Bounds");
//			}
		
		
		try
		 {
		    String str = "Hello World";
		    System.out.println(str.length());
			char c=str.charAt(0);
			c=str.charAt(40);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException s)
		{ 
		   System.out.println("String Index Out Of Bounds Exception !");
		}


	
	
	
	
	 }
	
	
	 public static void main(String[] args) 
	 {  
		 Test1 t = new Test1();
		 t.checkException();
		 

		
	}

}
