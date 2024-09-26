package Com.feb9.test;

public class Images extends Media
{
	private String resolution;

	public Images(String title, int duration, String resolution) {
		super(title, duration);
		this.resolution = resolution;
	}
	
	public Images getDetails()
	{
		System.out.println(getTitle()+"  "+getDuration()+"  "+resolution);
		return this;
	}

	public String getResolution() {
		return resolution;
	}
	
	

}
