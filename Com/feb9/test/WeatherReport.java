package Com.feb9.test;

public class WeatherReport 
{

	public void generateReport(String str)
	{
		System.out.println("generic");
		
	}
	
	public void generateReport(int a,int m,int d)
	{
		System.out.println("year"+a+"month"+m+"day"+d);
	}
	
}
