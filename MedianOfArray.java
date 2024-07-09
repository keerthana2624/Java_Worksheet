import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        double median = findMedian(arr);
        System.out.println("Median of the array: " + median);
    }

    public static double findMedian(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            int mid1 = arr[n / 2 - 1];
            int mid2 = arr[n / 2];
            return (double) (mid1 + mid2) / 2;
        }
    }
}
