package Com.feb08.Override;

public class Scoccer extends Sports
{
	@Override
	public String getName(String name)
	{
		return name;
	}
	
	@Override
	public String getNumberOfTeamMembers()
	{
		
		return getName("In Scoccer")+", \n"+"Each team has 11 players";
	}
}
	
	
	
	
	
	
	
	

