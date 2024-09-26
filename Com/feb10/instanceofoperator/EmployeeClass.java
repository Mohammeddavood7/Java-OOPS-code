package Com.feb10.instanceofoperator;

import java.util.Objects;

public class EmployeeClass
{
	private int employeeId;
	private String employeeName;
	public EmployeeClass(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "EmployeeClass [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeClass other = (EmployeeClass) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName);
	}
	
	

}
