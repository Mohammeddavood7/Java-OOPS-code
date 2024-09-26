package Com.jan30.wrapper;

public class Wrapper
{
	public static void main(String[] args) {
	
	int x = 12;
	Integer obj = Integer.valueOf(x);
	System.out.println(obj);
	
	Integer obj1 = 14;
	System.out.println(obj1);
	
	int y = 13;
	String obj3 = Integer.toString(y);
	System.out.println(obj3);
	
	String s = "77";
	Integer obj4 = Integer.valueOf(s);
	System.out.println(obj4);
	
	System.out.println("----------------------------------");
	Integer no1 = Integer.valueOf(12);
	System.out.println(no1);
	Integer no2 = Integer.valueOf(12);
	System.out.println(no2);
	
	Integer no3 = Integer.valueOf("111",36);
	System.out.println(no3);
	
	
	char ch = 'A';
	 
	 Character valueOf = Character.valueOf(ch);
	 System.out.println(valueOf);
	 
	 char ch1 = 65;
	 System.out.println((char)ch1+1);
	
	}
}
