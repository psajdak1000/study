package bootcamp.week3;

import java.util.Arrays;
//5min

public class SortingExample {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("Original array: " + Arrays.toString(array));
        Arrays.sort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));

        int result = Arrays.binarySearch(array, 5);
        System.out.println("Element found at index: " + result);

        bubbleSort(array);
        System.out.println("Sorted array using bubble sort: " + Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
