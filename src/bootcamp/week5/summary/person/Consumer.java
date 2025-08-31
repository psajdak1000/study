package bootcamp.week5.summary.person;

import bootcamp.week5.summary.product.Food;

import java.util.ArrayList;

public class Consumer extends Person {

    private final String expectations;
    public Consumer(String name, String surename, String expectations) {
        super(name, surename);
        this.expectations = expectations;
    }

    public String getExpectations() {
        return expectations;
    }

    @Override
    public void consume(Food food) {
        System.out.println("consumer cosuming"  + food);
    }
}

