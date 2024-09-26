package Com.feb23.methodreferencing;

public class MainTrainer
{
	public static void main(String[] args)
	{
//		Trainer t1 = InstanceMethod::TrainerDetails;
//		t1.Training("Smith", 10);
		
//		Trainer t1 = new InstanceMethod()::TrainerDetails;
//		t1.Training("Smith", 10);
		
		Trainer t1 = InstanceMethod::new;
		t1.Training();
		
		
		
		
		
	}

}
