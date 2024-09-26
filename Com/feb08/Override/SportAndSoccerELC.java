package Com.feb08.Override;

public class SportAndSoccerELC
{
	public static void main(String[] args) {
		Sports s;
		s = new Scoccer();
		s.getName("In Soccer");
		String numberOfTeamMembers = s.getNumberOfTeamMembers();
		System.out.println(numberOfTeamMembers);
	}
	

}
