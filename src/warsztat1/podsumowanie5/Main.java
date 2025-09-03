package warsztat1.podsumowanie5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sock<List<String>> sock1 = new Sock<>();
        //21minuta
        System.out.println(sock1.put(List.of("arms","bionicle","cash","dinosaur")));;
        System.out.println(sock1.getItem());
    }

}
