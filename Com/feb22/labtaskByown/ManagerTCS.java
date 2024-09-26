package Com.feb22.labtaskByown;

public class ManagerTCS
{
	private int empId;
	private String empName;
	private String designation;
	private double empSal;

	public ManagerTCS()
	{
	
	}
	
	public ManagerTCS(int empId, String empName, String designation, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.empSal = empSal;
	}




	public ManagerTCS(EmployeeTCS emp)
	{
		this.empId = emp.getEmpId();
		this.empName = emp.getEmpName();

		
		if(emp.getEmpScore() >= 8)
		{
			if(emp.getDesignation().equals("Senior Software Engineer"))
			{
				this.designation = "Manager";
				this.empSal = 100000;
				
			}
		}
		else
		{
			this.designation = "Senior Software Engineer";
			this.empSal = 40000;
		}
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getDesignation() {
		return designation;
	}

	public double getEmpSal() {
		return empSal;
	}

	@Override
	public String toString() {
		return "ManagerTCS [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", empSal="
				+ empSal + "]";
	}
	
	
	
	
	

}
