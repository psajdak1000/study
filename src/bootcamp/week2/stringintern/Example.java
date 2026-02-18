package bootcamp.week2.stringintern;

public class Example {
    public static void main(String[] args) {
        Example example = new Example();
        example.someMethod(2);
            someMethod2(3);
    }

    void someMethod(int a){
        System.out.println("drukuj cos niestatycznie");
        System.out.println(a);
    }
    static void someMethod2(int a){
        System.out.println("drukuj cos statycznie");
        System.out.println(a);
    }
}
