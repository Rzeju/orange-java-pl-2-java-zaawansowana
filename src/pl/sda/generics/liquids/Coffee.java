package pl.sda.generics.liquids;

//Klasa Coffee dziedzicząca po klasie Liquid (kawa jest cieczą)
public class Coffee extends Liquid {

    //metoda toString() nadpisana z klasy Object
    //każdy obiekt w Javie niejawnie dziedziczy po klasie Object
    @Override
    public String toString() {
        return "Kawa, kawa!";
    }
}
