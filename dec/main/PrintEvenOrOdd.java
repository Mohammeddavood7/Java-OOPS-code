package dec.main;

import java.util.Scanner;

import dec.reuse.EvenOrOdd;

public class PrintEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number(ChecK Even/Odd): ");
		int num = sc.nextInt();
		String even = EvenOrOdd.isEven(num);
		System.out.println(even);
		sc.close();
		

	}

}
