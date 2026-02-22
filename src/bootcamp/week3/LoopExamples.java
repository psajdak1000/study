package bootcamp.week3;

public class LoopExamples {
    public static void main(String[] args) {
        int a = 1;
        int b = (int)(a * 3.3);
        String c = "Hello";
        String e = "Hello";
        boolean d = c != e;
        while (a < 10){
            System.out.println("a is: " + a);
            a++;
        }
        for (int i = 0; method(i); i++){
            System.out.println("i is: " + i);
        }
        System.out.println("end of loops");
    }

    private static boolean method(int i){
        System.out.println("checking: " + i);
        return i < 4 ;
    }
}
