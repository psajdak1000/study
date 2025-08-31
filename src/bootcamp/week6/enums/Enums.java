package bootcamp.week6.enums;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Enums {
    public static void main(String[] args) {
        Volkswagen volkswagen = getVolkswagen();
        Volkswagen volkswagen1 = getVolkswagen();


        if (Volkswagen.ARTEON.equals(Volkswagen.GOLF)) {
            System.out.println("my car is arteon");
        } else {
            System.out.println("my car is not arteon");
        }

        switch (volkswagen) {
            case ARTEON:
                System.out.println("my car is arteon");
                break;
            case TIGUAN:
                System.out.println("my car is tiguan");
                break;
            case TOUAREG:
                System.out.println("my car is touareg");
                break;
            default:
                System.out.println("my car is not arteon");
                break;

        }

        System.out.println(volkswagen.getName());
        System.out.println(volkswagen.PASSAT.getName());
        volkswagen1.setName("whatever");
        System.out.println(volkswagen.getName());

        Volkswagen[] volkswagen2 = Volkswagen.values();
        System.out.println(" ostatni:  " + volkswagen2.length);
        System.out.println(Arrays.toString(volkswagen2));

        System.out.println(Volkswagen.GOLF.doSomething());

        String returned1 = "ARTEON";
        String returned2 = "GOLF";

        Volkswagen v1 = Volkswagen.valueOf(returned1);
        Volkswagen v2 = Volkswagen.valueOf(returned2);

        System.out.println(v1.equals(v2));
        System.out.println(v1 == v2);

        String name = "Tiguan";

        List<Volkswagen> list = Volkswagen.ofName(name);
        System.out.println(list + " lista");


    }

    private static Volkswagen getVolkswagen() {
        return Volkswagen.GOLF;
    }
}
