package Com.feb16.interfaces;


public class MobilePhone implements MobilePhoneInterface
	{
	    SIMCardInterface sim;
		@Override
		public void insertingSimCard(SIMCardInterface sci) 
		{
			
			if(sci != null)
			{
		    sim = sci;
			System.out.println("inserting sim card");
			sim.phoneNumber();
			sim.netWork();
			sim.activation();
			}
			else 
			{
				
				System.out.println("sim is not inserted the mobile phone");
			}
			
			
		}

		 @Override
		    public void removingSimCard() {
		        if (sim != null) {
		            System.out.println("Removing sim card");
		            sim = null; // Clear the reference to the SIM card.
		        } else {
		            System.out.println("No SIM card inserted to remove.");
		        }
		 }

		@Override
		public void makingCalls()
		{
			if(sim != null)
			{
			System.out.println("making calls using this sim card");
			sim.phoneNumber();
			}
			else
			{
				System.out.println("No sim card inserted to make calls ");
			}
			
		}

		@Override
		public void sendTextMessages()
		{
			if(sim != null)
			{
			System.out.println("send text messages sim card");
			sim.phoneNumber();
			sim.activation();
			}
			else
			{
			  System.out.println("No SIM card inserted to send text messages.");
			}
			
		}
		
		
	}









