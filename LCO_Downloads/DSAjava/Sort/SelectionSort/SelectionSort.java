/**
 * SelectionSort
 */
public class SelectionSort {

    // to print array elements
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // swap here
            int tmp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int myArray[] = { 5, 4, 1, 8, 3 };
        sort.selectionSort(myArray);
        sort.printArray(myArray);
    }
}