/**
 * CountingSort
 */
public class CountingSort {

    public static void countingSort(int[] myarr, int high) {
        int counter[] = new int[high + 1];

        for (int i : myarr) {
            counter[i]++;
        }

        int startpoint = 0;
        for (int i = 0; i < counter.length; i++) {
            while (0 < counter[i]) {
                myarr[startpoint++] = i;
                counter[i]--;
            }
        }
    }

    public static void main(String[] args) {
        // TODO: Test this code
    }
}