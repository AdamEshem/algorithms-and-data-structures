import java.util.Arrays;

public class SortingAlgorithms {
    //Insertion Sort Code
    static void insertionSort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            while((j >= 0) && (a[j] > current)) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = current;
        }
    }


    //Merge Sort Code

    static void merge(int[] a, int p, int q, int r) {
        int leftSize = q - p + 1;
        int rightSize = r - q;
        int[] left = new int[leftSize + 1];
        int[] right = new int[rightSize + 1];
        for(int i = 0; i < leftSize; i++) {
            left[i] = a[p + i];
        }
        for(int i = 0; i < rightSize; i++) {
            right[i] = a[q + i + 1];
        }
        left[leftSize] = Integer.MAX_VALUE;
        right[rightSize] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for(int k = p; k <= r; k++) {
            if(left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
        }
    }

    static void mergeSort(int[] a, int p, int r) {
        if(p < r) {
            int q = Math.floorDiv((p + r), 2);
            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
            merge(a, p, q, r);
        }
    }


    public static void main (String[] args) {
        int[] a = {6, 3, 5, 4, 2, 1, 0, 9, 7, 8};
        System.out.println(Arrays.toString(a));
        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}