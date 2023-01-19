package pl.sda.oop.enumerated;

public class Main {

    public static void main(String[] args) {

        Coffee coffee_1 = Coffee.AMERICANO;
        System.out.println(coffee_1.getMilk());
        System.out.println(coffee_1.getRoast());

        Coffee coffee_2 = Coffee.valueOf("ESPRESSO");
        System.out.println(coffee_2.getMilk());
        System.out.println(coffee_2.getRoast());

        Coffee[] coffees = Coffee.values();

        for (Coffee coffee : coffees) {
            System.out.println(coffee.ordinal());
        }

    }
}
