package searching;

import java.util.Scanner;

public class LinearSearch {
    private static boolean searchElement(int[] array, int key) {
        for (int j : array) {
            if (j == key)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 9, 7, 5, 6, 2, 4, 8};
        int key;
        System.out.print("Enter the element to be searched ");
        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();
        System.out.println(key+ " present in Array? "+ searchElement(array, key));
    }
}