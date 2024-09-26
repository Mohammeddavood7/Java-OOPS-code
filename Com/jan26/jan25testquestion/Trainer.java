package Com.jan26.jan25testquestion;

public class Trainer
{
	private int trainerId;
	private String trainerName;
	private double trainerBasicSalary;
	private double trainerHRAPer;
	private double trainerDAPer;
	private int trainerBatchCount;
	private double trainerPerkPerBatch;
	
	
	public Trainer(int trainerId, String trainerName, double trainerBasicSalary, double trainerHRAPer,
			double trainerDAPer, int trainerBatchCount, double perkPerBatch) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainerBasicSalary = trainerBasicSalary;
		this.trainerHRAPer = trainerHRAPer;
		this.trainerDAPer = trainerDAPer;
		this.trainerBatchCount = trainerBatchCount;
		this.trainerPerkPerBatch = perkPerBatch;
	}


	public int getTrainerId() {
		return trainerId;
	}


	public String getTrainerName() {
		return trainerName;
	}


	public double getTrainerBasicSalary() {
		return trainerBasicSalary;
	}


	public double getTrainerHRAPer() {
		return trainerHRAPer;
	}


	public double getTrainerDAPer() {
		return trainerDAPer;
	}


	public int getTrainerBatchCount() {
		return trainerBatchCount;
	}


	public double getTrainerPerkPerBatch() {
		return trainerPerkPerBatch;
	}
	
	//method
	public double calculateGrossSalary()
	{
		return trainerBasicSalary+trainerHRAPer+trainerDAPer+(trainerBatchCount*trainerPerkPerBatch);
	}
	
	
	

}
