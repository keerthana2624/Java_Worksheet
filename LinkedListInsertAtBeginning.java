import java.util.LinkedList;

public class LinkedListInsertAtBeginning {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        insertAtBeginning(list, 10);
        insertAtBeginning(list, 20);
        insertAtBeginning(list, 30);
        System.out.println("LinkedList after insertions:");
        printList(list);
    }
    public static void insertAtBeginning(LinkedList<Integer> list, int value) {
        list.addFirst(value);
    }
    public static void printList(LinkedList<Integer> list) {
        for (Integer value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
