package dec.main;
import dec.reuse.CheckSpyNum;
import java.util.Scanner;


public class PrintAndCheckSpyNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		CheckSpyNum.getSpyNumber(num);
		sc.close();
		
	}

}
