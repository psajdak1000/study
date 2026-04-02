package bootcamp.week3.zadPetle;

public class Petle {
    public static void main(String[] args) {
//        silnia(10);
//        palindrom("alaala");
//        palindrom("pies");
//        tree(4);
//        printTreeNumberOfSingsAtTheBottom('@', 5);
//        checkMarkerPenColour();
//        prime10000();
//        arithmeticSequence(10);
        fibonacciSequence(10);
    }

    private static void fibonacciSequence(int finalLenght) {

    }

    private static void arithmeticSequence(int finalLength) {
        int counter = 0;
        for (int i = 39, j = 11; counter < finalLength; counter++) {
            if (counter == finalLength - 1) {
                System.out.print(i + "," + j);

            } else {
                System.out.print(i + "," + j + ",");
            }
            i = i + 2;
            j = j - 3;
        }
    }

    private static void prime10000() {
        for (int i = 0; i < 10000; i++) {
            boolean isPrime = true;

            if (i < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(i);
            }

        }
    }

    private static void checkMarkerPenColour() {
        //(czerwony, zielony, niebieski, czarny, żółty i brązowy)
        String czerwony = "czerwony";
        String zielony = "zielony";
        String niebieski = "niebieski";
        String czarny = "czarny";
        String zolty = "zolty";
        String brazowy = "brazowy";

        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0) {
                System.out.println("number of line: " + (i) + " colour of line: " + brazowy);
            }
            if (i % 6 == 1) {
                System.out.println("number of line: " + (i) + " colour of line: " + czerwony);
            }
            if (i % 6 == 2) {
                System.out.println("number of line: " + (i) + " colour of line: " + zielony);
            }
            if (i % 6 == 3) {
                System.out.println("number of line: " + (i) + " colour of line: " + niebieski);
            }
            if (i % 6 == 4) {
                System.out.println("number of line: " + (i) + " colour of line: " + czarny);
            }
            if (i % 6 == 5) {
                System.out.println("number of line: " + (i) + " colour of line: " + zolty);
            }
        }


    }

    private static void printTreeNumberOfSingsAtTheBottom(char sign, int numberOfSingsAtTheBottom) {

        int numberOfSignsAtTheTop;
        if (numberOfSingsAtTheBottom % 2 == 0) numberOfSignsAtTheTop = 2;
        else numberOfSignsAtTheTop = 1;

        int height = 0;
        for (int i = numberOfSingsAtTheBottom; i > 0; i = i - 2) {
            height++;
        }

        int numberOfSignsInARow = numberOfSignsAtTheTop;
        for (int row = 0; row < height; row++) {
            int numberOfSpaces = (numberOfSingsAtTheBottom - numberOfSignsInARow) / 2;
            for (int column = 0; column < numberOfSingsAtTheBottom - numberOfSpaces; column++) {
                if (column < numberOfSpaces) System.out.print((Object) " ");
                else System.out.print((Object) sign);
            }
            numberOfSignsInARow = numberOfSignsInARow + 2;
            System.out.println();
        }
        System.out.println();
    }

    private static void tree(int heigth) {
        int width = 1;
        int spaceNumber = heigth - 1;
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < spaceNumber; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            spaceNumber--;
            width += 2;
            System.out.println();
        }
    }

    private static void palindrom(String ala) {


        StringBuilder left = new StringBuilder();
        for (int i = 0; i < ala.length(); i++) {
            left.append(ala.charAt(i));
        }
        System.out.println(" check " + left);


        StringBuilder right = new StringBuilder();
        for (int i = ala.length() - 1; i >= 0; i--) {
            right.append(ala.charAt(i));
        }
        System.out.println(" check " + right);
        if (right.compareTo(left) == 0) {
            System.out.println(" jest palindromem");
        } else {
            System.out.println("nie jest palindromem");
        }


    }

    private static void silnia(int wynikSilni) {
        if (wynikSilni == 0) {
            wynikSilni = 1;
            System.out.println(" wynik : " + wynikSilni);
        } else if (wynikSilni < 0) {
            System.out.println("tylko dodatnie");

        } else {
            long wynik = 1;
            for (int i = 1; i <= wynikSilni; i++) {
                wynik = wynik * i;
            }
            System.out.println(" wynik: " + wynik);
        }
    }
}
