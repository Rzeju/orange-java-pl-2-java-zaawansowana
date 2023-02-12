package pl.sda.oop.interfaces;

//klasa implementująca Interface InterfaceExample
//musi implementować wszystkie metody abstrakcyjne tego Interface'u
public class MyClass implements InterfaceExample {

    //implementacja metody abstrakcyjnej z Interface'u InterfaceExample
    @Override
    public void printSomething() {
        System.out.println("Print Somethig MyClass");
    }
}
