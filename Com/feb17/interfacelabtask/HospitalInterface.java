package Com.feb17.interfacelabtask;

public interface HospitalInterface 
{
	void admittingPatients(String patientName,AddressClass address);
	void providingTreatment(String patientName);
	void generatingBill(String patientName,double amount);

}