package dec.main;

//import java.util.Scanner;

import dec.reuse.FindSquare;
//public class FindSquare1
//{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the Number: ");
//		int num = sc.nextInt();
//		   int square = FindSquare.getSquare(num);
//		   System.out.println("Square of "+num +" is = "+square);
//		   sc.close();
//
//	}
//	
	

public class FindSquare1
{
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Square of "+i+" is = "+FindSquare.getSquare(i));
		}
		
	}

}
