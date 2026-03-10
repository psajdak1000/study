package bootcamp.week3;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        printArrayElements(array);
        getMaxValue(array);
        getAvgValue(array);

        String wynikTernaryOperator = array.length > 5 ? "Array has more than 5 elements" : "Array has 5 or fewer elements";
        System.out.println("\n" + wynikTernaryOperator);
    }

    private static void getAvgValue(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = (double) sum / array.length;
        System.out.println("\nAverage value in the array is: " + avg);
    }

    private static void getMaxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("\nMax value in the array is: " + max);
    }

    private static void printArrayElements(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }



}
