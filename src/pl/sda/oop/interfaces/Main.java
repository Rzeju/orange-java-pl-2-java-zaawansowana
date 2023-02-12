package pl.sda.oop.interfaces;

public class Main {

    public static void main(String[] args) {

        //utworzenie obiektu MyClass
        //klasa ta implementuje Interface InterfaceExample
        //ma dostęp do jego metod
        MyClass myClass = new MyClass();
        //wywołanie metody zaimplementowanej w klasie MyClass
        myClass.printSomething();
        //wywołanie metody defaultowej z Interface'u
        myClass.getInterfaceName();

        //wywołanie metody statycznej z InterfaceExample
        //do metod statycznych Interface'u dostęp mamy przez nazwę tego Interface'u
        int mySize = InterfaceExample.getSize();

        //utworzenie obiektu MyClass dla zmiennej o typie InterfaceExample (polimorfizm)
        InterfaceExample interfaceExample = new MyClass();
        //wywołanie metod zawartych w Interface InterfaceExample
        //metoda 'printSomething()' jest zaimplementowana w klasie MyClass i taką implementację dostarczamy do zmiennej
        interfaceExample.printSomething();
        interfaceExample.getInterfaceName();

        //Przykład klasy anonimowej dla naszego interface'u
        //Implementujemy metody abstrakcyjne tego interaface'u
        InterfaceExample anonymous = new InterfaceExample() {
            @Override
            public void printSomething() {
                System.out.println("Anonymous example!");
            }
        };
        //wywołanie metod dla obiektu klasy anonimowej
        anonymous.printSomething();
        anonymous.getInterfaceName();

        //CIEKAWOSTKA - JAK POWSTAJE OBIEKT KLASY ANONIMOWEJ
        System.out.println(anonymous.getClass().getName());

    }
}
