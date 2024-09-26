package Com.feb06.overridingprogram1;

public class Mammal extends Animal
{
	boolean hasFur;

	public Mammal(String species, boolean hasFur) {
		super(species);
		this.hasFur = hasFur;
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("Mammal make sound");
	}

	@Override
	public String toString() {
		return super.toString()+"Mammal [hasFur=" + hasFur + "]";
	}
	
	public Mammal reproduce()
	{
		System.out.println("mammal give birth to live young");
		return new Mammal(getSpecies(), hasFur);
	}
	
	public boolean hasFur()
	{
		return hasFur;
	}
	
	
	public void nurseYoung()
	{
		System.out.println("Mammals nursing their young");
	}
	

}
