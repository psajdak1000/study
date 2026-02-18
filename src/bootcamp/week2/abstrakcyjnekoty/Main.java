package bootcamp.week2.abstrakcyjnekoty;

public class Main {

    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");
        Animal animal = new Animal("GenericAnimal");

        System.out.println(myDog.speak());
        System.out.println(myCat.speak());
        System.out.println(animal.speak());

    }
}
