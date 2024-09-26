package Com.feb9.test;

public class WeatherReportingSystem 
{
	public static void main(String[] args) {
		WeatherReport wr;
		wr = new HourlyReport();
		wr.generateReport("delhi");
		wr.generateReport(2023, 04, 13);
	}
	
	

}
