package pl.sda.oop;

public abstract class Car {

    private final String vin;

    public Car(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    abstract void runEngine();

    public void someMethodToOverride() {
        System.out.println("Metoda z klasy Car");
    }

}
