package bootcamp.week3.zadPetle;

public class Petle {
    public static void main(String[] args) {
//        silnia(10);
//        palindrom("alaala");
//        palindrom("pies");
        tree(4);
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
        for (int i = ala.length()-1; i >=0; i--) {
            right.append(ala.charAt(i));
        }
        System.out.println(" check " + right);
        if (right.compareTo(left) == 0) {
            System.out.println(" jest palindromem");
        }else{
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
