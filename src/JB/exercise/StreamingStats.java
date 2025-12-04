package JB.exercise;

public class StreamingStats {
    public static void main(String[] args) {
        // Dane zapisane w różnych typach liczbowych
        byte likesPerComment = 120;                  // liczba lajków pod jednym komentarzem
        short appDownloads = 30_000;                 // liczba pobrań aplikacji
        int videoViews = 2_000_000;                  // liczba wyświetleń jednego wideo
        long totalPlatformViews = 5_000_000_000L;    // suma wszystkich wyświetleń w serwisie

        // Dodawanie typów byte + short → wynik to int
        int likesAndDownloads = likesPerComment + appDownloads;
        System.out.println("likesAndDownloads: " + likesAndDownloads);

        // Dodawanie int + long → wynik to long
        long allViews = videoViews + totalPlatformViews;
        System.out.println("allViews: " + allViews);

        // Ręczne rzutowanie wyniku do short – może zadziałać, ale ostrożnie
        short castedResult = (short) (likesPerComment + appDownloads);
        System.out.println("castedResult (short): " + castedResult);

        // Przepełnienie – wynik przekracza zakres short
        short downloadsAfterAd = (short)(appDownloads + 10_000);
        System.out.println("downloadsAfterAd: " + downloadsAfterAd);

        // Przepełnienie w typie byte – wynik zawija się od -128
        byte maxLikes = 127;
        maxLikes += 1;
        System.out.println("maxLikes after overflow: " + maxLikes); // wynik: -128
    }
}