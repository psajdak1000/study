package bootcamp.week3;

public class LoopExamples4 {
    public static void main(String[] args) {
        String loopingMethod = someLoopingMethod();
        System.out.println("loopingMethod: " + loopingMethod);
    }

    private static String someLoopingMethod(){
        for (int i = 0; i < 3; i++) {
            System.out.println("i is: " + i);
            for (int j = 0; j <= i; j++) {
                System.out.println("j is: " + j);
                for (int k = 0; k < j; k++) {
                    System.out.println("k is: " + k);
                    if (j == 3) {
                        return " j is 3, return the string from method";
                    }
                }
            }
        }
        return "end of method";
    }
}
