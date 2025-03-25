package bootcamp.week5.finalKeyWord;

public class Main {
    public static void main(String[] args) {
        final Car car = new Car("red");
        System.out.println(car);
        car.setColor("blue");
        describe(car);
        System.out.println(car);
    }

    private static void describe(final Car car) {
        car.setColor("green");
    }
}
