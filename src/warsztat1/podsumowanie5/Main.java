package warsztat1.podsumowanie5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sock<Runnable<String>> sock1 = new Sock<>();
        //25minuta
        sock1.put(new Run());
        System.out.println(sock1.getItem());
    }

}
