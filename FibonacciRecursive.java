public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 10; 
        long fibonacciNumber = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciNumber);
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
