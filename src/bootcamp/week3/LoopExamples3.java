package bootcamp.week3;

public class LoopExamples3 {
    public static void main(String[] args) {
        first_loop:
        for (int i = 0; i < 4; i++) {
            System.out.println("first loop i = " + i);
            second_loop:
            for (int j = 0; j <4; j++) {
                System.out.println("second loop j = " + j);
                third_loop:
                for (int k = 0; k < 4; k++) {
                    System.out.println("third loop k = " + k);
                    if (k == 2) {
                        System.out.println("skipping k = " + k);
                        continue first_loop;
                    }
                    if (k == 3) {
                        System.out.println("breaking k = " + k);
                        break second_loop;
                    }
                    System.out.println("i = " + i + " j = " + j + " k = " + k);
                }
            }
        }
    }
}
