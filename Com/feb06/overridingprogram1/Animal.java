package Com.feb06.overridingprogram1;

class Animal
{
	private String species;

	public Animal(String species) {
		super();
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}
	
	public void makeSound()
	{
		System.out.println("Generic animal sound");
	}
	
	public Animal reproduce()
	{
		System.out.println("Generic Reproduction Animal");
		return new Animal("unknown");
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + "]";
	}
}
