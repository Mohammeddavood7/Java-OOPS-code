package jan_10_TestExam;
class Car
{
	String carModel;
	String carMake;
	double carPrice;

    public Car(Vehicle vehicle)
    {
    	this.carModel = vehicle.getModel();
    	this.carMake = vehicle.getMake();
    	this.carPrice =vehicle.getPrice();
        
    }

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + ", carMake=" + carMake + ", carPrice=" + carPrice + "]";
	}
    
    

}

