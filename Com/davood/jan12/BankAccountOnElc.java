package Com.davood.jan12;

public class BankAccountOnElc 
{
	public static void main(String[] args)
	{
		BankAccount bA = new BankAccount(1000);
		bA.deposit(2500);
		System.out.println("After deposit of amount: "+bA.getBalance());
		bA.withdraw(387);
		System.out.println("After width of amount: "+bA.getBalance());
		double calculateInterest = bA.calculateInterest();
		System.out.println("Interest earned on balance amount is: "+calculateInterest);
		
	}

}
