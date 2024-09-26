package dec_18;

import java.util.Scanner;

public class Sumoftwodigit {
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the two digits number ");
		int n = Integer.parseInt(obj.nextLine());
		int sum=0,a=0,b=0;
			 a = n%10;
			 b = n/10;
			 sum = a+b;
		System.out.println("Sum of two digits: "+sum);
		obj.close();
			}

}
