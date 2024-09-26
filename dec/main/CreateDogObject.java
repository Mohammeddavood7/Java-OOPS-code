package dec.main;

public class CreateDogObject 
{
	String name;
	double height;
	int age;
	public void getDogInformation()
	{
		System.out.println("My Dog Name is "+name+"\n"+"My Dog height is : "+height+"\nFeets Age of Dog: "+age +"years");
	}
	public void bark()
	{
		System.out.println("Yes !! My "+name+"  is bark every time");
	}

	
	
    public static void main(String[] args)
    {
		CreateDogObject dog = new CreateDogObject();
		dog.name = "Drogon";
		dog.height = 2.4;
		dog.age = 4;
		dog.getDogInformation();
		System.out.println("\n");
		dog.bark();
	}

}
