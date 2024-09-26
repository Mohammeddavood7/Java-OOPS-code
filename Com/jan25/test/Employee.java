package Com.jan25.test;

public class Employee 
{
	private String name;
	private int id;
	private int hoursWorked;
	private int basePay;
	public Employee(String name, int id, int hoursWorked, int basePay) {
		super();
		this.name = name;
		this.id = id;
		this.hoursWorked = hoursWorked;
		this.basePay = basePay;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public int getBasePay() {
		return basePay;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", hoursWorked=" + hoursWorked + ", basePay=" + basePay + "]";
	}

	
	
	
	
	
	
	
	
	
	

}
