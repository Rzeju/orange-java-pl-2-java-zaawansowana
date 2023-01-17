package pl.sda.oop.abstract_classes;

public class Honda extends Car {

    private final String model;

    public Honda(String vin, String model) {
        super(vin);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    void runEngine() {
        System.out.println("Brbrbrbrrbrbr..... Honda");
    }

    @Override
    public void someMethodToOverride() {
        System.out.println("Method from Honda");
        super.someMethodToOverride();
    }
}
