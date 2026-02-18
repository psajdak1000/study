package bootcamp.week2.stringintern;

public class ExampleStringMethods {
    public static void main(String[] args) {
        //42minuta lekcja #9
        String a = "zajavka";
        System.out.println("original: " + a);
        String replace = a.replace("a", "u");
        System.out.println("after replace: " + replace);
        String b = "zajavka                 ";
        System.out.println("original: " + b + "length: " + b.length());
        String trim = b.trim();
        System.out.println("after trim: " + trim + " length: " + trim.length());

        System.out.println(" place holder example: " + String.format("Hello %s, you are %d years old.", "Alice", 30));
        System.out.printf(" %s %n", a);
        System.out.printf(" place holder %s %n", trim);

        printNumber(10);
        System.out.println("add method result: " + add(10, 1));

    }

    private static void printNumber(int number) {
        System.out.println(number);
        System.out.println("number + 10: " + (number + 10));
    }

    private static int add(int a, int b) {
        System.out.println("adding " + a + " and " + b);
        return a + b;
    }
}
