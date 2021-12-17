package Sorting;

import java.util.Arrays;

public class BubbleSort {

    private static void sortArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j ++){
                // Checking if value of array[i] is greater than value of array[j]
                if(array[i] < array[j]){
                    // If array[i] is greater than array[j] then swap both elements
                    int temp = array[i]; // temp variable to hold element
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 3, 9, 7, 5, 6, 2, 4, 8};
        System.out.println("Array Before Sorting "+ Arrays.toString(array));
        sortArray(array);
        System.out.println("Array After Sorting "+ Arrays.toString(array));
    }
}
