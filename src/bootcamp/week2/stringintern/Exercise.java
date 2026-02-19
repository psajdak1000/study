package bootcamp.week2.stringintern;

public class Exercise {
    String Private;
    static Integer Public = 10;

    public static void main(String[] args) {
//        zad1();
//        zad2();
//        stringbuilder();
//        inlinePlus();
//        chainConcat();
//        //badLoop();
//        goodLoop();
//        replace();
//    quiz();
        runVowelsExercise();

    }

    private static void runVowelsExercise() {
        // 1. Przygotowujemy dane wejściowe
        String originalText = "Oto zdanie, w którym zamieniam samogłoski na liczby zmiennoprzecinkowe";
        double numberToInsert = 123.2;

        // 2. Przekazujemy dane do naszej metody-narzędzia i odbieramy wynik
        String result = replaceVowels(originalText, numberToInsert);

        // 3. Wyświetlamy wyniki
        System.out.println("Oryginał: " + originalText);
        System.out.println("Wynik:    " + result);
    }

    private static String replaceVowels(String text, double number) {
        // String.valueOf(number) zamienia 123.2 na tekst "123.2"
        String replacement = String.valueOf(number);

        // Zwracamy podmieniony tekst używając Regexa
        return text.replaceAll("[aąeęioóuyAĄEĘIOÓUY]", replacement);
    }


    private static void quiz() {
        double points = 14.4;
        String nextPoints = "16.2";
        System.out.print(points + 1);
        System.out.print(" ");
        System.out.print(nextPoints + 1);
    }

    private static void stringbuilder() {
        Public.toString().length();
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        String result = sb.toString();
        System.out.println(result);
    }

    private static void zad2() {
        String a = "zajavka";
        String b = "zajavka";
        String c = new String("zajavka");

        String d = a + b + c;
        String e = a.concat(b).concat(c);

        System.out.println("a + b + c: " + d);
        System.out.println("a.concat(b).concat(c): " + e);
    }

    private static void zad1() {
        String a = "zajavka";
        int length = a.length();
        System.out.println("Długość stringa: " + length);
    }

    public static void inlinePlus() {
        String imie = "Jan";
        String nazwisko = "Kowalski";
        int wiek = 30;

        // Kompilator wie, że łączysz 4 elementy. Zrobi to za jednym zamachem.
        // Plus jest super, bo pozwala łatwo łączyć Stringi z liczbami (int).
        String wizytowka = imie + " " + nazwisko + " ma " + wiek + " lat.";

        System.out.println(wizytowka);
    }

    public static void chainConcat() {
        String a = "Java";
        String b = " jest ";
        String c = "super";

        // Krok 1: a.concat(b) -> tworzy nowy String "Java jest " w pamięci.
        // Krok 2: "Java jest ".concat(c) -> tworzy kolejny nowy String "Java jest super".
        // Obiekt z kroku 1 staje się niepotrzebnym śmieciem do usunięcia.
        String wynik = a.concat(b).concat(c);

        System.out.println(wynik);
    }

    public static void badLoop() {
        String result = "";

        // Pętla wykonuje się 10 000 razy.
        for (int i = 0; i < 10000; i++) {
            // FATALNIE: W każdym obrocie pętli Java tworzy nowy obiekt String!
            // Stary obiekt 'result' idzie do kosza. Produkujemy 10 000 śmieci w pamięci.
            result = result + i;
        }

        System.out.println("Gotowe, ale zajęło to mnóstwo czasu i pamięci.");
    }

    public static void goodLoop() {
        // Tworzymy JEDEN bufor (poczekalnię na znaki).
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            // SUPER: Po prostu dorzucamy znaki do istniejącego pudełka.
            // Żadne nowe obiekty (śmieci) nie są tworzone w każdym obrocie!
            sb.append(i);
        }

        // Kiedy skończyliśmy dodawać w pętli, RAZ zamieniamy bufor na gotowy String.
        String ostatecznyWynik = sb.toString();

        System.out.println("Gotowe błyskawicznie i bez obciążania pamięci.");
    }

    public static void replace() {
        String name = "Hej Javowcy!";
// wyświetli Stringa pierwotnego, ponieważ nie ma w Stringu name tekstu "hej"
// (wielkość liter ma znaczenie). Metoda replace zwraca za każdym razem nowego Stringa,
// nawet jeśli jest taki sam jak ten na którym pracuje.
        System.out.println(name.replace("Hej", "trzecześć"));
// tutaj zadziała i do zmiennej a zostanie przypisany nowy String "Cześć Javowcy!"
        String a = name.replace("Hej", "Cześć");
        System.out.println(name); // wyświetli Hej Javowcy!
        System.out.println(a); // wyświetli Cześć Javowcy!


    }


}



