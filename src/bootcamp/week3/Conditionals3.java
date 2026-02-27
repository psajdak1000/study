package bootcamp.week3;

public class Conditionals3 {
    public static void main(String[] args) {

        Zadanie1.sprawdzRok(2026);
        Zadanie2.znajdzNajwieksza(21,22,23);
        Zadanie3.czyParzysta(22);
        Zadanie4.dniWMiesiacu(2);
        Zadanie5.dniOdPoczatkuRoku(3);
        int a = 129;
        int b = 50;
        boolean bool = a < b;
        if (bool = true) System.out.println("TRUE");
        else System.out.println("FALSE");


    }
    public class Zadanie1 {
        public static void sprawdzRok(int rok) {
            if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }

    public class Zadanie2 {
        public static void znajdzNajwieksza(int a, int b, int c) {
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            System.out.println("Największa liczba to: " + max);
        }
    }

    public class Zadanie3 {
        public static void czyParzysta(int liczba) {
            if (liczba % 2 == 0) {
                System.out.println("PARZYSTA");
            } else {
                System.out.println("NIEPARZYSTA");
            }
        }
    }

    public class Zadanie4 {
        public static void dniWMiesiacu(int miesiac) {
            switch (miesiac) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("Liczba dni: 31");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("Liczba dni: 30");
                    break;
                case 2:
                    System.out.println("Liczba dni: 28 lub 29");
                    break;
                default:
                    System.out.println("Nie ma takiego miesiąca");
            }
        }
    }
    public class Zadanie5 {
        public static void dniOdPoczatkuRoku(int miesiac) {
            int dni = 0;

            switch (miesiac) {
                case 12: dni += 31; // Grudzień
                case 11: dni += 30; // Listopad
                case 10: dni += 31; // Październik
                case 9:  dni += 30; // Wrzesień
                case 8:  dni += 31; // Sierpień
                case 7:  dni += 31; // Lipiec
                case 6:  dni += 30; // Czerwiec
                case 5:  dni += 31; // Maj
                case 4:  dni += 30; // Kwiecień
                case 3:  dni += 31; // Marzec
                case 2:  dni += 28; // Luty (zakładamy 28)
                case 1:  dni += 31; // Styczeń
                    System.out.println("Dni od początku roku: " + dni);
                    break;
                default:
                    System.out.println("Nie ma takiego miesiąca");
            }
        }
    }
}
