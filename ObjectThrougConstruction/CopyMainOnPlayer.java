package ObjectThrougConstruction;

public class CopyMainOnPlayer 
{

	public static void main(String[] args)
	{
		Player player1 = new Player("Scott", "Smith");
		System.out.println(player1);
		
		Player player2 = new Player(player1);
		System.out.println(player2);
		
		
		
		
	}

}
