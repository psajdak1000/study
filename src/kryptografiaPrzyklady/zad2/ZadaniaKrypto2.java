package kryptografiaPrzyklady.zad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ZadaniaKrypto2 {

    public static void main(String[] args) {
        System.out.println("=== ZADANIE 1: Szyfr Jednorazowy (Książka Kodowa) ===");
        testZadanie1();

        System.out.println("\n=== ZADANIE 2: Szyfr Paskowy (8 znaków) ===");
        testZadanie2();

        System.out.println("\n=== ZADANIE 3: Szyfr Tritemiusza ===");
        // Szyfr, gdzie przesunięcie zwiększa się o 1 dla każdej kolejnej litery
        String triTekst = "ALGORYTM";
        String triSzyfr = tritemiuszSzyfruj(triTekst);
        System.out.println("Tekst: " + triTekst);
        System.out.println("Szyfr: " + triSzyfr);
        System.out.println("Odszyfrowany: " + tritemiuszDeszyfruj(triSzyfr));

        System.out.println("\n=== ZADANIE 4 i 5: Szyfr Vigenere'a i Bellaso ===");
        // W kontekście podstawowym te szyfry działają na identycznej zasadzie (tablica)
        String vigTekst = "TAJNE";
        String vigKlucz = "KLUCZ"; // Szyfrujemy słowem kluczowym
        String vigSzyfr = vigenereSzyfruj(vigTekst, vigKlucz);

        System.out.println("Tekst: " + vigTekst + ", Klucz: " + vigKlucz);
        System.out.println("Szyfr (Vigenere/Bellaso): " + vigSzyfr);
        System.out.println("Odszyfrowany: " + vigenereDeszyfruj(vigSzyfr, vigKlucz));

        System.out.println("\n=== ZADANIE 6: Własny Szyfr Podstawieniowy ===");
        testZadanie6();
    }

    // --- ZADANIE 1: Szyfr Jednorazowy (One-Time Pad) ---
    // [cite: 11, 12, 13]
    static void testZadanie1() {
        // Generujemy "Książkę kodową" - 5 kart, każda 150 znaków (10x15)
        List<String> ksiazkaKodowa = new ArrayList<>();
        Random rand = new Random();

        // Tworzenie kart [cite: 14]
        for (int i = 0; i < 5; i++) {
            StringBuilder karta = new StringBuilder();
            for (int j = 0; j < 150; j++) {
                karta.append((char) ('A' + rand.nextInt(26)));
            }
            ksiazkaKodowa.add(karta.toString());
        }

        String wiadomosc = "TAJNAWIADOMOSC";

        // Pobieramy (i usuwamy) pierwszą kartę z góry
        String kluczKarta = ksiazkaKodowa.remove(0);

        // Szyfrujemy
        String szyfrogram = vigenereSzyfruj(wiadomosc, kluczKarta); // OTP to matematycznie Vigenere z losowym kluczem

        System.out.println("Wylosowana karta (fragment): " + kluczKarta.substring(0, 20) + "...");
        System.out.println("Wiadomość: " + wiadomosc);
        System.out.println("Szyfrogram: " + szyfrogram);
        System.out.println("Pozostało kart w książce: " + ksiazkaKodowa.size());

        // Deszyfracja (odbiorca musi mieć kopię tej samej karty)
        System.out.println("Odszyfrowane: " + vigenereDeszyfruj(szyfrogram, kluczKarta));
    }

    // --- ZADANIE 2: Szyfr Paskowy ---
    // [cite: 16, 17]
    static void testZadanie2() {
        // Symulacja pasków - każdy pasek to losowo wymieszany alfabet
        String[] paski = {
                "QWERTYUIOPASDFGHJKLZXCVBNM", // Pasek 1
                "PLMKOIJNBHUYGVCFTRDXZSEWAQ", // Pasek 2
                "ZXCVBNMASDFGHJKLQWERTYUIOP", // ... itd (uproszczone dla czytelności)
                "MNBVCXZLKJHGFDSAPOIUYTREWQ",
                "POIUYTREWQLKJHGFDSAMNBVCXZ",
                "ASDFGHJKLMNBVCXZQWERTYUIOP",
                "ZKJHGFDSAPOIUYTREWQMNBVCXA",
                "YTREWQASDFGHJKLMNBVCXZPOIU"
        };

        String tekst = "INTERNET"; // 8 znaków
        int skok = 5; // O tyle przesuwamy się w dół na pasku

        StringBuilder szyfr = new StringBuilder();
        StringBuilder pierwszeLitery = new StringBuilder(); // Potrzebne do deszyfracji

        // Szyfrowanie
        for (int i = 0; i < tekst.length(); i++) {
            char litera = tekst.charAt(i);
            String pasek = paski[i];

            int pozycja = pasek.indexOf(litera); // Znajdź literę na pasku
            pierwszeLitery.append(pasek.charAt(0)); // Zapamiętujemy "ID" paska lub jego układ

            // Pobierz literę o 'skok' niżej (modulo 26)
            char zaszyfrowana = pasek.charAt((pozycja + skok) % 26);
            szyfr.append(zaszyfrowana);
        }

        System.out.println("Tekst (8 znaków): " + tekst);
        System.out.println("Szyfrogram: " + szyfr);

        // Deszyfracja
        // Danymi są: Szyfrogram, Paski (tu zasymulowane globalnie) i Skok
        StringBuilder odszyfrowane = new StringBuilder();
        for (int i = 0; i < szyfr.length(); i++) {
            char literaCypher = szyfr.charAt(i);
            String pasek = paski[i];

            int pozycja = pasek.indexOf(literaCypher);
            // Cofamy się o skok (dodajemy 26 żeby nie wyjść na minus)
            char jawna = pasek.charAt((pozycja - skok + 26) % 26);
            odszyfrowane.append(jawna);
        }
        System.out.println("Odszyfrowane: " + odszyfrowane);
    }

    // --- ZADANIE 3: Tritemiusz ---
    //
    static String tritemiuszSzyfruj(String tekst) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
            int shift = i; // Przesunięcie rośnie: 0, 1, 2, 3...
            sb.append(przesun(c, shift));
        }
        return sb.toString();
    }

    static String tritemiuszDeszyfruj(String tekst) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
            int shift = i;
            sb.append(przesun(c, -shift));
        }
        return sb.toString();
    }

    // --- ZADANIE 4 i 5: Vigenere / Bellaso ---
    //
    // Uniwersalna metoda dla obu tych szyfrów (działają na tablicy przesunięć)
    static String vigenereSzyfruj(String tekst, String klucz) {
        StringBuilder sb = new StringBuilder();
        int kIndex = 0;
        for (char c : tekst.toCharArray()) {
            // Przesunięcie zależy od litery klucza ('A'=0, 'B'=1...)
            int shift = klucz.charAt(kIndex % klucz.length()) - 'A';
            sb.append(przesun(c, shift));
            kIndex++;
        }
        return sb.toString();
    }

    static String vigenereDeszyfruj(String tekst, String klucz) {
        StringBuilder sb = new StringBuilder();
        int kIndex = 0;
        for (char c : tekst.toCharArray()) {
            int shift = klucz.charAt(kIndex % klucz.length()) - 'A';
            sb.append(przesun(c, -shift)); // Odejmujemy przesunięcie
            kIndex++;
        }
        return sb.toString();
    }

    // --- ZADANIE 6: Własny przykład (Szyfr "Odwrócone pary") ---
    //
    static void testZadanie6() {
        /* * OPIS ALGORYTMU:
         * Jest to prosty szyfr podstawieniowy monoalfabetyczny.
         * Alfabet dzielimy na pary: A zamienia się z B, C z D, E z F itd.
         * Jeśli litera jest parzysta (w ASCII), dodajemy 1. Jeśli nieparzysta, odejmujemy 1.
         */
        String tekst = "ZADANIE";
        StringBuilder wynik = new StringBuilder();

        for (char c : tekst.toCharArray()) {
            // Logika zamiany parami
            if (c % 2 == 0) {
                wynik.append((char)(c + 1)); // np. B -> C (uproszczone)
            } else {
                wynik.append((char)(c - 1));
            }
        }

        // Uwaga: To bardzo prosty przykład "własny" dla celów edukacyjnych
        System.out.println("Opis: Szyfr zamieniający litery parami (sąsiedzi ASCII).");
        System.out.println("Tekst: " + tekst);
        System.out.println("Szyfr własny: " + wynik);
        // Deszyfracja jest identyczna jak szyfrowanie w tym algorytmie (inwolucja)
    }

    // --- Metoda pomocnicza: Przesuwanie znaku (Modulo 26) ---
    static char przesun(char c, int k) {
        if (c < 'A' || c > 'Z') return c; // Ignorujemy nie-litery
        int baza = c - 'A';
        int nowe = (baza + k) % 26;
        if (nowe < 0) nowe += 26; // Obsługa ujemnych wyników przy deszyfracji
        return (char) ('A' + nowe);
    }
}
