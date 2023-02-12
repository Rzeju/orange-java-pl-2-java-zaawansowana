package pl.sda.oop.enumerated;

public class Main {

    public static void main(String[] args) {

        //przypisanie do zmiennej obiektu enum
        //obiekty klasy enum są już utworzone i dostępne przez nazwę klasy
        Coffee coffee_1 = Coffee.AMERICANO;
        //wypisanie wartości pól dla obiektu z klasy enum
        System.out.println(coffee_1.getMilk());
        System.out.println(coffee_1.getRoast());

        //dostęp do obiektu z klasy enum poprzez jego nazwę
        Coffee coffee_2 = Coffee.valueOf("ESPRESSO");
        //wypisanie wartości pól obiektu
        System.out.println(coffee_2.getMilk());
        System.out.println(coffee_2.getRoast());

        //metoda values() zwraca wszystkie obiektu klasy enum jak tablicę
        Coffee[] coffees = Coffee.values();

        //pętla foreach
        //wyświetla wszystkie obiekty enum z klasy Coffee wraz z ich pozycją na liście
        //obiekty w klasie enum otrzymują swoją pozycję w zależności od kolejności ich utworzenia w klasie
        //pierwszy element ma pozycję 0
        for (Coffee coffee : coffees) {
            System.out.print(coffee.ordinal());
            System.out.print("-");
            System.out.print(coffee);
            System.out.println(" ");
        }

    }
}
