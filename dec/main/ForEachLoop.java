package dec.main;

import java.util.Arrays;

public class ForEachLoop 
{
public static void main(String[] args)
   {
	int []values = {1944499,3444993,49449,59944,444629};
	Arrays.sort(values);
	for(int value:values)
	{
		System.out.println(value);
	}
	
	System.out.println("................................");
	
	String []strs = {"mango","green","purple","apple"};
	Arrays.sort(strs);
	for(String str:strs)
	{
	System.out.println(str);	
	}
   }
}
