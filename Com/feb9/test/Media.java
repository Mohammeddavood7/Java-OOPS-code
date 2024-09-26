package Com.feb9.test;

public class Media 
{
	
	private String title ;
	private int duration;
	public Media(String title, int duration) {
		super();
		this.title = title;
		this.duration = duration;
	}
	public String getTitle() {
		return title;
	}
	public int getDuration() {
		return duration;
	}
	
	public Media getDetails()
	{
		System.out.println(getTitle()+""+getDuration());
		return this;
	}
	@Override
	public String toString() {
		return "Media [title=" + title + ", duration=" + duration + "]";
	}
	
	
	
	
	

}
