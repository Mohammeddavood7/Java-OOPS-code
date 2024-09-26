package ObjectThrougConstruction;

public class Player 
{
	
	private String playerName1,playerName2;
	
	public Player(String playerName1, String playerName2) {
		super();
		this.playerName1 = playerName1;
		this.playerName2 = playerName2;
	}
	
	public Player(Player p)
	{
		this.playerName1 = p.playerName2;
		this.playerName2 = p.playerName2;
		
	}

	@Override
	public String toString() {
		return "Player [playerName1=" + playerName1 + ", playerName2=" + playerName2 + "]";
	}

	
	
	
	

	
}
