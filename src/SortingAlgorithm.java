public class SortingAlgorithm {
    public static void printArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        printArray(a);
    }

    private static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n - 1; i++) {
            // todo: chèn a[i] vào dãy 0 -> i-1
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
        }
        printArray(a);
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // todo: Tìm min [i,n]
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        printArray(a);
    }

    public static void main(String[] args) {
        int[] a = { 8, 1, 2, 3, 6, 5, 7, 4, 6, 5 };
        printArray(a);
        bubbleSort(a);
        insertionSort(a);
        selectionSort(a);
    }
}
