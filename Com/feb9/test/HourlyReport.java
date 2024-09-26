package Com.feb9.test;

public class HourlyReport extends WeatherReport 
{
	public void generateReport(String str)
	{
		System.out.println("location: "+str);
		
	}
	
	public void generateReport(int a,int m,int d)
	{
		System.out.println("year: "+a+" month: "+m+" day: "+d);
	}

}
