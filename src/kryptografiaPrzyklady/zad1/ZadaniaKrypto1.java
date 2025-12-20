package kryptografiaPrzyklady.zad1;

import java.awt.Point;


public class ZadaniaKrypto1 {

    public static void main(String[] args) {


        System.out.println("=== ZADANIE 1 i 2: Szyfr Cezara / ROT-n ===");
        // Zadanie 1: Program generujący szyfr Cezara
        // Zadanie 2: Ulepszenie do ROT-n (dowolne przesunięcie)
        String tekstJawny = "ALA MA KOTA";
        int przesuniecie = 3; // Klasyczny Cezar

        String zaszyfrowane = cezaraSzyfruj(tekstJawny, przesuniecie);
        System.out.println("Tekst: " + tekstJawny);
        System.out.println("Szyfr (ROT-" + przesuniecie + "): " + zaszyfrowane);

        // Funkcja odszyfrowująca
        String odszyfrowane = cezaraDeszyfruj(zaszyfrowane, przesuniecie);
        System.out.println("Odszyfrowane: " + odszyfrowane);

        System.out.println("\n=== ZADANIE 3: Deszyfrowanie podanych wiadomości ===");
        // Zadanie 3: Deszyfruj podane wiadomości
        String[] kryptogramy = {"ZLDGRPRVF", "GR", "RGFCBWDQLD"};

        System.out.println("Próba łamania (zakładamy przesunięcie Cezara n=3):");
        for (String krypto : kryptogramy) {
            // Szyfr Cezara to przesunięcie o 3, więc deszyfracja to -3 (lub przesunięcie o 23 w prawo)
            System.out.println(krypto + " -> " + cezaraDeszyfruj(krypto, 3));
        }

        System.out.println("\n=== ZADANIE 4: Szyfr Komórkowy ===");
        // Zadanie 4: Szyfrator/deszyfrator komórkowy
        String doKomorki = "DZIEN";
        String smsKod = komorkowySzyfruj(doKomorki);
        System.out.println("Tekst: " + doKomorki);
        System.out.println("Kod: " + smsKod);
        System.out.println("Dekodowanie: " + komorkowyDeszyfruj(smsKod));

        System.out.println("\n=== ZADANIE 5: Szyfr Playfaira ===");
        // Zadanie 5: Szyfrator/deszyfrator Playfaira
        String klucz = "MONARCHY";
        String wiadomoscPlayfair = "INSTRUMENT";

        PlayfairCipher playfair = new PlayfairCipher(klucz);
        String playfairSzyfr = playfair.encrypt(wiadomoscPlayfair);

        System.out.println("Klucz: " + klucz);
        System.out.println("Tekst: " + wiadomoscPlayfair);
        System.out.println("Zaszyfrowane: " + playfairSzyfr);
        System.out.println("Odszyfrowane: " + playfair.decrypt(playfairSzyfr));
    }

    // --- METODY DO ZADANIA 1 i 2 (CEZAR / ROT-n) ---

    public static String cezaraSzyfruj(String tekst, int n) {
        StringBuilder wynik = new StringBuilder();
        n = n % 26; // Zabezpieczenie dla n > 26

        for (char znak : tekst.toCharArray()) {
            if (Character.isLetter(znak)) {
                char baza = Character.isUpperCase(znak) ? 'A' : 'a';
                // Wzór: (znak + n) modulo 26
                char z = (char) ((znak - baza + n) % 26 + baza);
                wynik.append(z);
            } else {
                wynik.append(znak); // Znaki niebędące literami przepisujemy
            }
        }
        return wynik.toString();
    }

    public static String cezaraDeszyfruj(String tekst, int n) {
        // Deszyfracja to szyfrowanie z przesunięciem (26 - n)
        return cezaraSzyfruj(tekst, 26 - (n % 26));
    }

    // --- METODY DO ZADANIA 4 (SZYFR KOMÓRKOWY) ---

    // Tablica mapowania: indeks to cyfra (0-9), wartość to znaki
    private static final String[] KLAWIATURA = {
            " ",    // 0
            "",     // 1 (zazwyczaj znaki specjalne, tu pomijamy dla uproszczenia)
            "ABC",  // 2
            "DEF",  // 3
            "GHI",  // 4
            "JKL",  // 5
            "MNO",  // 6
            "PQRS", // 7
            "TUV",  // 8
            "WXYZ"  // 9
    };

    public static String komorkowySzyfruj(String tekst) {
        StringBuilder wynik = new StringBuilder();
        tekst = tekst.toUpperCase();

        for (char c : tekst.toCharArray()) {
            if (c == ' ') {
                wynik.append("0 ");
                continue;
            }
            boolean znaleziono = false;
            for (int i = 2; i <= 9; i++) {
                String klawisz = KLAWIATURA[i];
                int poz = klawisz.indexOf(c);
                if (poz != -1) {
                    // Jeśli litera to 'B' (indeks 1 na klawiszu 2), wciskamy 2 dwa razy -> "22"
                    for (int k = 0; k <= poz; k++) {
                        wynik.append(i);
                    }
                    wynik.append(" "); // Separator odstępu między literami
                    znaleziono = true;
                    break;
                }
            }
            // Obsługa cyfr zgodnie z : "cyfra kodowana ostatnim znakiem"
            // Interpretacja: Aby wpisać "2", wciskamy klawisz 2 cztery razy (A,B,C,2)
            if (!znaleziono && Character.isDigit(c)) {
                int cyfra = c - '0';
                if (cyfra >= 2 && cyfra <= 9) {
                    int dlugoscKlawisza = KLAWIATURA[cyfra].length();
                    for(int k=0; k<=dlugoscKlawisza; k++) wynik.append(cyfra); // +1 powtórzenie dla cyfry
                    wynik.append(" ");
                }
            }
        }
        return wynik.toString().trim();
    }

    public static String komorkowyDeszyfruj(String kod) {
        StringBuilder wynik = new StringBuilder();
        String[] sekwencje = kod.split(" ");

        for (String seq : sekwencje) {
            if (seq.isEmpty()) continue;
            if (seq.equals("0")) {
                wynik.append(" ");
                continue;
            }

            int cyfra = seq.charAt(0) - '0';
            int iloscKlikniec = seq.length();

            if (cyfra >= 2 && cyfra <= 9) {
                String klawisz = KLAWIATURA[cyfra];
                // Jeśli ilość kliknięć mieści się w literach
                if (iloscKlikniec <= klawisz.length()) {
                    wynik.append(klawisz.charAt(iloscKlikniec - 1));
                } else {
                    // Jeśli kliknięto więcej razy niż jest liter -> to cyfra (wg treści zadania)
                    wynik.append(cyfra);
                }
            }
        }
        return wynik.toString();
    }

    // --- KLASA POMOCNICZA DO ZADANIA 5 (PLAYFAIR) ---
    static class PlayfairCipher {
        private char[][] table;

        public PlayfairCipher(String key) {
            table = generateTable(key);
        }

        private char[][] generateTable(String key) {
            char[][] table = new char[5][5];
            String keyString = key.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I");
            StringBuilder distinctKey = new StringBuilder();

            // Usuwanie duplikatów z klucza
            for (char c : keyString.toCharArray()) {
                if (distinctKey.indexOf(String.valueOf(c)) == -1) {
                    distinctKey.append(c);
                }
            }
            // Dopełnianie alfabetem (bez J)
            for (char c = 'A'; c <= 'Z'; c++) {
                if (c == 'J') continue;
                if (distinctKey.indexOf(String.valueOf(c)) == -1) {
                    distinctKey.append(c);
                }
            }

            // Wypełnianie macierzy 5x5
            int k = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    table[i][j] = distinctKey.charAt(k++);
                }
            }
            return table;
        }

        public String encrypt(String text) {
            text = prepareText(text);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < text.length(); i += 2) {
                char a = text.charAt(i);
                char b = text.charAt(i + 1);
                Point p1 = getPoint(a);
                Point p2 = getPoint(b);

                if (p1.x == p2.x) { // Ten sam wiersz
                    result.append(table[p1.x][(p1.y + 1) % 5]);
                    result.append(table[p2.x][(p2.y + 1) % 5]);
                } else if (p1.y == p2.y) { // Ta sama kolumna
                    result.append(table[(p1.x + 1) % 5][p1.y]);
                    result.append(table[(p2.x + 1) % 5][p2.y]);
                } else { // Prostokąt
                    result.append(table[p1.x][p2.y]);
                    result.append(table[p2.x][p1.y]);
                }
            }
            return result.toString();
        }

        public String decrypt(String text) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < text.length(); i += 2) {
                char a = text.charAt(i);
                char b = text.charAt(i + 1);
                Point p1 = getPoint(a);
                Point p2 = getPoint(b);

                if (p1.x == p2.x) {
                    result.append(table[p1.x][(p1.y + 4) % 5]); // +4 to to samo co -1 w modulo 5
                    result.append(table[p2.x][(p2.y + 4) % 5]);
                } else if (p1.y == p2.y) {
                    result.append(table[(p1.x + 4) % 5][p1.y]);
                    result.append(table[(p2.x + 4) % 5][p2.y]);
                } else {
                    result.append(table[p1.x][p2.y]);
                    result.append(table[p2.x][p1.y]);
                }
            }
            return result.toString();
        }

        private String prepareText(String text) {
            text = text.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I");
            StringBuilder sb = new StringBuilder(text);
            for (int i = 0; i < sb.length() - 1; i += 2) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.insert(i + 1, 'X');
                }
            }
            if (sb.length() % 2 != 0) {
                sb.append('X');
            }
            return sb.toString();
        }

        private Point getPoint(char c) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (table[i][j] == c) return new Point(i, j);
                }
            }
            return null;
        }
    }
}