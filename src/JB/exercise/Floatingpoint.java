package JB.exercise;

public class Floatingpoint {
    public static void main(String[] args) {
        int ocena1 = 3;
        int ocena2 = 4;
        int ocena3 = 3;
        float ocena4 = 5.14f;
        double ocena5 = 5.14423424234111111111111111111111;
        double vat = 0.23;
        float priceBeforeTax = 99.99f;
        char l = '\u0061';

        System.out.println( (char) 9829);
        System.out.print(' ');

        double afterTax = priceBeforeTax * ( 1 + vat );
        System.out.println("Zaokraglona cenna po naliczeniu podatku wynosi: " + (int)afterTax);

        double srednia = (ocena1 + ocena2 + ocena3) / 3.0;

        int sredniaZaokraglona = (int)(srednia);

        System.out.println("Średnia ocen z przecinkiem: "
                + srednia + " srednia zaokrąglona: " + sredniaZaokraglona);






    }
}
