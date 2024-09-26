package Com.feb29.testexam;


@FunctionalInterface
interface BooleanOperation 
{
    boolean evaluate(int a, int b);
}


@FunctionalInterface
interface DoubleFunction
{
    double calculate(double x, double y);
}

public class FunctionalInterfacesExample
{
 public static void main(String[] args) {
     
     BooleanOperation b1 = new BooleanOperation() 
     {
         @Override
         public boolean evaluate(int a, int b) 
         {
             return (a % 3 == 0) && (b % 5 == 0) && ((a + b) % 2 == 0);
         }
     };

     
     DoubleFunction d1 = new DoubleFunction()
     {
         @Override
         public double calculate(double x, double y) 
         {
             if (x > 0 && y < 0 && x % 2 == 0) 
             {
                 return (y != 0) ? Math.pow(x, 3) / y : 1;
             }
             else if (x < 0 && y > 0 && y % 2 != 0)
             {
                 return x * y * x * y;
             }
             else
             {
                 return x + y;
             }
         }
     };

     
     System.out.println(b1.evaluate(9, 10));

     
     System.out.println(d1.calculate(-6.0, 3.0));
 }
}
