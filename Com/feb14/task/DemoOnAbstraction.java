package Com.feb14.task;

abstract class Sports
{
	public abstract String getName(String name);
	 
   public abstract String getNameOfTeamMembers();
    
}
class Soccer extends Sports
{
	
	@Override
	public String getName(String name)
	{
		return name;
	}
	@Override
	public String getNameOfTeamMembers()
	{
		return "Each team has 11 players";
	}
	
	
}
public class DemoOnAbstraction 
{
	public static void main(String[] args)
	{
		Sports s = null;
		  s = new Soccer();
		  System.out.println(s.getName("In Soccer")); 
		 
		  System.out.println( s.getNameOfTeamMembers()); 

	}
  
}
