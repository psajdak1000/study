package JB.exercise;

public class InfluencerStats {
    public static void main(String[] args) {
        // Influencer A
        byte likesA = 100;
        short downloadsA = 25_000;

        // Influencer B
        byte likesB = 80;
        short downloadsB = 10_000;

        // Influencer C
        int viewsC = 1_000_000;
        long platformViews = 4_000_000_000L;

        // TODO 1: Dodaj likesA i downloadsA i zapisz do int
        int totalA = likesA + downloadsA; // byte + short → int
        System.out.println("Total A (likes + downloads): " + totalA);

        // TODO 2: Dodaj likesB i downloadsB i zapisz do short (użyj rzutowania)
        short totalB = (short)(likesB + downloadsB); // byte + short → int, trzeba rzutować
        System.out.println("Total B (likes + downloads) with cast: " + totalB);

        // TODO 3: Dodaj viewsC i platformViews i zapisz do long
        long allViews = viewsC + platformViews; // int + long → long
        System.out.println("All views (viewsC + platformViews): " + allViews);

        // TODO 4: Dodaj downloadsA i 10_000, zapisz do short – sprawdź co się stanie (czy przepełnienie?)
        short moreDownloads = (short)(downloadsA + 10_000); // 25_000 + 10_000 = 35_000 → przekracza zakres short
        System.out.println("More downloads (overflow?): " + moreDownloads); // wynik będzie ujemny

        // TODO 5: Przepełnij byte: stwórz byte z wartością 127 i dodaj 1
        byte overflowTest = 127;
        overflowTest += 1; // przepełnienie → wynik: -128
        System.out.println("Byte after overflow: " + overflowTest);

        // TODO 6: Wszystkie wyniki zostały już wypisane powyżej
    }
}