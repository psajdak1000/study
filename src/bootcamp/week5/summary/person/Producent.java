package bootcamp.week5.summary.person;

import bootcamp.week5.summary.product.Chocolate;
import bootcamp.week5.summary.product.Food;
import bootcamp.week5.summary.product.Sandwich;
import bootcamp.week5.summary.product.Soup;

public class Producent extends Person implements ProducingMan {

    public Producent(String name, String surename) {
        super(name, surename);
    }

    @Override
    public void consume(Food food) {
        System.out.println("Producent consumed: " + food);
    }

    @Override
    public String getExpectations() {
        return "late late";
    }

    @Override
    public Food produce(String productName, ConsumingMan consumingMan) {
        switch (productName) {
            case "chocolate":
                return new Chocolate(productName,this, consumingMan);
            case "soup":
                return new Soup(productName,this,consumingMan);
            default:
                return new Sandwich(productName,this,consumingMan);
        }
    }
}
