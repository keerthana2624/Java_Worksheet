import java.util.Scanner;

public class AveragePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (negative number to stop): ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
            count++;
        }

        scanner.close();

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of all positive numbers entered: " + average);
        } else {
            System.out.println("No positive numbers were entered.");
        }
    }
}

