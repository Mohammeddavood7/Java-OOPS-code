package jan_4;

public class BankStatementElc 
{
	public static void main(String[] args)
	{
		BankStatementBlc bank = new BankStatementBlc();
		bank.withDraw(-1000);
		bank.deposit(-1000);
		System.out.println(bank.toString());
		
	}

}
