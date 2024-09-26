package Com.feb17.interfacelabtask;

public class AddressClass 
{
	private String name;
    private String street;
    private String city;
    private String state;
    private int zipCode;
	public AddressClass(String name,String street, String city, String state, int zipCode) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public String getName()
	{
		return name;
	}
	@Override
	public String toString() {
		return "AddressClass [name=" + name + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}
	
	
	
    
    
    
}
