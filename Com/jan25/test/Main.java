package Com.jan25.test;

public class Main
{
	public static void main(String[] args) {
	Employee e = new Employee("john", 123, 50, 17);
	String displayEmployeeDetails = DayPay.displayEmployeeDetails(e);
	System.out.println(displayEmployeeDetails);
	}
}
