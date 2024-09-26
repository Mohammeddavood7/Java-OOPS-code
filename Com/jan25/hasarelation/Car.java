package Com.jan25.hasarelation;

public class Car 
{
	private String carName;
	private int carModel;
	private int carYear;
	private Engine engine;
	
	public Car(String carName, int carModel, int carYear) {
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.carYear = carYear;
		this.engine = new Engine("petrol",220000);
		
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carModel=" + carModel + ", carYear=" + carYear + ", engine=" + engine
				+ "]";
	}
	
	
	
	
	
	

}
