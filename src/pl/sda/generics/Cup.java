package pl.sda.generics;

import pl.sda.generics.liquids.Liquid;

//Klasa parametryzowana typem T
//Do kubka możemy wlać wybraną przez nas ciecz (może być to zarówno kawa jak i herbata)
//Zapis <T extends Liquid> mówi, że typ, którym będziemy parametryzować klasę Cup musi być podtypem klasy Liquid (musi dziedziczyć po klasie Liquid)
public class Cup<T extends Liquid> {

    //Pole typu T
    //Przechowuje obiekt o typie, którym parametryzowana jest klasa
    private final T liquid;

    //Konstruktor dla klasy Cup. Przyjmuje obiekt (ciecz), którym wypełniony zostanie kubek
    public Cup(T liquid) {
        this.liquid = liquid;
    }

    //metoda drink()
    void drink() {
        System.out.println("Drinking " + liquid);
    }

    //metoda parametryzowana
    //pozwala ona na wypełnienia kubka cieczą
    public <T extends Liquid> Cup<T> fullFillCup(T liquid) {
        return new Cup<>(liquid);
    }


}
