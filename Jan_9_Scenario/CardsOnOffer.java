package Jan_9_Scenario;

public class CardsOnOffer
{
   
	public static CardType getOfferCard(Customer customerObj)
	{
	   customerObj.getCreditPoints();
	   
	   if(customerObj.getCreditPoints()>=100&&customerObj.getCreditPoints()<500)
	   {
		   return new CardType(customerObj, "Silver");
	   }
	   else if(customerObj.getCreditPoints() > 500&& customerObj.getCreditPoints()<=1000)
	   {
		  return new CardType(customerObj, "Gold");
	   }
	   else if(customerObj.getCreditPoints() > 1000)
	   {
		  return new CardType(customerObj, "Platinum");
	   }
	   else
	   {
		    return new CardType(customerObj,"EMI");
	   }
	}

}
