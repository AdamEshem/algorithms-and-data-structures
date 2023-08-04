import java.util.Arrays;

public class SortingAlgorithms {
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

    
    public static void main (String[] args) {
        int[] a = {6, 3, 5, 4, 2, 1, 0, 9, 7, 8};
        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}