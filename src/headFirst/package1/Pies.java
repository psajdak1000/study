package headFirst.package1;

public class Pies {

    String imie;

    public static void main(String[] args) {
        Pies pies1 = new Pies();
        pies1.szczekaj();
        pies1.imie = "Azor";

        Pies[] mojePsy = new Pies[3];

        mojePsy[0] = new Pies();
        mojePsy[1] = new Pies();
        mojePsy[2] = pies1;

        mojePsy[0].imie = "Szarik";
        mojePsy[1].imie = "Cywil";


        System.out.println("the last dog has a name " + mojePsy[mojePsy.length - 1].imie);

        int x = 0;
        while (x < mojePsy.length) {

            mojePsy[x].szczekaj();
            x = x + 1;

        }
    }

    public void szczekaj() {
        System.out.println(imie + " szczekaj" );
    }

    
}
