package bootcamp.week3.quiz6;

public class Quiz {
    public static void main(String[] args) {

//        petlazad1();
//        petlazad2();

        quiz1();
        quiz2();



    }

    private static void quiz2() {
        int result = 0;
        LABEL:
        for (int i = 10; i <= 23; i++) {
            System.out.println("1. i: " + i + ", res: " + result);
            for (int j = 1; true; j++) {
                System.out.println("2. i: " + i + ", j: " + j + ", res: " + result);
                if (i * j % 3 == 0) {
                    System.out.println("3. i: " + i + ", j: " + j + ", res: " + result);
                    continue LABEL;
                }
                System.out.println("4. i: " + i + ", j: " + j + ", res: " + result);
                if (i == 14) {
                    System.out.println("5. i: " + i + ", j: " + j + ", res: " + result);
                    break;
                }
                System.out.println("6. i: " + i + ", j: " + j + ", res: " + result);
                result++;
                System.out.println("7. i: " + i + ", j: " + j + ", res: " + result);
            }
        }
        System.out.println(result);

    }

    private static void quiz1() {
        boolean loopTheLoop = true;
        int i = 0, result = 10;
        do {
            System.out.println("1. i: " + i + ", res: " + result + ", loopTheLoop: " + loopTheLoop);
            ++i;
            System.out.println("2. i: " + i + ", res: " + result + ", loopTheLoop: " + loopTheLoop);
            if (i == 8) {
                System.out.println("3. i: " + i + ", res: " + result + ", loopTheLoop: " + loopTheLoop);
                loopTheLoop = false;
            }
            System.out.println("4. i: " + i + ", res: " + result + ", loopTheLoop: " + loopTheLoop);
            result -= 2;
            System.out.println("5. i: " + i + ", res: " + result + ", loopTheLoop: " + loopTheLoop);
        } while (loopTheLoop);
        System.out.println(result);
    }

    private static void quiz() {
        int result = 0;
        do {

            System.out.print(result++ + " ");
        } while (result <= 10);
    }


    private static void petlazad1() {
        int result = 0;
        for(int i = 10; i > 0;i-- ) {
            System.out.println("i before: " + i);
            i--;
            System.out.println("i after: " + i);
            result++;
        }
        System.out.println(result);
    }

    private static void petlazad2() {
        int result = 0;
        int i = 1, j = 10;
        while (i < j) {
            ++j;
            i += 3;
            result += j - 2;
        }
        System.out.println(result);
    }



}
