package bootcamp.week3;

public class Conditionals {
    public static void main(String[] args) {
        int a = 1;
        int b = -2;
        int resultInt = a + b == 4 ? 10 : 20;
        String resultString = a + b > 0 ? "a + b > 0" : "a + b <= 0";
        String resultSomeMethod = a + b > 0 ? someMethod1() : someMethod2() + someMethod3(-3, -4);
        System.out.println("resultInt " + resultInt + " resultString: " + resultString + " resultSomeMethod: " + resultSomeMethod);
    }

    private static String someMethod1(){
        System.out.println("someMethod1");
        return "someMethod1 -> a + b > 0 ";
    }
    private static String someMethod2(){
        System.out.println("someMethod2");
        return "someMethod2 -> a + b <= 0 ";
    }
    private static String someMethod3(int a, int b){
        System.out.println("someMethod3 internally calls someMethod1 and someMethod2 and check if from method 3 is a + b > 0");
        return a + b > 0 ? someMethod1() : someMethod2();
        //return a + b > 0 ? (a-b > 5 ? "2" : "4"): (a-b > 5 ? "6" : "8");
    }
}
