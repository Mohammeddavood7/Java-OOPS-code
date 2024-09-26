package Com.jan.lab;

public class Employee 
{
	private String name;
	private int age;
	private double salary;
	private String department;
	
	public Employee(String name, int age, double salary, String department) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}
	public Employee(Employee obj)
	{
		this.name = obj.getName();
		this.age = obj.getAge();
		this.salary = obj.getSalary();
		this.department = obj.getDepartment();
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	
	public void raiseSalary(double percantage)
	{
		this.salary = salary+(this.salary*percantage/100);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
	
	
	
	
	
	
	

}
