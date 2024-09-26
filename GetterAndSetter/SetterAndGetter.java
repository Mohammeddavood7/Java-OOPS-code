package GetterAndSetter;

public class SetterAndGetter
{
	private String dogName;
	private double dogHeight;
	private int dogAge;
	private String dogColor;
	public SetterAndGetter(String dogName, double dogHeight, int dogAge, String dogColor)
	{
		super();
		this.dogName = dogName;
		this.dogHeight = dogHeight;
		this.dogAge = dogAge;
		this.dogColor = dogColor;
	}
	
	@Override
	public String toString() 
	{
		return "[dogName=" + dogName + ", dogHeight=" + dogHeight + ", dogAge=" + dogAge + ", dogColor="
				+ dogColor + "]";
	}
	
	public void setDogHeight(double dogHeight)
	{
		this.dogHeight = dogHeight;
	}
	
	public void setDogAge(int dogAge) 
	{
		this.dogAge = dogAge;
	}

	public double getDogHeight() {
		return dogHeight;
	}

	public int getDogAge() {
		return dogAge;
	}
	
	
	

}
