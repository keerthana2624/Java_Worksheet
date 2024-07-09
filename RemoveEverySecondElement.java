import java.util.ArrayList;

public class RemoveEverySecondElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int lastRemaining = removeEverySecondElement(list);
        System.out.println("Last remaining element: " + lastRemaining);
    }

    public static int removeEverySecondElement(ArrayList<Integer> list) {
        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }
        return list.get(0); 
    }
}
