package Com.feb22.test;

public class MediatorClass
{
	public static Language mediator(String lang)
	{
	   if(lang.equals("Telugu"))
	   {
		   return new Telugu();
	   }
	  else if(lang.equals("Hindi"))
	  {
		   return new Hind();
	   }
	  else
	  {
		  return new NonClass();
	  }
	}
	
}