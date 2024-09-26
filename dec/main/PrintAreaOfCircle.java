package dec.main;

import java.util.Scanner;
import java.text.DecimalFormat;
import dec.reuse.AreaOfCircle;

public class PrintAreaOfCircle {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		double num = sc.nextDouble();
		String areaOfCircle = AreaOfCircle.getAreaOfCircle(num);		
		double objdouble = Double.parseDouble(areaOfCircle);
		
		DecimalFormat df = new DecimalFormat("00.00");
		System.out.println("Area of Circle: "+df.format(objdouble));
		
		sc.close();
	}

}
