package Com.feb06.overridingprogram1;

public class BankManagementSystem
{
	public static void main(String[] args)
	{
		
		Account a;
		a = new SavingAccount("SBI0001",100000, 10);
		System.out.println(a.generateStatement());
		a = new CheckingAccount("CBI0002", 200000, 999999);
		System.out.println(a.generateStatement());
		
	
	}
}
