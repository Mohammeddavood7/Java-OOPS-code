package Com.feb17.interfacelabtask;

public class ICICI implements BankInterface 
{
	
	
	private double bankBalance ;

	@Override
	public void bankDepositing(double amount)
	{
		     this.bankBalance += amount;
		     System.out.print(" ICICI After amount Depositing : " +bankBalance+"\n");

	}

	@Override
	public void bankWithdraw(double amount)
	{
		
	     this.bankBalance -= amount;
	     System.out.print(" ICICI After amount with draw : " +bankBalance+"\n");


	}

	@Override
	public double bankAccountBalance()
	{
		return bankBalance;


	}

	

}
