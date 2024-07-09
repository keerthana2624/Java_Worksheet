import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
    public static void main(String[] args) {
        int[] arr1 = generateRandomArray(1000000); 
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();

        System.out.println("Sorting comparison for array of size " + arr1.length + ":");

        // Bucket Sort
        long startTime1 = System.currentTimeMillis();
        bucketSort(arr1);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Bucket Sort Time: " + (endTime1 - startTime1) + " ms");

        // Radix Sort
        long startTime2 = System.currentTimeMillis();
        radixSort(arr2);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Radix Sort Time: " + (endTime2 - startTime2) + " ms");

        // Quick Sort
        long startTime3 = System.currentTimeMillis();
        quickSort(arr3, 0, arr3.length - 1);
        long endTime3 = System.currentTimeMillis();
        System.out.println("Quick Sort Time: " + (endTime3 - startTime3) + " ms");
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size); 
        }
        return arr;
    }

    public static void bucketSort(int[] arr) {
        int n = arr.length;
        if (n <= 0) return;
        int max = Arrays.stream(arr).max().getAsInt();
        int bucketSize = max / n + 1;
        @SuppressWarnings("unchecked")
        java.util.List<Integer>[] buckets = new java.util.ArrayList[n];
        for (int i = 0; i < n; i++) buckets[i] = new java.util.ArrayList<>();
        for (int i : arr) buckets[i / bucketSize].add(i);
        for (int i = 0, j = 0; i < n; i++)
            for (int k : buckets[i]) arr[j++] = k;
    }

    public static void radixSort(int[] arr) {
        for (int e = 1, d = 1; e != 0; d *= 10) {
            int[] h = new int[10], b = new int[arr.length];
            boolean f = false;
            for (int i : arr) h[(i % (d * 10)) / d]++;
            for (int i = 1; i < 10; i++) {
                if (f |= h[i] != 0) h[i] += h[i - 1];
            }
            for (int i = arr.length; i-- > 0; b[--h[(arr[i] % (d * 10)) / d]] = arr[i]) ;
            for (int i = arr.length; i-- > 0; arr[i] = b[i]) ;
            e = f ? e : 0;
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = partition(arr, low, high);
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
