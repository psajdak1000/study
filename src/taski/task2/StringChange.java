package taski.task2;

/*
Stwórz program, który przekształci (a następnie wyświetli na konsoli)
obiekt typu String o wartości  "   Become Java developer in 2025  "
w następujący sposób:

usunięte zostaną spacje z początku i końca

wszystkie litery zostaną zamienione na duże

ze Stringa usunięte zostanie pierwsze słowo
Wynik działania programu powinien być następujący:
"JAVA DEVELOPER IN 2025"
*/


public class StringChange {
    public static void main(String[] args) {
        String writing = "   Become Java developer in 2025  ";
        System.out.println(writing);
        String changedWriting = writing.trim().toUpperCase().substring(6);
        System.out.println(changedWriting);
    }
}
