package Com.feb17.interfacelabtask;

public class PatientClass 
{
   private HospitalInterface hospital = null;
   private AddressClass address = null;
   private String patientName;
   
   
	public void admitPatient(HospitalInterface hospital,AddressClass address)
    {
        this.patientName = address.getName();		
    	this.hospital = hospital;
    	this.address = address;
    	hospital.admittingPatients(patientName,this.address);
  
    }
	
	public void receiveTreatment()
	{
		hospital.providingTreatment(patientName);
	}
	
	public void generateBill(double amount)
	{
		hospital.generatingBill(patientName, amount);
	}
 
	
	

}
























































//public PatientClass(HospitalInterface hospInter, String patientName, AddressClass address)
//{
//	super();
//	this.hospInter = hospInter;
//	this.patientName = patientName;
//	this.address = address;
//}
//
//
//
//
//public void acceptHospitalDeparments(HospitalInterface hospInter)
//{this.hospInter = hospInter;
//	
//	hospInter.admittingPatients(patientName, address)
//
//}