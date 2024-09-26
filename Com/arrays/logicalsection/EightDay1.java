package Com.arrays.logicalsection;

public class EightDay1
{
	public static void print(Integer[] a)
	{
		System.out.println("Integer");
	}
	public static void print(Object a)
	{
		System.out.println("Object");
	}
	public static void print(Float a)
	{
		System.out.println("Float ");
	}
	
	
	public static void main(String[] args) 
	{
		String arr1 []= {"ram","sam","ran"};
		EightDay1.print(arr1);
		Integer arr2[] = {1,2,3,4,5};
		
		EightDay1.print(arr2);
		
	}

}
