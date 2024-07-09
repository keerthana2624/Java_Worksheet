import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        if (list.size() > 2) {
            System.out.println("Element at third index: " + list.get(2));
        } else {
            System.out.println("ArrayList does not have enough elements.");
        }
    }
}