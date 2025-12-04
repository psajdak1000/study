package bootcamp.week2;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Woof! My name is " + getName() + ".";
    }
}
