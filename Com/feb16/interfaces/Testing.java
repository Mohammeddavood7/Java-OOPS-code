package Com.feb16.interfaces;

interface AdvanceArithmetic
{
	public abstract int divisorSum(int n);
}

 class Mycalculator implements AdvanceArithmetic
{
	 @Override
	 public int divisorSum(int n)
	 {
		 int sum = 0;
		 for(int i=1;i<=n;i++)
		 {
			 if(n%i==0)
			 {
				 sum = sum+i;
			 }
			
		 }
		System.out.print("divisor of "+n+" are sum: ");
		 return sum;
	 }
}

 public class Testing
 {
	 public static void main(String[] args)
	 {
		AdvanceArithmetic aa;
		aa = new Mycalculator();
		int divisorSum = aa.divisorSum(6);
		System.out.println(divisorSum);
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 