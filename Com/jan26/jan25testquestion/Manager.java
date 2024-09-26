package Com.jan26.jan25testquestion;

public class Manager 
{
	private int managerId;
	private String managerName;
	private double managerBasicSalary;
	private double managerHRAPer;
	private double managerDAPer;
	private double projectAllowance;
	
	
	public Manager(int managerId, String managerName, double managerBasicSalary, double managerHRAPer,
			double managerDAPer, double projectAllowance) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerBasicSalary = managerBasicSalary;
		this.managerHRAPer = managerHRAPer;
		this.managerDAPer = managerDAPer;
		this.projectAllowance = projectAllowance;
	}


	public int getManagerId() {
		return managerId;
	}


	public String getManagerName() {
		return managerName;
	}


	public double getManagerBasicSalary() {
		return managerBasicSalary;
	}


	public double getManagerHRAPer() {
		return managerHRAPer;
	}


	public double getManagerDAPer() {
		return managerDAPer;
	}


	public double getProjectAllowance() {
		return projectAllowance;
	}
	
	
	//method 
	
	public double calculateGrossSalary()
	{
		return managerBasicSalary+managerHRAPer+managerDAPer+projectAllowance;
	}


	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", managerBasicSalary="
				+ managerBasicSalary + ", managerHRAPer=" + managerHRAPer + ", managerDAPer=" + managerDAPer
				+ ", projectAllowance=" + projectAllowance + "]";
	}
	
	
	
	
	
	
	
	

}
