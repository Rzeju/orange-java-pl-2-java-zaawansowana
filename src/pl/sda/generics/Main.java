package pl.sda.generics;

import pl.sda.generics.liquids.Coffee;
import pl.sda.generics.liquids.Tea;

public class Main {

    public static void main(String[] args) {

        //Utworzenie obiektu typu Tea
        Tea greenTea = new Tea();
        //Utworzenie obiektu Cup zawierającego herbate
        //Zwróć uwagę na typ parametryczny
        Cup<Tea> greenCup = new Cup<>(greenTea);
        //wywołanie metody drink
        greenCup.drink();

        //Utworzenie obiektu typu Tea Coffee
        Coffee blackCoffee = new Coffee();
        //Utworzenie obiektu Cup zawierającego kawe
        //Zwróć uwagę na typ parametryczny
        Cup<Coffee> coffeeCup = new Cup<>(blackCoffee);
        //wywołanie metody drink
        coffeeCup.drink();

        //Utworzenie obiektu typu Tea
        Tea blackTea = new Tea();
        //Wypełnienie kubka herbatą za pomocą metody
        Cup<Tea> newCup = coffeeCup.fullFillCup(blackTea);
        //wywołanie metody drink
        newCup.drink();


    }
}
