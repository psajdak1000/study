package bootcamp.week3;

public class LoopExamples4 {
    public static void main(String[] args) {
        someLoopingMethod();
    }

    private static void someLoopingMethod(){
        for (int i = 0; i < 3; i++) {
            System.out.println("i is: " + i);
            for (int j = 0; j <= i; j++) {
                System.out.println("j is: " + j);
                for (int k = 0; k < j; k++) {
                    System.out.println("k is: " + k);
                    if (j == 1) {
                        return;
                    }
                }
            }
        }
    }
}
