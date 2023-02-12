package pl.sda.oop.interfaces;

import pl.sda.oop.inner_classes.inner.Main;

//przykłąd Interface'u
public interface InterfaceExample {

    //Interface może zawierać stałe
    //Wszystkie wartości w Interface są 'final static'
    int size = 5;

    //metoda abstrakcyjna Interface'u
    void printSomething();

    //Interface może posiadać metody defaultowe
    //taka metoda musi zawierać implementacje
    default void getInterfaceName() {
        System.out.println(InterfaceExample.class.getName());
    }

    //Interface może posiadać metody statyczne
    //taka metoda musi zawierać implementacje
    static int getSize() {
        return size;
    }
}
