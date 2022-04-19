/**
 * InsertionSort
 */
public class InsertionSort {

    void insertsort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int val = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = val;
        }
    }

    // TODO: Method to print Array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 9, 6, 7, 3, 2 };
        InsertionSort sort = new InsertionSort();
        sort.insertsort(arr);
        printArray(arr);
    }
}