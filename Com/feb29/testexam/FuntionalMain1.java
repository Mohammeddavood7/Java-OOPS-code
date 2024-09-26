package Com.feb29.testexam;

import java.util.function.Function;

class SensorDats
{
	private double temp;
	private double humidity;
	public Object sd;
	
	public SensorDats(double temp, double humidity)
	{
		super();
		this.temp = temp;
		this.humidity = humidity;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
}

public class FuntionalMain1
{
public static void main(String[] args)
{
	Function<Double,Boolean> sd = temp -> temp>25;
	SensorDats s = new SensorDats(26,33);
	Boolean apply = sd.apply(s.getTemp());
	System.out.println(apply);
	
	
	
}
}

































