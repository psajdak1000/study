package bootcamp.week3.zadPetleTablice;

import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {

//        reverseArray( new int[] {1, 3, 5, 6, 8, 9});
//        reverseString("odwrocStringa");
//        isPalindrome("moze jutro ta dama sama da tortu jezom");
        onlyDuplicated(new String[]{"pierwszy", "pierwszy", "drugi", "drugi",
        });

    }

    private static void onlyDuplicated(String[] strings) {
        String[] onlyDuplication = new String[strings.length];
        int numOfRepetition = 0;

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (i == j) {
                    continue;
                }

                if (strings[i].equals(strings[j])) {
                    boolean canAssign = true;
                    for (int k = 0; k < numOfRepetition; k++) {
                        if (onlyDuplication[k].equals(strings[j])) {
                            canAssign = false;
                            break;
                        }
                    }
                    if (canAssign) {
                        onlyDuplication[numOfRepetition] = strings[j];
                        numOfRepetition++;
                    }
                    break;
                }
            }
        }
        String[] finalResult = new String[numOfRepetition];

        for (int i = 0; i < finalResult.length; i++) {
            finalResult[i] = onlyDuplication[i];
        }
//        System.arraycopy(onlyDuplication, 0, finalResult, 0, finalResult.length);


        System.out.println(Arrays.toString(finalResult));
    }

    private static void isPalindrome(String stringToCheck) {
        String withoutSpaces = stringToCheck.replace(" ", "");

        String reversed = getStringReversed(withoutSpaces);

        System.out.println(withoutSpaces.equals(reversed));

    }

    private static void reverseString(String reverseString) {
        String stringReversed = getStringReversed(reverseString);
        System.out.println(stringReversed);
    }

    private static String getStringReversed(String reverseString) {
        int stringLength = reverseString.length();
        String stringReversed = "";
        for (int i = stringLength - 1; i >= 0; i--) {

            char singleChar = reverseString.charAt(i);
            stringReversed = stringReversed + singleChar;

        }
        return stringReversed;
    }

    /*temp = x1 + x2;
            System.out.println("Number of element in sequence: " + i + " element value: " + temp );
            x1 = x2;
            x2 = temp;*/

    private static void reverseArray(int[] array) {
        int temp = array[0];
        int[] startArray = array;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            System.out.println("temp = array[" + i + "] = " + temp + " array[i] = " + array[i]);
            array[i] = array[array.length - (i + 1)];
            System.out.println("array[" + i + "] = array[array.length - (i +1)] = " + array[i] + " array[array.length - (i +1)] = " + array[array.length - (i + 1)]);
            array[array.length - (i + 1)] = temp;
            System.out.println("array[array.length - (i +1)] = " + array[array.length - (i + 1)] + " temp = " + temp);
            System.out.println("------------------------------------");
            System.out.println("temp = array[" + i + "] = " + array[i]);
            System.out.println("startArray: " + Arrays.toString(startArray));
            System.out.println("number of step: " + i + ". " + Arrays.toString(array));
            System.out.println("swaped: " + array[i] + " and " + array[array.length - (i + 1)]);
            System.out.println(" what with that one ?: temp " + temp);
        }
    }
}
