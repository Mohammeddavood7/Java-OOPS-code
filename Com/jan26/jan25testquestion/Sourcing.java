package Com.jan26.jan25testquestion;

public class Sourcing 
{

	private int sourcingId;
	private String sourcingName;
	private double sourcingBasicSalary;
	private double sourcingHRAPer;
	private double sourcingDAPer;
	private int sourcingEnrollmentTraget;
	private int sourcingEnrollmentReached;
	private double sourcingPerkPerEnrollment;
	
	
	public Sourcing(int sourcingId, String sourcingName, double sourcingBasicSalary, double sourcingHRAPer,
			double sourcingDAPer, int sourcingEnrollmentTrager, int sourcingEnrollmentReached,
			double sourcingPerkPerEnrollment) {
		super();
		this.sourcingId = sourcingId;
		this.sourcingName = sourcingName;
		this.sourcingBasicSalary = sourcingBasicSalary;
		this.sourcingHRAPer = sourcingHRAPer;
		this.sourcingDAPer = sourcingDAPer;
		this.sourcingEnrollmentTraget = sourcingEnrollmentTrager;
		this.sourcingEnrollmentReached = sourcingEnrollmentReached;
		this.sourcingPerkPerEnrollment = sourcingPerkPerEnrollment;
	}


	public int getSourcingId() {
		return sourcingId;
	}


	public String getSourcingName() {
		return sourcingName;
	}


	public double getSourcingBasicSalary() {
		return sourcingBasicSalary;
	}


	public double getSourcingHRAPer() {
		return sourcingHRAPer;
	}


	public double getSourcingDAPer() {
		return sourcingDAPer;
	}


	public int getSourcingEnrollmentTraget() {
		return sourcingEnrollmentTraget;
	}


	public int getSourcingEnrollmentReached() {
		return sourcingEnrollmentReached;
	}


	public double getSourcingPerkPerEnrollment() {
		return sourcingPerkPerEnrollment;
	}
	
	//method
	public double calculateGrossSalary()
	{
		return sourcingBasicSalary+sourcingHRAPer+sourcingDAPer+((sourcingEnrollmentReached/sourcingEnrollmentTraget)*100)*sourcingPerkPerEnrollment;
	}
	                                                                                                                                                                      
	
	
}
