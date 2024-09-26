package Com.lab25test;


public class DayPay {
	public static double calculateSalary(Employee e) {
		double salary = 0;
		int hour = e.getHoursWorked();
		int basePay = e.getBasePay();
		if (basePay < 8)
			return 0;

		if (hour >= 60 || hour < 0) {
			return -1;
		} else if (hour > 40) {
			salary = (hour - 40) * basePay * 1.5 + 40 * basePay;
		} else {
			salary = hour * basePay;
		}
		return salary;
	}
}
