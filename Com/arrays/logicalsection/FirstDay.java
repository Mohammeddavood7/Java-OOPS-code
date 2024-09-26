package Com.arrays.logicalsection;

import java.util.Scanner;

public class FirstDay 
{
	public static void main(String [] args)
	
	{
		Scanner sc = new Scanner(System.in);
		int value;
		char choice;
		
		do
		{
			System.out.print("Enter the element you want to store: ");
			value = sc.nextInt();
			System.out.println("Enter the choice if you want to store more elements: ");
			System.out.print("For Yes Press y or Y");
			System.out.print(", For No Press n or N: ");
			choice = sc.next().charAt(0);
			
		}while(choice=='y'||choice=='Y');
		
		System.out.println("The element which you had stored is: "+value);
	}

}
