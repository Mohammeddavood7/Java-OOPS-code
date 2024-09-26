package Com.feb22.labtaskByown;
 class EmployeeTCS
{
	private int empId;
	private String empName;
	private String designation;
	private int empScore ;
	private double empSal;
	
	//DEFAULT CONSTRUCTOR
	public EmployeeTCS()
	{
		
	}
	public EmployeeTCS(int empId, String empName, String designation, int empScore, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.empScore = empScore;
		this.empSal = empSal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getEmpScore() {
		return empScore;
	}
	public void setEmpScore(int empScore) {
		this.empScore = empScore;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "EmployeeTCS [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", empScore="
				+ empScore + ", empSal=" + empSal + "]";
	}
	

}
