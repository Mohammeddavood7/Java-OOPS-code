package Com.feb20.task;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo
{
	public static void main(String[] args)
	{
		  Predicate<Integer> typeInterger = bl -> true; 
		 System.out.println(typeInterger.test(14));
		 
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number: ");
		  Integer num = sc.nextInt();
		 Predicate<Integer> isEven = bl -> bl%2==0; 
		 System.out.println(isEven.test(num));
		 
		 System.out.print("Enter the Name: ");
		 String name = sc.next();
		 
		 Predicate<String> len = bl -> bl.length()==4;
		 System.out.println(len.test(name));
		 sc.close();
		 
		 
		
	}

}
