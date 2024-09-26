import java.util.Scanner;

public class Armstrong 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		double a = sc.nextDouble();
		sc.close();
	  if(calculate(a))
	  {
		  System.out.println("Yes, it is a ArmstronNum:"+a);
	  }
	  else
	  {
		  System.out.println("N0, it is a ArmstronNum:"+a);
	  }
	}
	
	public static boolean calculate(double arm)
	{
		double original,rem,n=0 ,result = 0;
		original = arm;
		
		
		while(original!=0)
		{
			original/=10;
			++n;
		}
		
		
		while(original!=0)
		{
			rem = original%10;
			result += Math.pow(rem,n);
			original/=10;
			
		}
		return (original == result);
	}
	

}
