package bootcamp.week3.quiz6;

import java.util.Arrays;

public class SortingExample2 {
    public static void main(String[] args) {
        int[] array = {4, 2, 6,1, 5, 6, 7, 9, 8};
        bubbleSort(array);
    }

    private static void bubbleSort(int[] array) {
        int temp;

        for( int i = 0; i < array.length ; i++  ){
            for(int j = 0; j < array.length ; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }

        }

        System.out.println(Arrays.toString(array));



    }

    private static void bubbleSort2(int[] array) {
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            // Wewnętrzna pętla iteruje tylko do ostatniego nieposortowanego elementu
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Zamiana miejscami, jeśli elementy są w złej kolejności
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort3(int[] array){
        int size = array.length;

    }


}

