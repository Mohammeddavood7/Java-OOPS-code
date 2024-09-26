package dec.reuse;
//This keyWord
public class ShadowParameterVariableBlc 
{
  int playerId = 99;
  String playerName = "Smith";
  
  public void setPlayerData(int playerId,String playerName)
  {
	this.playerId = playerId;
	this.playerName = playerName;
  }
  
  public void getPlayerData()
  {
	  System.out.println("Id of the Player: "+playerId+"\n"+"Name of the player: "+playerName);
  }
	
}
