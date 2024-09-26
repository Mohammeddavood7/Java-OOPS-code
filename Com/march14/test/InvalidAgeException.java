package Com.march14.test;

import java.util.Scanner;

@SuppressWarnings("serial")
public class InvalidAgeException extends RuntimeException
{
	
	public InvalidAgeException()
	{
		super();
	}
	public InvalidAgeException(String errmsg)
	{
		super(errmsg);
	}
	
	
	
	public static void vote(int age)
	{
		if(age < 18)
		{
			throw new InvalidAgeException("for vote age should above 18.");
		}
		else
		{
			System.out.println("Person is eligible for vote..");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.print("Enter the AGE: ");
			int age = sc.nextInt();
			vote(age);
			
		}
		catch(InvalidAgeException e)
		{
		   System.err.println(e.getMessage());	
		}
				
	}

}
























































