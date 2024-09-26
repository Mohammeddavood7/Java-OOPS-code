package Com.jan25.hasarelation;

public class Engine 
{

	private String engineType;
	private double engineHorsePower;
	
	public Engine(String engineType, double engineHorsePower) {
		super();
		this.engineType = engineType;
		this.engineHorsePower = engineHorsePower;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", engineHorsePower=" + engineHorsePower + "]";
	}
	
	
	
}
