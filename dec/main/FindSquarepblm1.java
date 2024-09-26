package dec.main;

import java.util.Scanner;

import dec.fewreuse.FindSquare;

public class FindSquarepblm1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		FindSquare.getSquare(num);
		sc.close();
		
	}
}
