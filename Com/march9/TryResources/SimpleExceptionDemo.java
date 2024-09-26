package Com.march9.TryResources;

import java.util.Scanner;

public class SimpleExceptionDemo 
{
	public static void main(String[] args)
	{ 
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("enter the number: ");
			int a = sc.nextInt();
			System.out.print("enter the number: ");
			int b = sc.nextInt();
			int res = a/b;
			System.out.println("Result: "+res);
		}
		catch(Exception e)
		{
			System.err.println("don't divide by zero ");
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.err.println(e.toString());
		}
		finally
		{
			sc.close();
		}
		
	}

}















































