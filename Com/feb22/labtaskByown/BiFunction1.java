package Com.feb22.labtaskByown;

import java.util.function.BiFunction;
public class BiFunction1
{
	public static void main(String[] args) 
	{
		BiFunction<String,String,Integer> bifun = (s1,s2) -> s1.length()+s2.length();
		Integer apply = bifun.apply("Davood", "Mohammed");
		System.out.println("Length of the two string: "+apply);
		
	}

}
