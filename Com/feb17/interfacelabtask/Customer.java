package Com.feb17.interfacelabtask;

public class Customer {

	public Customer(BankInterface bif) {
		super();

	}

	void deposite(BankInterface bif, double amount) {
		if (bif instanceof BankInterface) {
			// BankInterface bifm = (BankInterface) bif;
			bif.bankDepositing(amount);
		}
	}

	void withdraw(BankInterface bif, double amount) {
		if (bif instanceof BankInterface) {
			// BankInterface bifm = (BankInterface) bif;
			bif.bankWithdraw(amount);

		}
	}

	public double checkbalance(BankInterface bif) {
//    	double balance = 0;
//    	if(bif instanceof BankInterface)
//    	{
		// BankInterface bifm = (BankInterface) bif;

		// balance = accountBalance;
		// }

		return bif.bankAccountBalance();
	}

}
