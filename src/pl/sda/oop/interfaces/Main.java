package pl.sda.oop.interfaces;

public class Main {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        myClass.printSomething();
        myClass.getInterfaceName();

        int mySize = InterfaceExample.getSize();

        InterfaceExample interfaceExample = new MyClass();
        interfaceExample.printSomething();
        interfaceExample.getInterfaceName();

        //Przykłąd klasy anonimowej
        InterfaceExample anonymous = new InterfaceExample() {
            @Override
            public void printSomething() {
                System.out.println("Anonymous example!");
            }
        };


        //CIEKAWOSTKA - JAK POWSTAJE OBIEKT KLASY ANONIMOWEJ
        anonymous.printSomething();
        anonymous.getInterfaceName();
        System.out.println(anonymous.getClass().getName());

    }
}
