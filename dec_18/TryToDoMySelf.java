package dec_18;

import java.util.Scanner;
public class TryToDoMySelf 
{
	public static void main(String[] args) 
	{
		int stop=1;
	
		
		while(stop!=0)
		{
		Scanner obj= new Scanner(System.in);
		System.out.println("\n----------Welcome to Calculator----------");
	    System.out.println("1.Additon of two number\n"+"2.Sabtraction of two number\n"+"3.Division of two number\n"+"4.Multiplication of two number\n"+"5.Exit");
	    System.out.println("\nchoose you option: ");
	    int op = obj.nextInt();
	    if(op!=5)
	    {
	    System.out.println("Enter 2 number(+-/*)");
	    }
	    else System.out.println("Exit/Out by program");
		int a = obj.nextInt();
		int b = obj.nextInt();
		int result;
		
	    switch(op)
		{
	    case 1: result = MySelf.add(a,b);
		System.out.println("\nAddition: "+result);
		break;
		
	    case 2: result = MySelf.sub(a,b);
		System.out.println("\nSabtraction: "+result);
		break;
		
	    case 3: result = MySelf.div(a,b);
		System.out.println("\nDivision: "+result);
		break;
		
	    case 4: result = MySelf.mul(a,b);
		System.out.println("\nMultiplication: "+result);
		break;
	    case 5: stop=0; break; 
		}
	    
		}
		
	}
	

}

 class MySelf
{
	public static int add(int a ,int b)
	{
	  
	  return a+b;
	}
	public static int sub(int a,int b)
	{
		
		return a-b;
	}
	
	public static int div(int a,int b)
	{
		if(b!=0)
		{
		return a/b;
		}
		else 
		{
			System.out.println("Division by '0' not possibel.");
			return 0;
		}
	}
	
	public static int mul(int a,int b)
	{
		
		return a*b;
	}

}
