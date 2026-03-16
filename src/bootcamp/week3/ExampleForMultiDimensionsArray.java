package bootcamp.week3;

import java.util.Arrays;

public class ExampleForMultiDimensionsArray {
    public static void main(String[] args) {

        String[][] array = {
                {"g1e1", "g1e2", "g1e3"},
                {"g2e1", "g2e2", "g2e3"},
                {"g3e1", "g3e2", "g3e3", "g3e4"},
                {"g4e1", "g4e2"}
        };

//        printArray(array);
//        System.out.println("-----------------------------");
//        printArray2(array);
        int[][] matrix = createMatrix(4, 6);
        printArray3(matrix);
        System.out.println("-----------------------------");
        printArray4(matrix);
        System.out.println("-----------------------------");
        breakAndContinueExample(matrix);
        System.out.println("-----------------------------");
        printSum(matrix);
        System.out.println("-----------------------------");
        printLargestNumberInRow(matrix);

    }

    private static void printLargestNumberInRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int largest = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
            System.out.println("Largest number in row " + i + ": "  + Arrays.toString(matrix[i]) + " largest: " +  largest);
        }
    }

    private static void printSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of all elements in the matrix: " + sum);
    }

    private static void breakAndContinueExample(int[][] example) {
        for (int i = 0; i < example.length; i++) {
            for (int j = 0; j < example[i].length; j++) {
                if (example[i][j] == 5) {
                    System.out.println("Found 5 at row: " + i + " column: " + j);
                    continue; // Skip the rest of the loop and continue with the next iteration
                }
                if (example[i][j] == 7) {
                    System.out.println("Found 7 at row: " + i + " column: " + j);
                    break; // Exit the inner loop
                }
                System.out.println("Value at row: " + i + " column: " + j + " is: " + example[i][j]);
            }
            if (i > example.length - 1) {
                return;
                // break; // This would only exit the outer loop, but since it's the last statement in the loop, it effectively does the same thing as return in this context.
            }

        }
        System.out.println("Finished searching the matrix.");


    }

    private static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = generateRandomNumber();
            }
        }
        return matrix;
    }

    private static int generateRandomNumber() {
        int min = 0;
        int max = 10;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    private static void printArray2(String[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print("row: " + row + " column: " + column + " value: " + array[row][column] + "   ");
            }
            System.out.println();
        }
    }

    private static void printArray3(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print("row: " + row + " column: " + column + " value: " + array[row][column] + "   ");
            }
            System.out.println();
        }
    }

    private static void printArray(String[][] array) {
        for (String[] row : array) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void printArray4(int[][] array) {
        for (int[] interarray : array) {
            System.out.println(Arrays.toString(interarray));
        }
    }
}
