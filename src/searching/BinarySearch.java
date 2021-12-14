package searching;

import java.util.Scanner;

public class BinarySearch {
    private static boolean searchElement(int[] array, int key) {
        int low = 0;
        int high = array.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == key) {
                return true;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 9, 7, 5, 6, 2, 4, 8};
        int key;
        System.out.print("Enter the element to be searched ");
        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();
        System.out.println(key + " present in Array? " + searchElement(array, key));
    }
}
