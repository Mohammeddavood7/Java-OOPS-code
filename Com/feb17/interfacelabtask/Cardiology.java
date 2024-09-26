package Com.feb17.interfacelabtask;

public class Cardiology implements HospitalInterface 
{
	

	@Override
	public void admittingPatients(String patientName,AddressClass address) 
	{
	   System.out.println("Admitted Patient in Cardiology:\nPatient name: "+patientName+"\nAddres of the patient: "+address); 	
	}

	@Override
	public void  providingTreatment(String patientName) 
	{
	    
	    System.out.println("Cardiology treatment :- "+"patient name:  "+patientName);
	    
     
	}

	@Override
	public void generatingBill(String patientName,double amount)
	{
		if(amount < 10000)
		{
			System.out.println("Cardiology:\npatient name: "+patientName+"\nPay the remaining amount: "+(10000 - amount));
			
		}
		else if(amount > 10000)
		{
			System.out.println("Cardiology:\npatient name: "+patientName+"\nCollect the extra amount: "+(-(10000 - amount)));
		}
		else if(amount == 10000)
		{
			System.out.println("Cardiology:\npatient name: "+patientName+"\nConfirmed the bill and cleared amount: "+amount);

		}

	}

}






















































