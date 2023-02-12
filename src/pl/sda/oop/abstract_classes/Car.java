package pl.sda.oop.abstract_classes;

//klasa abstrakcyjna Car
public abstract class Car {

    //pole klasy Car
    private final String vin;

    //konstruktor klasy Car z jednym argumentem
    public Car(String vin) {
        this.vin = vin;
    }

    //getter dla pola vin
    public String getVin() {
        return vin;
    }

    //metoda abstrakcyjna runEngine()
    //metody abstrakcyjne nie posiadają implementacji (nie mają ciała, brak im nawiasów '{ }' )
    //klasa abstrakcyjna nie musi posiadać metody abstrakcyjnej
    abstract void runEngine();

    //metoda w klasie Car
    //tę metodę możemy później nadpisać (@Override) w innej podklasie (klasie dziedziczącej po Car)
    public void someMethodToOverride() {
        System.out.println("Metoda z klasy Car");
    }

}
