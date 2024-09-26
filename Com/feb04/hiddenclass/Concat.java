package Com.feb04.hiddenclass;

public class Concat 
{
	
	public static void main(String[] args)
	{
		  String name = "india";
	    System.out.println( name.concat(""+" is the great country in the world").toUpperCase().length());
		System.out.println(name);
		
		Concat c = new Concat();
		System.out.println(c.toString());
	}

}
