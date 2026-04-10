package bootcamp.week4;

public class VariableVisibilityScope {

    private String c;

    public static void main(String[] args) {
        VariableVisibilityScope example = new VariableVisibilityScope();
        example.method2("ABC");
    }

    private void method(String a, String c, String b){
        System.out.println(a);
        System.out.println(c);
        System.out.println(this.c);
        method2(a);
    }

    private void method2(String b){
        System.out.println(b);
        System.out.println(c);
    }
}
