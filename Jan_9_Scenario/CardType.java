package Jan_9_Scenario;

public class CardType 
{
	private Customer customer;
	private String cardType;
	
	public CardType(Customer customer,String cardType)
	{
		this.customer  = customer;
		this.cardType = cardType;
	}
	
	@Override
	public String toString() 
	{
		return "The Customer '"+customer+"' Is Eligible For '"+cardType+"' Card.";
	}
	
	
	

}
