package Com.mar1.fornameCLASS;

public class Fibonacci {
    public static void main(String[] args) 
    {
        int n = 10; 
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int prev1 = 0;
        int prev2 = 1;

        System.out.println("Fibonacci sequence:");

        for (int i = 0; i < n; i++)
        {
        	
            System.out.print(prev1 + " ");
            
            int sum = prev1 + prev2;
            prev1 = prev2;
            prev2 = sum;
        }
    }
}















