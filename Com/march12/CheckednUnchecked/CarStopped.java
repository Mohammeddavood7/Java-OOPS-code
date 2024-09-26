package Com.march12.CheckednUnchecked;

@SuppressWarnings("serial")
public class CarStopped extends Exception
{
     public CarStopped()
     {
    	 super();
     }
     
     public CarStopped(String errorMessage)
     {
    	 super(errorMessage);
     }
}
