package Com.mar2.interview;



class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {}

    // Public static method to get the instance of the class
    public static Singleton getInstance() {
        // Create the instance if it doesn't exist
        if (instance == null) 
        {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingleTonDemo
{
	public static void main(String[] args)
	{
		String hashCode = Singleton.getInstance().toString();
		System.out.println(hashCode);
		
		 String hashCode2 = Singleton.getInstance().toString();
		 System.out.println(hashCode2);
	}
}
