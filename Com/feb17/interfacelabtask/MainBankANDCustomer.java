package Com.feb17.interfacelabtask;

public class MainBankANDCustomer
{

	public static void main(String[] args)
	{
		Customer c = new Customer(null);
		SBI sbi = new SBI();
		c.deposite(sbi,10000);
		c.withdraw(sbi ,900);
		double checkbalance1 = c.checkbalance(sbi);
		System.out.println("Account balance of SBI: "+checkbalance1+"\n");
		
		
		HDFC hdfc = new HDFC();
		c.deposite(hdfc,10000);
		c.withdraw(hdfc ,900);
		double checkbalance2 = c.checkbalance(hdfc);
		System.out.println("Account balance of HDFC: "+checkbalance2+"\n");
		
		ICICI icici = new ICICI();
		c.deposite(icici,10000);
		c.withdraw(icici ,900);
		double checkbalance3 = c.checkbalance(hdfc);
		System.out.println("Account balance of ICICI: "+checkbalance3+"\n");
		
	}

}
