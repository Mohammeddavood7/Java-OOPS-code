package Com.feb22.test;

public class ElcbookingMethod
{
	public static void main(String[] args)
	{
       Ola ol = new Ola();
       Uber ub = new Uber();
       
       RiderServices rs = new RiderServices(ol);
       rs.bookRideToDestination("Ameerpet");
       System.out.println("\n");
       rs = new RiderServices(ub);
       rs.bookRideToDestination("Balkampet");
		
	}

}
