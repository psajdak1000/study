package bootcamp.week2.operatorsPrecedence;

public class OperatorsPrecedence {

    public static void main(String[] args) {
        System.out.println("--- Rozpoczynamy obliczenia ---");

        // Struktura idealnie jak w Twoim przykładzie:
        // someMethod( sm1() + sm2() * sm3( sm4(), sm5() ) )
        wypiszRachunek( pobierzKosztyWysylki() + pobierzLiczbeSztuk() * obliczCeneZaSztuke(pobierzCeneKatalogowa(), pobierzRabat()) );
    }

    // someMethod -> Wypisuje ostateczny wynik
    private static void wypiszRachunek(int kwotaCalkowita) {
        System.out.println("[KROK 6] Podsumowanie: Do zapłaty " + kwotaCalkowita + " PLN");
    }

    // sm1 -> Pobiera stałą opłatę
    private static int pobierzKosztyWysylki() {
        System.out.println("[KROK 1] Pobieram koszty wysyłki (15 PLN)");
        return 15;
    }

    // sm2 -> Pobiera ilość
    private static int pobierzLiczbeSztuk() {
        System.out.println("[KROK 2] Pobieram liczbę sztuk (3 sztuki)");
        return 3;
    }

    // sm3 -> Wykonuje działanie na dwóch innych wartościach
    private static int obliczCeneZaSztuke(int cenaKatalogowa, int rabat) {
        System.out.println("[KROK 5] Obliczam ostateczną cenę za sztukę (" + cenaKatalogowa + " - " + rabat + " = " + (cenaKatalogowa - rabat) + " PLN)");
        return cenaKatalogowa - rabat;
    }

    // sm4 -> Argument 1 dla sm3
    private static int pobierzCeneKatalogowa() {
        System.out.println("[KROK 3] Pobieram cenę z katalogu (100 PLN)");
        return 100;
    }

    // sm5 -> Argument 2 dla sm3
    private static int pobierzRabat() {
        System.out.println("[KROK 4] Pobieram zniżkę klienta (20 PLN)");
        return 20;
    }
}
