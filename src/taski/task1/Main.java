package taski.task1;


import java.util.Scanner;

/*
Task 1: Stwórz program, który zapyta użytkownika o dwie liczby całkowite,
a następnie wyświetli wyniki dodawania, odejmowania, mnożenia oraz dzielenia tych liczb.

Zakładając, że użytkownik podał liczby 10 i 5, wynik działania programu powinien być następujący:

Wynik dodawania to 15
Wynik odejmowania to 5
Wynik mnożenia to 50
Wynik dzielenia to 2
Najpierw wykona zadanie z podanymi wartościami przypisanymi do zmiennych int
Następnie zapoznaj się z klasą Scanner i stwórz instancję klasy Scanner tak
 aby można było wpisywać dowolną wartość w konsoli podczas działania programu
  - program odpytuje użytkownika o podanie liczb do wykonania obliczeń
Task 2: Stwórz program, który zapyta użytkownika o imię, nazwisko oraz wiek, a następnie wyświetli te dane w następującej formie:

Imie: Jan
Nazwisko: Kowalski
Wiek: 35
1.Najpierw wykona zadanie z podanymi wartościami przypisanymi do zmiennych int/String
2.Następnie zapoznaj się z klasą Scanner i stwórz instancję klasy Scanner tak aby można było wpisywać dowolną wartość/tekst w konsoli podczas działania programu - program odpytuje użytkownika o podanie imienia, nazwiska i wieku, a następnie wyświetli je w konsoli

 */
public class Main {
    public static void main(String[] args) {
        // Task 1 - Operacje na liczbach
        int a = 10;
        int b = 5;
        System.out.println("Wynik dodawania to " + (a + b));
        System.out.println("Wynik odejmowania to " + (a - b));
        System.out.println("Wynik mnożenia to " + (a * b));
        System.out.println("Wynik dzielenia to " + (a / b));

        // Task 1 - Z użyciem Scannera
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int x = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int y = scanner.nextInt();

        System.out.println("Wynik dodawania to " + (x + y));
        System.out.println("Wynik odejmowania to " + (x - y));
        System.out.println("Wynik mnożenia to " + (x * y));
        System.out.println("Wynik dzielenia to " + (x / y));

        // Task 2 - Dane użytkownika
        String imie = "Jan";
        String nazwisko = "Kowalski";
        int wiek = 35;
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);

        // Task 2 - Z użyciem Scannera
        scanner.nextLine(); // Czyszczenie bufora
        System.out.print("Podaj imię: ");
        String userImie = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        String userNazwisko = scanner.nextLine();
        System.out.print("Podaj wiek: ");
        int userWiek = scanner.nextInt();

        System.out.println("Imie: " + userImie);
        System.out.println("Nazwisko: " + userNazwisko);
        System.out.println("Wiek: " + userWiek);

        scanner.close();
    }


}
