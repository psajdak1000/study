package bootcamp.week4;

public class TypePromotion {

    public static void main(String[] args) {
        TypePromotion methodsOverloading = new TypePromotion();
        byte b = 12;
        short s = 1049;
        int i = 123235;
        long l = 2349823049L;
        float f = 124.3f;
        double d = 123.2;

        methodsOverloading.overloadedMethod(b);
        methodsOverloading.overloadedMethod(s);
        methodsOverloading.overloadedMethod(i);
        methodsOverloading.overloadedMethod(l);
        methodsOverloading.overloadedMethod(f);
        methodsOverloading.overloadedMethod(d);
    }

    private void overloadedMethod(byte arg1){
        System.out.println("byte arg1: " + arg1);
    }
    private void overloadedMethod(short arg1){
        System.out.println("short arg1: " + arg1);
    }
    private void overloadedMethod(int arg1){
        System.out.println("int arg1: " + arg1);
    }
    private void overloadedMethod(long arg1){
        System.out.println("long arg1: " + arg1);
    }
    private void overloadedMethod(double arg1){
        System.out.println("double arg1: " + arg1);
    }
    private void overloadedMethod(float arg1){
        System.out.println("float arg1: " + arg1);
    }
}
