package Com.jan25.test;

public class DayPay {

    private static double calculateSalary(Employee employee) {
        double basePay = employee.getBasePay();
        int hoursWorked = employee.getHoursWorked();

        if (hoursWorked < 0 || hoursWorked > 40) {
            return -1; 
        }

        if (basePay < 8.0) {
            return 0; 
        }

        if (hoursWorked <= 40)
        {
            return basePay * hoursWorked; 
        }
        else 
        {
            return (40 * basePay) + ((hoursWorked - 40) * (1.5 * basePay)); 
        }
    }

    
    public static String displayEmployeeDetails(Employee employee) 
    {
        String name = employee.getName();
        int id = employee.getId();
        double basePay = employee.getBasePay();
        int hoursWorked = employee.getHoursWorked();

        if (hoursWorked < 0 || hoursWorked > 60 || basePay < 8.0) {
            return "Employee cannot exist with given information";
        }

        double salary = calculateSalary(employee);

        return "Employee [name=" + name + ", id=" + id + ", hoursWorked=" + hoursWorked + ", basePay=" + basePay + "payed : "+salary+"]";
    }
}

