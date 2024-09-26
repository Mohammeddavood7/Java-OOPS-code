package jan_4_main;


public class BankingStatementOfBlc 
{
	static float bankBalance = 5000;
	String userName;
	long accountNo;
	long phoneNo;
	String cityName;
	public void bankCreateAcount(String userName,long accountNo,long phoneNo,String cityName)
	{
		
		this.userName = userName;
		this.accountNo = accountNo;
		this.phoneNo = phoneNo;
		this.cityName = cityName;
	}
	
	
	@Override
	public String toString()
	{
		return "[userName=" + userName + ", accountNo=" + accountNo + ", phoneNo=" + phoneNo
				+ ", cityName=" + cityName + "]";
	}

	public void bankDeposit(float deposit)
	{
	
		if(deposit>0)
		{
	      bankBalance += deposit;
	      System.out.println("After Deposite the Amount: "+bankBalance); 
		}
		else
		{
			System.out.println("Amount must be in positive numbers !!! ");
		}
		
		
	}
	
	public static void bankhCeckBalance()
	{
			float totalBalance = bankBalance;
			System.out.println("Total Bank Balance: "+totalBalance);
	}
	

}
