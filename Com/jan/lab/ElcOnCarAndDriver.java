package Com.jan.lab;

public class ElcOnCarAndDriver 
{
	public static void main(String[] args) 
	{
	Driver driver = new Driver("Smith", 32);
	System.out.println("Orginal Datas");
	Car car = new Car("Benz","Premium x21 benz", 2022, driver);
	System.out.println(car+"\nCopy of Constructor");
	Car copyCar = new Car(car);
	System.out.println(copyCar);
	System.out.println("----------------------------");
	Driver driverNew = new Driver("Scott", 42);
	car.changeDriver(driverNew);
	System.out.println("Changed Driver:----");
	System.out.println(car);
	
	}
	
	

}
