package dec.reuse;

public class Tables {
	public static String getTables(int t) {
		String table="";
		for (int i = 1; i <= 10; i++) 
		{
			table += t + " * " + i + " = " + (t * i)+" \n";
		}
		return table;
	}
}