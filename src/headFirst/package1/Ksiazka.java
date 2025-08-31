package headFirst.package1;

public class Ksiazka {

    String tytul;
    String autor;

    public static void main(String[] args) {
        Ksiazka[] mojeKsiazki = new Ksiazka[3];

        int i = 0;
        for (int j = 0; j < mojeKsiazki.length ; j++) {
            mojeKsiazki[j] = new Ksiazka();

        }

        int x= 0;
        mojeKsiazki[0].tytul = "Ksiazka 1" ;
        mojeKsiazki[1].tytul = "Ksiazka 2" ;
        mojeKsiazki[2].tytul = "Ksiazka 3" ;
        mojeKsiazki[0].autor = "Autor 1" ;
        mojeKsiazki[1].autor = "Autor 2" ;
        mojeKsiazki[2].autor = "Autor 3" ;

        while (x<mojeKsiazki.length) {

            System.out.println(mojeKsiazki[x].tytul);
            System.out.println(mojeKsiazki[x].autor);
            x++;
        }
    }

}
