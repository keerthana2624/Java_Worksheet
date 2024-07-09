public class SumUpToN {
    public static void main(String[] args) {
        int n = 10;
        int sum = sumUpToN(n);
        System.out.println("Sum of numbers up to " + n + " is: " + sum);
    }
    public static int sumUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
