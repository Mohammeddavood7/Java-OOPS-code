package Com.feb9.test;

public class Videos extends Media
{
	private String format;

	public Videos(String title, int duration, String format) {
		super(title, duration);
		this.format = format;
	}
	
	public Videos getDetails()
	{
		System.out.println(getTitle()+"   "+getDuration()+"  "+getDuration()+format);
		return this;
	}
	

}
