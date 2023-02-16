package pl.sda.oop.polymorphism_level_2;

//klasa Lion, dziedziczy po klasie Mammal
//klasa ta dziedziczy pola oraz metody ze wszystkich swoim nadklas (w tym przypadku Animal oraz Mammal)
public class Lion extends Mammal {

    //kontruktor z dwoma argumentami
    //klasa Lion dziedziczy pola ze swoich nadklas
    public Lion(String name, String movementKind) {
        //wywołanie konstruktor nadklasy
        //super odnosi się do konstruktora z klasy Mammal (ma on dwa parametry)
        super(name, movementKind);
    }

    //metoda z klasy Animal
    //klasa Lion dziedziczy metody z nadklas i musi zaimplementować wszystkie abstrakcyjne metody z nadklas
    @Override
    public String getSound() {
        return "WRrrr Lion";
    }

    //metoda z klasy Mammal
    //klasa Lion dziedziczy metody z nadklas i musi zaimplementować wszystkie abstrakcyjne metody z nadklas
    @Override
    public void drink() {
        System.out.println("Drinking lion milk!");
    }

    //metoda z klasy Lion
    //klasa Lion może posiadać swoje własne metody
    public void lionMethod() {}

}
