package jan_8_extraQuestion;

public class PanCard 
{
	private String pancardId;
	
	public PanCard(String pan)
	{
		pancardId = pan;
		new Person(this);
	
	}

	public void display()
	{
		System.out.println("panCardId: "+pancardId);
	}

}
