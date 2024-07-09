import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReverseStrings {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings (enter empty string to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }
        System.out.println("\nStrings in reverse order:");
        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.println(reverseString(strings.get(i)));
        }

        scanner.close();
    }
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
