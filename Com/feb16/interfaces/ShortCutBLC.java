package Com.feb16.interfaces;

public class ShortCutBLC
{
	
		
		public boolean equals(Object obj)
		{
			boolean result = false;
			
			if(obj instanceof SIMCardInterface)
			{ 
				MobilePhoneInterface mp = null;
				mp = new MobilePhone();
				SIMCardInterface sci = (SIMCardInterface)obj;
		    	mp.insertingSimCard(sci);
			    mp.removingSimCard();
			    mp.makingCalls();
			    mp.sendTextMessages();
			    result = true;
			}
			return result;
		}
	    
	    

}
