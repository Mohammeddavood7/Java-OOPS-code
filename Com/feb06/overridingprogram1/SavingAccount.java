package Com.feb06.overridingprogram1;

public class SavingAccount extends Account
{
	private double interestRate;

	public SavingAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	@Override
	public SavingAccount generateStatement()
	{
		return new SavingAccount(getAccountNumber(), getBalance(), interestRate);
	}

	

	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + ", getAccountNumber()=" + getAccountNumber()
				+ ", getBalance()=" + getBalance() + "]";
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	
	
	

}
