package bootcamp.week3.quiz6;

public class Quiz {
    public static void main(String[] args) {

        petlazad1();
    }

    private static void petlazad1() {
        int result = 0;
        for(int i = 10; i > 0; ) {
            System.out.println("i before: " + i);
            i = i--;
            System.out.println("i after: " + i);
            result++;
        }
        System.out.println(result);
    }


}
