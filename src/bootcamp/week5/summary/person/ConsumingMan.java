package bootcamp.week5.summary.person;

import bootcamp.week5.summary.product.Food;

public interface ConsumingMan {

    void consume(Food food);

    default void mniam() {
        System.out.println("mniam");
    }

    String getExpectations();

}
