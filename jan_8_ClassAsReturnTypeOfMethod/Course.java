package jan_8_ClassAsReturnTypeOfMethod;

public class Course
{
  private String courseName;
  private String courseAuthor;
	  
	public Course(String courseName, String courseAuthor)
	{
		super();
		this.courseName = courseName;
		this.courseAuthor = courseAuthor;
	}

	public String getName() {
		return courseName;
	}
  
	public String getAuthor() 
	{
		return courseAuthor;
		
	}
	
	public void setName(String courseName) {
		 this.courseName = courseName;
	}
	
	
  

}
