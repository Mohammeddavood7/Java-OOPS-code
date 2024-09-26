package Com.feb29.testexam;

import java.util.function.BiFunction;

public class Bifunction 
{
	public static void main(String[] args) 
	{
		BiFunction<String,String,String> bi = (a,b) -> a+b;
		String res = bi.apply("Java", "Programming");
		System.out.println(res);
		
	}

}
