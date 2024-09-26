package dec.main;

import java.util.Scanner;
import dec.reuse.Calculator;
public class FindSquareAndCube
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
     int num = sc.nextInt();
	 int squareAndCube = Calculator.getSquareAndCube(num);
	 System.out.println(squareAndCube);
	 sc.close();
	
	
}
}

