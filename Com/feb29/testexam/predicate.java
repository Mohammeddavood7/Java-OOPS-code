package Com.feb29.testexam;

import java.util.function.Predicate;

import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args)
    {
  

        Predicate<Integer> p = n ->
        {
            if (n <= 1)
            {
                return false;
            }
            
            for (int i = 2; i < n/2; i++)
            {
                if (n % i == 0)
                {
                    return false;
                }
            }
            return true;
        };

        boolean result = p.test(7);
        System.out.println(result);
    }
}


