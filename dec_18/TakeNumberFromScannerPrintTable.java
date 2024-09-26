package dec_18;

import java.util.Scanner;

public class TakeNumberFromScannerPrintTable 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Table number: ");
		int t = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(t+" *  "+i+" = "+(t*i));
		}
		sc.close();
	}

}
