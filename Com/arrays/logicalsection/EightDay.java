package Com.arrays.logicalsection;

public class EightDay
{
	public static void main(String[] args)
	{
		EightDay e1 = new EightDay();
		//System.out.println(e1.hashCode());
		System.out.println(System.identityHashCode(e1));
		
		EightDay e2 = new EightDay();
		//System.out.println(e2.hashCode());
		System.out.println(System.identityHashCode(e2)+"\n");
		
		String s1 = "D";
		String s2 = "D";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode()+"\n");
		
		//System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);
		
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		
		
	}

}
