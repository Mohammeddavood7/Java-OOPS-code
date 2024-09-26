package Com.feb06.overridingprogram1;

public class ZooSimulation 
{
	public static void main(String[] args)
	{
//		
//		Animal a=new Mammal("Lion",true);
//		a.makeSound();
//		Mammal m=(Mammal) a.reproduce();
//		if(m.hasFur()!=false)
//		{
//			
//		}
//	
//	}
	Animal animal ;
    animal = new Mammal("Lion",true);
    Mammal m = (Mammal)animal;
    System.out.println(m);
    m.nurseYoung();
    if(m.hasFur()!= false)
    {
    	System.out.println("mammal has fur");
    }
    else
    {
    	System.out.println("mammal has not fur");
    }
    
    animal.makeSound(); animal.reproduce();
	animal = new Bird("eagle",true);
	Bird b = (Bird) animal;
	System.out.println(b);
	if(b.canFly() != false)
    {
    	System.out.println("The birds can fly");
    }
	else
	{
		System.out.println("The birds cannot fly");
	}
		
	b.buildNest();
	animal.makeSound(); animal.reproduce();
	
	}

	
}
