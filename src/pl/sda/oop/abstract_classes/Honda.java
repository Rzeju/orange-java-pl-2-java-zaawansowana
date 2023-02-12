package pl.sda.oop.abstract_classes;

//klasa Honda, dziedziczy po klasie Car (extends Car)
public class Honda extends Car {

    //pole klasy Honda
    private final String model;

    //konstruktor klasy Honda z dwoma argumentami
    public Honda(String vin, String model) {
        //wywołanie konstruktora nadklasy (klasy Car)
        //słowo kluczowe 'super' odnosi się do elementów nadklasy
        //klasa Honda dziedziczy pola po klasie Car
        //oznacza to, że obiekty klasy Honda będą posiadały pole vin zdefiniowane w nadklasie Car
        super(vin);
        //inicjalizacja pola model dla tworzonego obiektu Honda
        //słowo kluczowe 'this' odnosi się do obiektu tej klasy (Honda)
        this.model = model;
    }

    //getter dla pola model
    public String getModel() {
        return model;
    }

    //metoda odziedziczona z nadklasy Car
    //klasa potomna musi implementować wszystkie metody abstrakcyjne swojej nadklasy
    @Override
    void runEngine() {
        System.out.println("Brbrbrbrrbrbr..... Honda");
    }

    //metoda ta została nadpisana z klasy Car (@Override)
    //nowa implementacja przykrywa tą znajdującą się w klasie Car
    @Override
    public void someMethodToOverride() {
        System.out.println("Method from Honda");

        //istnieje możliwość, aby uruchamiać metody z nadklasy
        //dzięki 'super' możemy uruchomić metodę 'someMethodToOverride()' i wykonać kod zawarty w klasie Car
        //w ramach sprawdzenia może odkomentować poniższy kod, uruchomić metodę main w klasie Main i sprawdzić czy wyświetlił się komunikat z klasy Car


        //KOD DO ODKOMENTOWANIA
        //super.someMethodToOverride();
    }
}
