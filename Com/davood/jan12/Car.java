package Com.davood.jan12;

public class Car
{
  private String make;
  private String model;
  private int year;
  
  {
	  this.make = "empty";
	  this.model = "empty";
	  this.year = 0;
  }
  
  public Car(String make, String model, int year) {
	super();
	this.make = make;
	this.model = model;
	this.year = year;
}

 
  public String getDescription()
  {
	  return ""+make+" "+model+" "+year;
	  
  }
  
}
