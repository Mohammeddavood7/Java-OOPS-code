package Com.feb13.abstract2;

import java.util.Arrays;

abstract class Animal
{
	public abstract void checkup();
}

class Bird extends Animal
{
	public void checkup()
	{
		System.out.println("Bird checkup");
	}
}

class Lion extends Animal
{
	public void checkup()
	{
		System.out.println("Lion checkup");
	}
}

class Dog extends Animal
{
	public void checkup()
	{
		System.out.println("Dog checkup");
	}
}


class Checkup
{
	public static void checkup(Animal [] animal)
	{
		for(Animal animals : animal)
		{
			animals.checkup();
		}
	}
	
}


public class DemoAnimal 
{
	public static void main(String[] args)
	{
	    Animal [] animal = {new Bird(),new Bird(),new Bird()};
	    
	    Checkup.checkup(animal);
	    Animal animal1 []  = {new Lion(),new Lion(),new Lion()};
	    Checkup.checkup(animal1);
         
	    Animal animal2 []  = {new Dog(),new Dog(),new Dog()};
	    Checkup.checkup(animal2);


	    
		
	}
	

}
































