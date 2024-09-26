package Com.feb16.interfaces;

public class Mainof4 
{
	public static void main(String[] args)
	{ 		
//		
//		MobilePhoneInterface mpi = null;
//		
//		
//		
//		mpi = new MobilePhone();
//		
//		System.out.println("ouput 1:\n ");
//		
//		mpi.insertingSimCard(new Jio());
//		mpi.removingSimCard();
//		mpi.makingCalls();
//		mpi.sendTextMessages();
//		System.out.println("\nouput 2:\n ");
//		mpi.insertingSimCard(new Airtel());
//		mpi.removingSimCard();
//		mpi.makingCalls();
//		mpi.sendTextMessages();
//		System.out.println("\nouput 3:\n ");
//		
//		
//		mpi.insertingSimCard(null);
//		mpi.removingSimCard();
//		mpi.makingCalls();
//		mpi.sendTextMessages();
		
		
		ShortCutBLC scb = new ShortCutBLC();
		scb.equals(new Jio());
		System.out.println("...................................");
		scb.equals(new Airtel());
		System.out.println(".....................................");
		scb.equals(null);
		
		
		
		
	    
	}

}
