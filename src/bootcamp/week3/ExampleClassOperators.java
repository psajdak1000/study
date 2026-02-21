package bootcamp.week3;

public class ExampleClassOperators {
    public static void main(String[] args) {
        int a = 1;
        someValue(a++);
        someValue(a);
    }

    private static void someValue(int someValue) {
        boolean f = someValue > 1;
        f &= true ;
        System.out.println("someValue:" + someValue + " f: someValue > 1 & true: " + f);
    }
}
