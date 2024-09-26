package Com.feb07.finalkeyword;

public class Final
{
   final int A;
   
//   public void calculate()
//   { 
//	   A = 30;
//	   System.out.println(A);//error
//   }
   
   
   
//   {
//	   A = 30;
//   }
   
   public Final(int x)
   {
	   A = x;
	   
   }
   
   public static void main(String[] args) 
   {
	   Final f = new Final();
	   //f.calculate();
	   System.out.println(f.A);
	
   }
	
}
