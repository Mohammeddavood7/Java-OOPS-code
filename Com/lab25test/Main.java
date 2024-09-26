package Com.lab25test;


public class Main {
	public static void main(String[] args) {

		Employee emp = new Employee("john", 123, 50, 17);
		System.out.println(emp.getSalary());
		System.out.println(Employee.displayEmployeeDetails(emp));

		Employee emp2 = new Employee("john", 123, 70, 17);
		System.out.println(emp2.getSalary());
		System.out.println(Employee.displayEmployeeDetails(emp2));

		Employee emp3 = new Employee("john", 123, 50, 7);
		System.out.println(emp3.getSalary());
		System.out.println(Employee.displayEmployeeDetails(emp3));

	}

}
