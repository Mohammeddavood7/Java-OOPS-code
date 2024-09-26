package Com.feb144.test;


abstract class BankAccount
{
	String accountH;
	double balance;
	
	
	
	
	public BankAccount(String accountH, double balance) {
		super();
		this.accountH = accountH;
		this.balance = balance;
	}
	public abstract void deposit(double amount);
	public abstract void widhDraw(double amount);
	public abstract String display();
	
}

class SavingsAccount extends BankAccount
{

	public SavingsAccount(String accountH, double balance) {
		super(accountH, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		
	}

	@Override
	public void widhDraw(double amount) {
		
		balance -= amount;
	}

	@Override
	public String display() {
		
		return "total balance : " +balance+"\n account holder"+accountH;
	}
	
}


class CurrentAccount extends BankAccount
{

	public CurrentAccount(String accountH, double balance) {
		super(accountH, balance);
		
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		
	}

	@Override
	public void widhDraw(double amount) {
		
		balance -= amount;
	}

	@Override
	public String display() {
		
		return "total balance : " +balance+"\naccount holder"+accountH;
	}
	
}


public class Testing1 
{
	public static void main(String[] args) 
	{
		BankAccount b;
		b = new SavingsAccount("suraj", 12223);
		b.deposit(200);
		String display = b.display();
		System.out.println(display);
		
	}

}
