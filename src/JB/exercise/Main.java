package JB.exercise;

public class Main {
    public static void main(String[] args) {
        //deklaracja zmiennych i typów prostych
        int sum = 0;
        int min = 1_000_000;
        int max = -100_000_000;
        long lo = 3200000000000000000L;
        short holder ;
        int positives = 0;
        int negatives = 0;
        int[] ratings = {5, 3, 4, 2, 1, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5};//przykładowe oceny

        holder = (short)lo;
        System.out.println(lo);
        //petla obliczająca sumę, min, max, liczbe pozytywnych i negatywnych ocen
        for (int rating : ratings) {
            sum += rating;
            if (rating < min) {
                min = rating;
            }
            if (rating > max) {
                max = rating;
            }
            if (rating >= 3) {
                positives++;
            } else {
                negatives++;
            }
        }
        //obliczanie średniej oceny
        double average = calculateAverage(sum, ratings.length);

        //decyzja na podstawie średniej oceny
        if (average >= 4.5) {
            System.out.println("Produkt jest doskonały!");
        } else if (average >= 3.5) {
            System.out.println("Produkt jest dobry.");
        } else if (average >= 2.5) {
            System.out.println("Produkt jest przeciętny.");
        } else {
            System.out.println("Produkt jest słaby.");

        }

        System.out.println("Średnia ocena: " + average);
        System.out.println("Liczba pozytywnych ocen: " + positives);
        System.out.println("Liczba negatywnych ocen: " + negatives);
        System.out.println("Najwyższa ocena: " + max);
        System.out.println("Najniższa ocena: " + min);

        //wyswietlanie oceny kazdego z klientów i doddatkowy komentarz
        for(int x = 0; x < ratings.length; x++) {
            System.out.print("Ocena klienta " + (x + 1) + ": " + ratings[x]);
            if (ratings[x] >= 4) {
                System.out.println(" - Zadowolony klient");
            } else if (ratings[x] == 3) {
                System.out.println(" - Neutralny klient");
            } else {
                System.out.println(" - Niezadowolony klient");
            }
        }


    }

    private static double calculateAverage(int sum, int length) {

        return (double) sum / length;
    }
}
