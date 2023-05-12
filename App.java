public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 64, 34, 25, 22, 11, 90 };
        bubbleSort(arr, true);
        System.out.println("Array setelah diurutkan secara ascending:");
        printArray(arr);

        int[] arr2 = { 64, 34, 25, 22, 11, 90 };
        insertionSort(arr2, false);
        System.out.println("Array 2 setelah diurutkan secara descending:");
        printArray(arr2);

        int[] arr3 = { 64, 34, 25, 12, 22, 100, 90 };
        selectionSort(arr3, true);
        System.out.println("Array 3 setelah diurutkan secara ascending:");
        printArray(arr3);
    }

    public static void insertionSort(int[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && (ascending ? arr[j] > key : arr[j] < key)) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (ascending ? arr[j] < arr[minIndex] : arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ascending ? arr[j] > arr[j + 1] : arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}