package Com.feb21.FunctionPREDEFINED;

import java.util.function.Function;
import java.util.function.Predicate;



public class Functions 
{
	public static void main(String[] args)
	{
	/*	Function<Integer,Integer> fn1 = num -> num*num*num;
		System.out.println("Area Cube: "+fn1.apply(5));
		
		Function<product,product> fn2 = prod -> { return prod;};
		product apply = fn2.apply(new product(444,"warner"));
				System.out.println(apply);
	    Function<String,Integer> fn3 = str -> str.length();
	    System.out.println("length : "+fn3.apply("Ravi"));
	    
	    Function<String,Boolean> sb = str -> str.startsWith("R");
	    Boolean apply2 = sb.apply("Ravi");
	    System.out.println("Name start with R: "+apply2); */
	    
	    Function<Integer,Boolean> leafy = leapYear -> 
	    {
	       boolean isLeapYear = false;
	    	if (leapYear % 4 == 0)
	    	{
	            if (leapYear % 100 != 0 || leapYear % 400 == 0)  
	            {
	                isLeapYear = true;
	            }
	        }
	    	
	    	return isLeapYear;
	    	 
	    };
	   System.out.println("If it is true leapYear: "+leafy.apply(2020));
	   
	   
	   
	/*  Predicate<Integer> pInd = year -> 
	  {
		
		  boolean isLeapYear = false;
		  if (year % 4 == 0)
	    	{
	            if (year % 100 != 0 || year % 400 == 0) 
	            {
	                isLeapYear = true;
	            }
	        }
		return isLeapYear;
	  };
	  
	  System.out.println("IF IT IS TRUE LEAPYEAR: "+pInd.test(2023));
	}
	
	record product(int id,String name)
	{
		
	}*/
	
	
	}

}
