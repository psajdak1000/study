package bootcamp.week5.summary.product;

import bootcamp.week5.summary.person.ConsumingMan;
import bootcamp.week5.summary.person.ProducingMan;

public class Sandwich extends Food {
    public Sandwich(String name,  ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
