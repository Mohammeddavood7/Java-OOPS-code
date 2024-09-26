package dec_18;

import java.util.Scanner;

public class Command {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter quantity of chicken rolls ");
		int cn = Integer.parseInt(obj.nextLine());
		System.out.println("Enter quantity of vegetable puffs");
		int vg = Integer.parseInt(obj.nextLine());
		int vgs = 25 * vg;
		int cns = 60 * cn;
		int sum = vgs + cns;
		System.out.println("Enter, if it is yoga day(y/n) 50rs off");
		char s = obj.nextLine().charAt(0);
		if (s == 'y' || s == 'Y')
		{
			int sum1 = sum - 50;
			System.out.println("Total bill of your order with yoga day 50rs.off : " + sum1);
		} else
			System.out.println("Total bill of your order : " + sum);

	}

}
