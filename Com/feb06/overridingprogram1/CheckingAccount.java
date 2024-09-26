package Com.feb06.overridingprogram1;

public class CheckingAccount extends Account
{
	private double overdraftLimit;

	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public CheckingAccount generateStatement()
	{
		return new CheckingAccount(getAccountNumber(), getBalance(), overdraftLimit);
	}

	

	@Override
	public String toString() {
		return "CheckingAccount [overdraftLimit=" + overdraftLimit + ", getAccountNumber()=" + getAccountNumber()
				+ ", getBalance()=" + getBalance() + "]";
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	
	
	

}
