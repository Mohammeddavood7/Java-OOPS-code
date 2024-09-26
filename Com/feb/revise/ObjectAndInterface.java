package Com.feb.revise;

interface Sample
{
	public default String ToString()
	{
		return "";
	}
	
	public  boolean equals(Object obj);
	public String toString(); 
	public int hashCode();
	
	public abstract void show();
	
}

class Sam implements Sample  
{
	

	@Override
	public void show() 
	{
		System.out.println("implements method ,sam class is invoked");
	}
	
	@Override
	public String toString()
	{
		return "toString";
	}
	
	@Override
	public int hashCode()
	{
		return 298742972;
	}
	
	
}

public class ObjectAndInterface //extends Object
{
	public static void main(String[] args)
	{
		Sam sam = new Sam();
		sam.show();
		sam.equals(sam);
		System.out.println(sam.hashCode());
		System.out.println(sam.toString());
		sam.ToString();;;;;;;;;;;;;;;;;;;;;
		
		
	}

}





















































































