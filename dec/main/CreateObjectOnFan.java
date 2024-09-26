package dec.main;

public class CreateObjectOnFan 
{
	
	String name;
	String fanCoil;
	int wings;
	public void switchOn()
	{
		System.out.println("Name of Fan: "+name+"\nCoil of the Fan: "+fanCoil+"\nWings of the Fan: "+wings+"\nWhen SwitchOn the fan,It gives Air.");
	}
	public void SwitchOff()
	{
		System.out.println("When we SwicthOff the fan "+name+" We cannot Any Air");
	}
	
	public static void main(String[] args)
	{
		CreateObjectOnFan coil = new CreateObjectOnFan();
		coil.name = "UshaFan";
		coil.fanCoil = "Copper Coil";
		coil.wings = 4;
		coil.switchOn();
		System.out.println("...........................");
		coil.SwitchOff();
		
	}

}
