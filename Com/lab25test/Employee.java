package Com.lab25test;


public class Employee {
	private String name;
	private int id;
	private int hoursWorked;
	private int basePay;
	private double salary;

	public Employee(String name, int id, int hoursWorked, int basePay) {
		super();
		this.name = name;
		this.id = id;
		this.hoursWorked = hoursWorked;
		this.basePay = basePay;
		this.salary = DayPay.calculateSalary(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {

		return salary;
	}

	public static String displayEmployeeDetails(Employee emp)
	{

		if (emp.getBasePay() < 8 || emp.getHoursWorked() < 0 || emp.getHoursWorked() > 60)
		{
			return "Employee cannot exist with given information";
		}

		else
		{
			return " Employee [Name:" + emp.getName() + ", id: " + emp.getId() + ", Base Pay: " + emp.getBasePay()
					+ ", No. of hours worked: " + emp.getHoursWorked() + ", Payed: " + emp.getSalary() + "]";
		}

	}

}
