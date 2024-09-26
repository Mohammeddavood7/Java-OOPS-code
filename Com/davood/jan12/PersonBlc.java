package Com.davood.jan12;

public class PersonBlc
{

	private String name;
	private int age;
	
	{
		System.out.println("Person instance created");
	}

	public PersonBlc(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void introduce()
	{
		System.out.println("Hi, my name "+name+" and I'm "+ age+ " ars old");
	}
}
