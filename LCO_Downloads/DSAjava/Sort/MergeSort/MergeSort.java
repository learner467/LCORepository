/**
 * MergeSort
 */
public class MergeSort {

    void merge(int arr[], int l, int m, int r) {
        int s1 = m - l + 1;
        int s2 = r - m;

        int LEFT[] = new int[s1];
        int RIGHT[] = new int[s2];

        for (int i = 0; i < s1; i++) {
            LEFT[i] = arr[l + i];
        }
        for (int j = 0; j < s2; j++) {
            RIGHT[j] = arr[m + 1 + j];
        }

        // compare
        int i = 0;
        int j = 0;
        int k = l;

        while (i < s1 && j < s2) {
            if (LEFT[i] <= RIGHT[j]) {
                arr[k] = LEFT[i];
                i++;
            } else {
                arr[k] = RIGHT[j];
                j++;
            }
            k++;
        }

        while (i < s1) {
            arr[k] = LEFT[i];
            k++;
            i++;
        }
        while (j < s2) {
            arr[k] = RIGHT[j];
            k++;
            j++;
        }

    }

    void msort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            msort(arr, l, m);
            msort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
}