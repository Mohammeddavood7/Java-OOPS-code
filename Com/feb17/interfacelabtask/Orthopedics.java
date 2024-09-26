package Com.feb17.interfacelabtask;

public class Orthopedics implements HospitalInterface {


	@Override
	public void admittingPatients(String patientName,AddressClass address) 
	{
	   System.out.println("Admitted Patient in Orthopedics:\nPatient name: "+patientName+"\nAddres of the patient: "+address); 	
	}

	@Override
	public void  providingTreatment(String patientName) 
	{
	    
	    System.out.println("Orthopedics treatment :- "+"patient name:  "+patientName);
	    
     
	}


	@Override
	public void generatingBill(String patientName,double amount)
	{
		if(amount < 30000)
		{
			System.out.println("Orthopedics:\npatient name: "+patientName+"\nPay the remaining amount: "+(10000 - amount));
			
		}
		else if(amount > 30000)
		{
			System.out.println("Orthopedics:\npatient name: "+patientName+"\nCollect the extra amount: "+(-(10000 - amount)));
		}
		else if(amount == 30000)
		{
			System.out.println("Orthopedics:\npatient name: "+patientName+"\nConfirmed the bill and cleared amount: "+amount);

		}

	}
}
