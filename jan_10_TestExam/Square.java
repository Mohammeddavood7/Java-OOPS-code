package jan_10_TestExam;

public class Square 
{
   private Rectangle rec;
   private int square;
   
public Square(Rectangle rec) {
	super();
	this.rec = rec;
	this.square = rec.getLength()*rec.getLength();	
	
}

@Override
public String toString() {
	return rec + "  square =" + square;
	}





   
   
	

}
