public class SortComparison {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int[] arrCopy1 = arr.clone();
        int[] arrCopy2 = arr.clone();

        int selectionSwaps = selectionSort(arrCopy1);
        int insertionSwaps = insertionSort(arrCopy2);

        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("\nSelection Sort - Swaps: " + selectionSwaps);
        printArray(arrCopy1);
        System.out.println("\nInsertion Sort - Swaps: " + insertionSwaps);
        printArray(arrCopy2);
    }

    public static int selectionSort(int[] arr) {
        int n = arr.length;
        int swaps = 0;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
                swaps++;
            }
        }
        return swaps;
    }

    public static int insertionSort(int[] arr) {
        int n = arr.length;
        int swaps = 0;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                swaps++;
            }
            arr[j + 1] = key;
        }
        return swaps;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
