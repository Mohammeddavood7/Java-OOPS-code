package Com.jan25.hasarelation;

public class AadharCard 
{
	private String aadharNumber;
	private String aadharProvide;
	
	public AadharCard(String aadharNumber, String aadharProvide) {
		super();
		this.aadharNumber = aadharNumber;
		this.aadharProvide = aadharProvide;
	}

	@Override
	public String toString() {
		return "AadharCard [aadharNumber=" + aadharNumber + ", aadharProvide=" + aadharProvide + "]";
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public String getAadharProvide() {
		return aadharProvide;
	}
	
	

}
