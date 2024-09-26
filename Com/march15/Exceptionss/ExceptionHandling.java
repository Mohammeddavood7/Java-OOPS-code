package Com.march15.Exceptionss;

public class ExceptionHandling
{
        public static void main(String[] args)
        {
                try
                {
                        Exception arithmetic = new Exception("Exception...");
                        
                        arithmetic.initCause(new ArithmeticException("ArithmeticException"));
                       // System.out.println(initCause.getCause());
                        throw arithmetic;
                }
                catch (Exception e)
                {
                        System.out.println(e.getCause());
                }
                try
                {
                        NumberFormatException numberFormat = new NumberFormatException("NumberFormatException");
                        numberFormat.initCause(new NullPointerException("NullPointerException"));
                        throw numberFormat;
                }
                catch(NumberFormatException numberFormat)
                {
                        System.out.println(numberFormat.getCause());
                }
        }
}









































































