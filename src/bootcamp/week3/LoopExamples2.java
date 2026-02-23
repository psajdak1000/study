package bootcamp.week3;

public class LoopExamples2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("only i = " + i);
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    System.out.println("skipping j = " + j);
                    continue;
                }
                if (j == 4) {
                    System.out.println("breaking j = " + j);
                    break;
                }
                System.out.println("both i and j. i = " + i + " j = " + j);
            }

        }
    }
}
