package dec.main;

import java.util.Scanner;

import dec.reuse.EvenOrOddWithBoolean;

public class GetEvenOrOddWithBoolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number E/O: ");
		int even = sc.nextInt();
		boolean even2 = EvenOrOddWithBoolean.getEven(even);
		System.out.println("It is Even: "+even2);
		sc.close();

	}

}

