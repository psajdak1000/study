package bootcamp.week3;

import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("Original array: " + Arrays.toString(array));
        Arrays.sort(array);

        System.out.println("\nSorted array: " + Arrays.toString(array));
    }
}
