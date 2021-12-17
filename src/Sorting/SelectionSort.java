package Sorting;
import java.util.Arrays;

public class SelectionSort {
    private static void sortArray(int array[]) {
        int i, j, k;
        for (i = 0; i < array.length; i++) {
            for (j = k = i; j < array.length; j++) {
                // if array[k] is smaller than array[j] then we will point k at j
                if (array[j] < array[k]) {
                    k = j; // K is not pointing at small element
                }
            }
            // swapping k with the smallest element
            int temp = array[i];
            array[i] = array[k];
            array[k] = temp;
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 3, 9, 7, 5, 6, 2, 4, 8};
        System.out.println("Array Before Sorting " + Arrays.toString(array));
        sortArray(array);
        System.out.println("Array After Sorting " + Arrays.toString(array));
    }
}