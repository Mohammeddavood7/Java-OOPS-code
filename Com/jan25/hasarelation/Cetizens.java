package Com.jan25.hasarelation;

public class Cetizens 
{
	private String cetizensAddress;
	private String cetizensName;
	private AadharCard aadharCard;
	
	public Cetizens(String cetizensAddress, String cetizensName, AadharCard aadharCard) {
		super();
		this.cetizensAddress = cetizensAddress;
		this.cetizensName = cetizensName;
		this.aadharCard = aadharCard;
	}
	
	public String display()
	{
		
	    if(aadharCard.getAadharNumber().length() == 12)
		{
			return ""+"This Aadhar Card Valid: "+this.aadharCard;
		}
		else
		{
			return ""+"This Aadhar card is not valid";
		}
	
	}

	@Override
	public String toString() {
		return "Cetizens [cetizensAddress=" + cetizensAddress + ", cetizensName=" + cetizensName + "]";
	}	
	
	

}
