package Com.jan23_heriachal;

import java.util.Scanner;

public class ElcFileOnShapeCircleRectangle 
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the Area of Square: ");
	   int sq = sc.nextInt();
	   new Square(sq).getSquare();

	   System.out.print("Enter the Radius of the circle : ");
	   int radius = sc.nextInt();
	   new Circle(radius).getCircleRadius();
	   
	   System.out.print("Enter the width and length: ");
	   int width = sc.nextInt();
	   int len = sc.nextInt();
	   new Rectangle(width, len).getRectangleResult();
	     sc.close();
	
	}
}
