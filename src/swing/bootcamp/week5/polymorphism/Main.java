package swing.bootcamp.week5.polymorphism;

public class Main {

    public static void main(String[] args) {
        Cabriolet cabriolet1 = new Cabriolet("red", true);
        Car cabriolet2 = new Cabriolet("blue", false);
        Object cabriolet3 = new Cabriolet("black", true);

        SUV suv1 =new SUV("yellow", 1.89);
        Car suv2 = new SUV("white", 2.29);
        Object suv3 = new SUV("black", 1.89);

        cabriolet1.description();

        //30minuta
    }
}
