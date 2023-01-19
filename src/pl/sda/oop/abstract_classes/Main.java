package pl.sda.oop.abstract_classes;

public class Main {

    public static void main(String[] args) {

        Honda honda_1 = new Honda("12345", "XYZ");

        honda_1.runEngine();
        System.out.println(honda_1.getVin());
        System.out.println(honda_1.getModel());

        honda_1.someMethodToOverride();

        //Przykłąd polimorfizmu
        Car myCar = new Honda("324554436", "PKPKPK");
        myCar.runEngine();


    }
}
