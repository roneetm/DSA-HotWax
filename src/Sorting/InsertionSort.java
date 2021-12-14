package Sorting;

import java.util.Arrays;

public class InsertionSort {
    private static void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int x = array[i];
            while (j >= 0 && array[j] > x) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = x;

        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 9, 7, 5, 6, 2, 4, 8};
        System.out.println("Array Before Sorting " + Arrays.toString(array));
        sortArray(array);
        System.out.println("Array After Sorting " + Arrays.toString(array));
    }
}
