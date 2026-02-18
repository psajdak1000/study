package bootcamp.week2.abstrakcyjnekoty;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "Meow! My name is " + getName() + ".";
    }
}
