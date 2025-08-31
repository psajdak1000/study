package bootcamp.week5.summary.person;

import bootcamp.week5.summary.product.Food;

public interface ProducingMan {

    Food produce (String productName, ConsumingMan consumingMan);
}
