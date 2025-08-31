package bootcamp.week5.summary.product;

import bootcamp.week5.summary.person.ConsumingMan;
import bootcamp.week5.summary.person.ProducingMan;

public class Chocolate extends Food {
    public Chocolate(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
