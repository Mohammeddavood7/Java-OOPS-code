package GetterAndSetter;

public class MainSetterAndGetter
{

	public static void main(String[] args)
	{
		SetterAndGetter max = new SetterAndGetter("max", 3.4, 3, "Brown");
		max.setDogHeight(4);
		max.setDogAge(5);
		max.getDogHeight();
		max.getDogAge();
		System.out.println(max);

	}

}
