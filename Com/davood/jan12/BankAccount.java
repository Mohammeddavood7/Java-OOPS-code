package Com.davood.jan12;

public class BankAccount 
{
	private double balance;
	private  double interestRate;
	
	{
		interestRate = 0.01;
	}

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	
	public void withdraw(double wdAmount)
	{
		this.balance = this.balance - wdAmount;
	}
	public double getBalance()
	{
		return this.balance;
	}
	
	public double calculateInterest()
	{
		return interestRate*this.balance;
		
	}
	
	
	

}
