package Com.mar7.labClass;

import java.util.Scanner;

public class TryCatch
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		
		try
		{
			System.out.print("Enter the Number: ");
			int a = sc.nextInt();
			
			System.out.print("Enter the Number: ");
			int b = sc.nextInt();
			
			int res = a/b;
			System.out.println("Final Answer: "+ res);
		}
		catch(Exception e)
		{
			System.err.println("divided by value should be positive!!!");
			
		}
		sc.close();
	}

}
