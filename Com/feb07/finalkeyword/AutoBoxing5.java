package Com.feb07.finalkeyword;

public class AutoBoxing5 
{
	public static void main(String[] args) 
	{
		int x = 12;
		String str = Integer.toString(x);
		System.out.println(str+2);
		int x1 =33;
		String str2 = Integer.toString(x1);
		System.out.println(str2+17);
		
		String a = "23";
		Integer b = Integer.valueOf(a);
		System.out.println(b+17);
		
		Integer b1 = Integer.valueOf("111",2);
		System.out.println(b1);
		
		
	}
}