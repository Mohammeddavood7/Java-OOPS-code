package GetterAndSetter;

public class NoArgument 
{
	private int personId;
	private String personName;
	
	public NoArgument()
	{
		super();
		personId = 222;
		personName = "Scott";
		
	}

	@Override
	public String toString(){
		return "NoArgument [personId=" + personId + ", personName=" + personName + "]";
	}
    
}
