import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position of the Fibonacci number to find: ");
        int n = scanner.nextInt();

        scanner.close();

        int fibonacciNumber = findFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
    }

    public static int findFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}

