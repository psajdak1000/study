package bootcamp.week4;

public class MethodsOverloading {
    private void overloadedMethod(String... arg1){
        System.out.println("String arg1: " + arg1);
    }

    private void overloadedMethod(String arg3, String... arg4){
        System.out.println("String arg3 + String arg4: " + arg3 + arg4);
    }

    private void overloadedMethod(String arg1, int arg2){
        System.out.println("String arg1 + int arg2: " + arg1 + arg2);
    }
    private void overloadedMethod(int arg1, String arg2){
        System.out.println("String arg12: " + arg1 + arg2);
    }

    private void overloadedMethod(int arg1, int arg2){
        System.out.println("String arg3 + String arg4: " + arg1 + arg2);
    }

    private void overloadedMethod(float arg1, float arg2){
        System.out.println("String arg1 + int arg2: " + arg1 + arg2);
    }

    //invalid
    // method(sameType anotherName)
    // private int/String overloadedMethod(int arg1/int arg1, int arg2/int arg2){
    //return " " + arg1+ arg2/ return arg1+arg2;

}
