import java.util.Scanner;

public class SumIntegersUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter an integer (0 to stop): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        scanner.close();
        System.out.println("Sum of the entered integers: " + sum);
    }
}
