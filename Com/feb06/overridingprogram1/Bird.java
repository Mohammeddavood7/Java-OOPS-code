package Com.feb06.overridingprogram1;

public class Bird extends Animal
{
	boolean canFly;

	public Bird(String species, boolean canFly) {
		super(species);
		this.canFly = canFly;
	}
	public  boolean canFly()
	{
		
		return canFly;
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("Bird make sound");
	}
	
	@Override
	public Bird reproduce()
	{
		System.out.println("Birds lay eggs");
		return new Bird(getSpecies(), canFly);
	}
	
	public void buildNest()
	{
		System.out.println("birds building nests for their eggs");
	}

}
