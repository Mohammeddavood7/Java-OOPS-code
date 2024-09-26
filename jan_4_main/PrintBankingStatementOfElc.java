package jan_4_main;

import java.util.Scanner;

public class PrintBankingStatementOfElc
{

	public static void main(String[] args) 
	{
		BankingStatementOfBlc bank = new BankingStatementOfBlc();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the user name: ");
		String userName = sc.nextLine();
		System.out.print("Enter the Account number: ");
		long accountName = sc.nextLong();
		System.out.print("Enter the Mobile number: ");
		long MobileNo = sc.nextLong();
		System.out.print("Enter the City name: ");
		String cityName = sc.nextLine();
	    cityName = sc.nextLine();
		bank.bankCreateAcount(userName, accountName,  MobileNo, cityName);
		String string = bank.toString(); 
		System.out.println(string);
	    
		System.out.print("Enter the Amount to Deposite: ");
		long deposite = sc.nextLong();
		bank.bankDeposit(deposite);
		sc.close();
		BankingStatementOfBlc.bankhCeckBalance();

	}

}
