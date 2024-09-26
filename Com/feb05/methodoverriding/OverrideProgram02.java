package Com.feb05.methodoverriding;

public class OverrideProgram02 
{
	public static void main(String[] args) 
	{
        Shape randshape = Shape.randshape();
        if(randshape != null)
        {
        	randshape.draw();
        	randshape.erase();
        }
        
	}
	
}