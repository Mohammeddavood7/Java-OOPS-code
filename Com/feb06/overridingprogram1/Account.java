package Com.feb06.overridingprogram1;

public class Account
{
	private String accountNumber;
	private double balance;
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//getter
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	//setter
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//co-variate method
	public Account generateStatement()
	{
		System.out.println("Generic statement generator for all types of accounts");
	     return new Account(accountNumber, balance);
	}
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
	
	
	

}
