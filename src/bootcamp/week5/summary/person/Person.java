package bootcamp.week5.summary.person;

public abstract class Person implements ConsumingMan {

    private final String name;
    private final String surename;

    protected Person(String name, String surename) {
        this.name = name;
        this.surename = surename;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                '}';
    }
}
