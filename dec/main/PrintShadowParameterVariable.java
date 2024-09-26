package dec.main;
//this keyWord
import dec.reuse.ShadowParameterVariableBlc;

public class PrintShadowParameterVariable 
{
	public static void main(String[] args)
	{
		ShadowParameterVariableBlc player = new ShadowParameterVariableBlc();
		player.setPlayerData(111, "Warner");
		player.getPlayerData();
		
		
	}

}
