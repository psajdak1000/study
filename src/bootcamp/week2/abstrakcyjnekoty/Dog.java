package bootcamp.week2.abstrakcyjnekoty;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Woof! My name is " + getName() + ".";
    }
}
