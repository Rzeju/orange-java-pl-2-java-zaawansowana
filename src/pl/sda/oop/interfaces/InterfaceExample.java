package pl.sda.oop.interfaces;

public interface InterfaceExample {

    int size = 5;

    void printSomething();

    default void getInterfaceName() {
        System.out.println(InterfaceExample.class.getName());
    }

    static int getSize() {
        return size;
    }
}
