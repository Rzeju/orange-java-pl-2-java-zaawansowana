package pl.sda.generics;

import pl.sda.generics.liquids.Coffee;
import pl.sda.generics.liquids.Tea;

public class Main {

    public static void main(String[] args) {

        Tea greenTea = new Tea();
        Cup<Tea> greenCup = new Cup<>(greenTea);
        greenCup.drink();

        Coffee blackCoffee = new Coffee();
        Cup<Coffee> coffeeCup = new Cup<>(blackCoffee);
        coffeeCup.drink();

        Tea blackTea = new Tea();
        Cup<Tea> newCup = coffeeCup.fullFillCup(blackTea);


    }
}
