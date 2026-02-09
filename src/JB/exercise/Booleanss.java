package JB.exercise;

public class Booleanss {
    public static void main(String[] args) {
        boolean czyPadaDeszcz = false;
        boolean czyMamWolnyCzas = true;
        boolean czyWyjscNaSpacer = !czyPadaDeszcz && czyMamWolnyCzas;
        System.out.println(czyWyjscNaSpacer);
// false (pada deszcz, więc nie wychodzę)

        System.out.println("Losowa liczba: " + (int) (Math.random() * 100));
        System.out.println("Losowa liczba: " + (int) (Math.random() * 100));
        System.out.println("Losowa liczba z zakresu 50-150: " + (int) (Math.random() * 101 + 50));
        System.out.println("Losowa liczba zmiennoprzecinkowa: " + Math.random());
        System.out.println("" + ' ' + true);
    }
}
