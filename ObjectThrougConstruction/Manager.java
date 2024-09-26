package ObjectThrougConstruction;

public class Manager
{

	private int managerId;
	private String managerName;
	@SuppressWarnings("unused")
	private Employee emp;
	
	public Manager(Employee emp) 
	{
		managerId = emp.getEmployeeId();
		managerName = emp.getEmployeeName();
		System.out.println(	emp.getEmployeeId());
	}

	//emp.getEmployeeId();
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}
	
    

}
