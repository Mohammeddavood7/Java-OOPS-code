package Com.feb17.interfacelabtask;

public class MainOFHOSP 
{
	public static void main(String[] args)
	{
		PatientClass pc = new PatientClass();
		AddressClass ac = new AddressClass("Scott","balapur", "Hyderabad", "Telangana", 123432);
		pc.admitPatient(new Cardiology(),ac);
		pc.receiveTreatment();
		pc.generateBill(10000);
		System.out.println("........................");
		
		AddressClass ac2 = new AddressClass("Smith","balkampet", "Hydereabad", "Telangana", 500016);
		pc.admitPatient(new Orthopedics(),ac2);
		pc.receiveTreatment();
		pc.generateBill(10000);
		System.out.println("........................");

		
		AddressClass ac3 = new AddressClass("Warner","Ameerpet", "Hydereabad", "Telangana ", 500028);
		pc.admitPatient(new Pediatrics(),ac3);
		pc.receiveTreatment();
		pc.generateBill(10000);
		
		
		
	}

}
