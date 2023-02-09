package pl.sda.generics.liquids;

//Klasa Tea dziedzicząca po klasie Liquid (herbata jest cieczą)
public class Tea extends Liquid {

    //metoda toString() nadpisana z klasy Object
    //każdy obiekt w Javie niejawnie dziedziczy po klasie Object
    @Override
    public String toString() {
        return getClass().getName() + "@@@" + hashCode();
    }
}
