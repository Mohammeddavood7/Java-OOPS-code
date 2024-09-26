package Com.feb21.FunctionPREDEFINED;

import java.util.function.Consumer;

public class ConsumerDemo 
{
	public static void main(String[] args)
	{
		Consumer<Integer> typeInt = num -> System.out.println("Integer : "+num);
		typeInt.accept(222);
	    Consumer<String> st = str -> System.out.println("String: "+str);
	    st.accept("Smith");
	    
	    Consumer<String> st1 = str -> System.out.println("Name starts with R:  "+str.startsWith("R"));
	    st1.accept("Ravi");
	    
	    Consumer<Employee> emp = str -> System.out.println(str);
	    emp.accept(new Employee(222,"Scott"));
	}

	
	
	record Employee(int id,String name)
	{
		
	}
}
