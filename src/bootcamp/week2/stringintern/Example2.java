package bootcamp.week2.stringintern;

public class Example2 {
    public static void main(String[] args) {
        String a = "mam";
        String b = "mam";
        String c = new String("mam");


        String ab2 = a + b;
        String ab = "mam" + "mam";
        String ab3 = "mammam";
        String ab4 = (a+c).intern();

        System.out.println("ab.equals(ab2) = " + ab.equals(ab2));
        System.out.println("ab.equals(ab3) = " + ab.equals(ab3));

        System.out.println("ab == ab2 = " + (ab == ab2));
        System.out.println("ab == ab3 = " + (ab == ab3));
        System.out.println("ab2 == ab3 = " + (ab2 == ab3));
        System.out.println("ab == ab4 = " + (ab == ab4));
    }
}
