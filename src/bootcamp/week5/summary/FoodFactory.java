package bootcamp.week5.summary;

import bootcamp.week5.summary.person.Consumer;
import bootcamp.week5.summary.person.ConsumingMan;
import bootcamp.week5.summary.person.Producent;
import bootcamp.week5.summary.person.ProducingMan;
import bootcamp.week5.summary.product.Food;


public class FoodFactory {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        foodFactory.run();

    }

    private void run() {
        ProducingMan[] producingPeople = new ProducingMan[]{
                new Producent("Ali", "Baba"),
                new Producent("Maly", "Jaba")
        };

        ConsumingMan[] consumingPeople = new ConsumingMan[]{
                new Consumer("Rafal", "Marchewa","chocolate"),
                new Consumer("Veronika", "Chlewa","late"),
        };

        int counter = 0;
        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
                counter++;
            }
        }


        Food[] foods = new Food[counter];


        int index = 0;

        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
                Food food = producingPerson.produce(
                        consumingPerson.getExpectations(), consumingPerson);
                foods[index] = food;
                index++;
            }
        }

        System.out.println("PRINTING FOOD: " );
        for (Food food : foods) {
            System.out.println(food);
        }

    }
}
