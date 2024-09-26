package dec.main;

public class CreateObjectOnMovieTreater 
{
	String movieName;
	String treaterAddress;
    int moviePrice;
	int movieParking;
	int moviePopcorn;
	
	public void getAddress()
	{
	  System.out.println(treaterAddress+"\n");
	}
	public double getTotalMovieSpendedCost(int moviePrice,int movieParking,int moviePopcorn)
	{
		double result = moviePrice+movieParking+moviePopcorn;
		return result;
		
	}
	
	
	public static void main(String[] args)
	{
		CreateObjectOnMovieTreater movie = new CreateObjectOnMovieTreater();
		movie.movieName = "Jawan";
	    movie.treaterAddress = "Punjagutta'PVR' ";
	    movie.moviePrice = 290;
	    movie.movieParking = 50;
	    movie.moviePopcorn = 200;
	    movie.getAddress();
	    double totalMovieSpendedCost = movie.getTotalMovieSpendedCost(movie.moviePrice,movie.movieParking,movie.moviePopcorn);
	    System.out.println("Total spending on movie: "+totalMovieSpendedCost);
	}

}
