package jan_10_TestExam;

public class MainVehicleAndCar
{
    public static void main(String[] args) 
    {
        
        Vehicle vehicle = new Vehicle("ABC", "Tava", 25000);
        Car car = new Car(vehicle);
        System.out.println(car);
          
}
}
