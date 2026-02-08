package kryptografiaPrzyklady.zad3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ZadaniaKrypto3 {

    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("ZADANIE 1: Generator LFSR i Szyfr Strumieniowy");
        zadanie1_LFSR();

        System.out.println("\n=========================================");
        System.out.println("ZADANIE 2: Funkcje Skrótu (Hash)");
        zadanie2_Hash();

        System.out.println("\n=========================================");
        System.out.println("ZADANIE 3: Symulacja RSA");
        zadanie3_RSA();

        System.out.println("\n=========================================");
        System.out.println("ZADANIE 4: Protokół Diffie-Hellmana");
        zadanie4_DiffieHellman();
    }

    // -----------------------------------------------------------------
    // ZADANIE 1:
    // -----------------------------------------------------------------
    public static void zadanie1_LFSR() {

        String stanRejestru = "10101100101";
        int[] tapy = {0, 3, 5};             //  - indeksy bitów do XOR (liczymy od lewej 0..N)
        String wiadomosc = "KRYPTO";

        System.out.println("Stan początkowy: " + stanRejestru);
        System.out.println("Wiadomość: " + wiadomosc);

        // 1. Zamiana wiadomości na bity
        StringBuilder bityWiadomosci = new StringBuilder();
        for (char c : wiadomosc.toCharArray()) {
            // Formatujemy do 8 bitów (np. 01000001)
            bityWiadomosci.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));
        }
        String tekstBity = bityWiadomosci.toString();
        int dlugoscStrumienia = tekstBity.length();

        // 2. Generowanie klucza strumieniowego
        String kluczStrumieniowy = generujLFSR(stanRejestru, tapy, dlugoscStrumienia);
        System.out.println("Wygenerowany klucz (LFSR): " + kluczStrumieniowy);

        // 3. Szyfrowanie (XOR tekstu z kluczem)
        String kryptogram = xorString(tekstBity, kluczStrumieniowy);
        System.out.println("Zaszyfrowane (binarnie):   " + kryptogram);

        // 4. Deszyfracja
        // Ponowne użycie klucza (LFSR jest deterministyczny)
        String odszyfrowaneBity = xorString(kryptogram, kluczStrumieniowy);

        // Konwersja bitów na tekst
        StringBuilder odszyfrowanyTekst = new StringBuilder();
        for (int i = 0; i < odszyfrowaneBity.length(); i += 8) {
            String bajt = odszyfrowaneBity.substring(i, i + 8);
            odszyfrowanyTekst.append((char) Integer.parseInt(bajt, 2));
        }
        System.out.println("Odszyfrowana wiadomość:    " + odszyfrowanyTekst);
    }

    // Funkcja pomocnicza generująca strumień bitów z LFSR
    private static String generujLFSR(String rejestr, int[] tapy, int dlugosc) {
        StringBuilder strumien = new StringBuilder();
        // Pracujemy na tablicy znaków dla łatwości zmian
        StringBuilder stan = new StringBuilder(rejestr);

        System.out.println("--- Kroki LFSR (pierwsze 5) ---");

        for (int i = 0; i < dlugosc; i++) {
            // a. Policz bit sprzężenia (XOR z tapów)
            int nowyBit = 0;
            for (int tapIndex : tapy) {
                // Pobieramy bit z pozycji 'tapIndex'. '0' -> 0, '1' -> 1
                int bitWartosc = stan.charAt(tapIndex) - '0';
                nowyBit ^= bitWartosc;
            }

            // Dodajemy wyliczony bit do strumienia wyjściowego (to jest nasz klucz)
            // Uwaga: w typowym LFSR bitem wyjściowym jest ten, który "wypada" z rejestru,
            // ale tutaj dla uproszczenia użyjemy nowego bitu jako elementu strumienia.
            strumien.append(nowyBit);

            // b. Przesuń rejestr  i c. Dodaj nowy bit na początek
            stan.deleteCharAt(stan.length() - 1); // Usuwamy ostatni
            stan.insert(0, nowyBit);              // Wstawiamy nowy na początek

            if (i < 5) System.out.println("Krok " + (i+1) + ": " + stan + " | Bit out: " + nowyBit);
        }
        return strumien.toString();
    }

    private static String xorString(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i) ^ s2.charAt(i));
        }
        return sb.toString();
    }

    // -----------------------------------------------------------------
    // ZADANIE 2: Prosty Hash
    // -----------------------------------------------------------------
    public static void zadanie2_Hash() {
        String tekst1 = "haslo123";
        String tekst2 = "haslo124"; // Do testu kolizji/różnic

        System.out.println("Tekst 1: " + tekst1);
        System.out.println("Tekst 2: " + tekst2);

        System.out.println("--- Metoda 1: Suma ASCII  ---");
        System.out.println("Hash(" + tekst1 + ") = " + hashSumaASCII(tekst1));
        System.out.println("Hash(" + tekst2 + ") = " + hashSumaASCII(tekst2));

        System.out.println("--- Metoda 2: XOR  ---");
        System.out.println("Hash(" + tekst1 + ") = " + hashXOR(tekst1));
        System.out.println("Hash(" + tekst2 + ") = " + hashXOR(tekst2));

        System.out.println("--- Metoda 3: Modulo liczba pierwsza (Wielomianowy)  ---");
        System.out.println("Hash(" + tekst1 + ") = " + hashModulo(tekst1));
        System.out.println("Hash(" + tekst2 + ") = " + hashModulo(tekst2));

        //  Propozycja rozbudowania: Metoda Modulo + Sól (Salt)
        System.out.println("--- Metoda 4 (Rozbudowana): Modulo z solą ---");
        System.out.println("Hash(" + tekst1 + ") = " + hashModuloZSola(tekst1, 12345));

        System.out.println("Wniosek: Suma ASCII i XOR dają często kolizje dla anagramów. Modulo jest lepsze.");
    }

    static int hashSumaASCII(String s) {
        int suma = 0;
        for (char c : s.toCharArray()) suma += c;
        return suma;
    }

    static int hashXOR(String s) {
        int h = 0;
        for (char c : s.toCharArray()) h ^= c;
        return h;
    }

    static long hashModulo(String s) {
        long h = 0;
        long p = 9973;
        for (char c : s.toCharArray()) {
            // Wzór: h = (h * 31 + c) mod p
            h = (h * 31 + c) % p;
        }
        return h;
    }

    static long hashModuloZSola(String s, int salt) {
        return hashModulo(s + salt); // Najprostsze dodanie soli
    }

    // -----------------------------------------------------------------
    // ZADANIE 3: Proste RSA
    // -----------------------------------------------------------------
    public static void zadanie3_RSA() {
        // 1. Wylosuj małe liczby pierwsze p i q (10-300)
        int p = generujLiczbePierwsza(10, 300);
        int q = generujLiczbePierwsza(10, 300);
        while (p == q) q = generujLiczbePierwsza(10, 300);

        System.out.println("Wylosowane liczby: p=" + p + ", q=" + q);

        // 2. Obliczenia n i phi
        BigInteger n = BigInteger.valueOf(p).multiply(BigInteger.valueOf(q));
        BigInteger phi = BigInteger.valueOf(p - 1).multiply(BigInteger.valueOf(q - 1));
        System.out.println("Moduł n=" + n + ", phi=" + phi);

        // 3. Wybierz e (1 < e < phi, gcd(e, phi) == 1)
        BigInteger e = BigInteger.valueOf(3);
        while (e.compareTo(phi) < 0) {
            if (e.gcd(phi).equals(BigInteger.ONE)) break;
            e = e.add(BigInteger.TWO); // Szukamy kolejnych nieparzystych
        }
        System.out.println("Klucz publiczny e=" + e);

        // 4. Oblicz klucz prywatny d
        // d = e^(-1) mod phi
        BigInteger d = e.modInverse(phi);
        System.out.println("Klucz prywatny d=" + d);

        // 5. Zaszyfruj wiadomość
        // Uwaga: Ponieważ liczby są małe, szyfrujemy znak po znaku (jako liczby ASCII),
        // aby upewnić się, że wartość znaku < n.
        String msg = "RSA";
        System.out.println("Wiadomość: " + msg);

        List<BigInteger> kryptogram = new ArrayList<>();
        for (char znak : msg.toCharArray()) {
            BigInteger m = BigInteger.valueOf(znak);
            // c = m^e mod n
            BigInteger c = m.modPow(e, n);
            kryptogram.add(c);
        }
        System.out.println("Szyfrogram (ciąg liczb): " + kryptogram);

        // 6. Odszyfruj wiadomość
        StringBuilder odszyfrowane = new StringBuilder();
        for (BigInteger c : kryptogram) {
            // m = c^d mod n
            BigInteger m = c.modPow(d, n);
            odszyfrowane.append((char) m.intValue());
        }
        System.out.println("Odszyfrowane: " + odszyfrowane);
    }

    private static int generujLiczbePierwsza(int min, int max) {
        while (true) {
            int num = rand.nextInt(max - min) + min;
            if (czyPierwsza(num)) return num;
        }
    }

    private static boolean czyPierwsza(int n) { //  test pierwszości
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // -----------------------------------------------------------------
    // ZADANIE 4: Symulacja Diffie-Hellmana
    // -----------------------------------------------------------------
    public static void zadanie4_DiffieHellman() {
        // Parametry publiczne (duże liczby dla bezpieczeństwa, tu mniejsze dla przykładu)
        BigInteger p = BigInteger.valueOf(23); // Moduł (liczba pierwsza)
        BigInteger g = BigInteger.valueOf(5);  // Podstawa (generator)

        System.out.println("Publiczne p=" + p + ", g=" + g);

        // 1. Sekrety użytkowników
        BigInteger a = BigInteger.valueOf(4); // Sekret Alicji
        BigInteger b = BigInteger.valueOf(3); // Sekret Boba
        System.out.println("Sekret Alicji a=" + a + ", Sekret Boba b=" + b);

        // 2. Wymiana wartości publicznych (A i B)
        // A = g^a mod p
        BigInteger A = g.modPow(a, p);
        // B = g^b mod p
        BigInteger B = g.modPow(b, p);
        System.out.println("Alicja wysyła A=" + A);
        System.out.println("Bob wysyła B=" + B);

        // 3. Obliczanie wspólnego klucza sesyjnego
        // Alicja liczy: s = B^a mod p
        BigInteger sa = B.modPow(a, p);
        // Bob liczy: s = A^b mod p
        BigInteger sb = A.modPow(b, p);

        System.out.println("Wspólny klucz Alicji: " + sa);
        System.out.println("Wspólny klucz Boba:   " + sb);

        if(sa.equals(sb)) {
            System.out.println("Sukces! Klucze są identyczne.");
        }
    }
}
