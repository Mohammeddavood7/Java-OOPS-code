package Com.jan_lab;

public class DayScholar extends Student
{
	private double transportFee;
	
  public DayScholar()
  {
	  
  }
  
   public DayScholar(int studentId,String studentName,double studentExamFee, double transportFee) 
   {
	super(studentId,studentName,studentExamFee);
	 this.transportFee = transportFee;
   }

   public double getTransportFee()
   {
	return transportFee;
   }

	@Override
	public String toString()
	{
		return "DayScholar [transportFee=" + transportFee + ", getStudentId()="
				+ getStudentId() + ", getStudentName()=" + getStudentName() + ", getStudentExamFee()=" + getStudentExamFee()+  "]";
	}

   
    
   
   
     
    
   
   
   
   
      
}
