package Com.feb22.labtaskByown;
import java.util.function.BiPredicate;

public class BiPedicateCode
{
	public static void main(String[] args)
	{
		BiPredicate<String ,Integer> bipe = (name,num) -> name.length()==num; 
		boolean test = bipe.test("Ravi", 4);
		System.out.println(test);
		
		BiPredicate<Integer,String> bipe1 = (num,name) -> num==name.length();
		boolean test1 = bipe1.test(1, "a");
		System.out.println(test1);
		
	}

}
