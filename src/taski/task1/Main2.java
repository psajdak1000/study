package taski.task1;

import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {

        //otwieram scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie ");
        //tworze sobie metode
        String imie = getLine(scanner);
        System.out.println("Podaj imie ");
        String nazwisko = getLine(scanner);
        int wiek = 0;
        while (true) {
            try {
                System.out.println("Podaj wiek ");
                wiek = Integer.parseInt(getLine(scanner));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Podaj poprawny wiek ");
            }
        }

        System.out.println("uczysz sie programowac? tak/nie");
        Boolean uczy = getLine(scanner).trim().equalsIgnoreCase("tak");
        System.out.println("\nCześć " + imie + ", słyszałem, że masz " + wiek +
                " lat i uczysz się programowania. Czy to prawda? tak/nie");
        System.out.println(uczy);

        String inicjaly = " " + imie.charAt(0) + " " + nazwisko.charAt(0);
        System.out.println("czy twoje inicjaly to " + inicjaly);

        boolean uczy2 = getLine(scanner).trim().equalsIgnoreCase("tak");
        System.out.println("Tak, " + uczy2);

        //zamykam scanner
        scanner.close();
    }

    //metoda typu string przyjmujaca scanner i zwracajaca string pobrany z wpisanej lini

    private static String getLine(Scanner scanner) {
        return scanner.nextLine().trim();
    }
}
