package bootcamp.week5.summary.product;

import bootcamp.week5.summary.person.ConsumingMan;
import bootcamp.week5.summary.person.ProducingMan;

public abstract class Food {

    private final String name;

    private final ConsumingMan consumingMan;

    private final ProducingMan producingMan;

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", consumingMan=" + consumingMan +
                ", producingMan=" + producingMan +
                '}';
    }

    public Food(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        this.name = name;
        this.consumingMan = consumingMan;
        this.producingMan = producingMan;
    }

}

