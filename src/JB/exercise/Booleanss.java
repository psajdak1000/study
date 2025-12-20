package JB.exercise;

public class Booleanss {
    public static void main(String[] args) {
        boolean czyPadaDeszcz = false;
        boolean czyMamWolnyCzas = true;
        boolean czyWyjscNaSpacer = !czyPadaDeszcz && czyMamWolnyCzas;
        System.out.println(czyWyjscNaSpacer);
// false (pada deszcz, więc nie wychodzę)
        System.out.println("" +' ' + true);
    }
}
