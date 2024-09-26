package jan_4;

public class BankStatementBlc 
{
	private double balance =1000;
	
	public void withDraw(double amount)
	{
		if(amount>0)
		{
		balance =balance - amount;
		}
		else
		{
			System.out.println("Withdraw value must be positive !!!");
		}
	}
	
	public void deposit(double deposit)
	{
		if(deposit>0)
		{
		balance = balance + deposit;
		}
		else
		{	
			System.out.println("Deposite value must be in positive !!!");
		}
	}

	@Override
	public String toString() 
	{
		return "BankStatementBlc [balance=" + balance + "]";
	}
     
}
