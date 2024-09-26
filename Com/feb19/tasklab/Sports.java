package Com.feb19.tasklab;

class SportsDemo 
{
	public String getName(String str)
	{
		return "name";
	}
	
	public String getNumberOfTeamMember()
	{
		return "Each team has 11 players";
	}

}

class Soccer extends SportsDemo
{
	@Override
	public String getName(String str)
	{
		return str;
	}
	
	
	@Override
	public String getNumberOfTeamMember()
	{
		return "Each team has 11 players";
	}
}


public class Sports
{
	public static void main(String[] args)
	{
		SportsDemo d;
		d = new Soccer();
		System.out.println(d.getName("In soccer"));;
		System.out.println(d.getNumberOfTeamMember());
		
	}
}



























