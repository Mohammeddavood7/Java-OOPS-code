package Com.feb22.labtaskByown;

import java.util.function.BiConsumer;

public class BiConsumer11 
{
	public static void main(String[] args)
	{
		BiConsumer<Integer,Integer> bico = (n1,n2) -> System.out.println(n1+n2);
		bico.accept(12, 88);
		
		BiConsumer<String,String> bico1 = (s1,s2) -> System.out.println(s1.length()+s2.length());
		bico1.accept("Gameof","Trones");
		
		
	}
	

}
