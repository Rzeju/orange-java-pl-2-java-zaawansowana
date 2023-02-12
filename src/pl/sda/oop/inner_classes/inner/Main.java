package pl.sda.oop.inner_classes.inner;

public class Main {

    public static void main(String[] args) {

        //utworzenie obiektu statycznej klasy wewnętrznej
        //do utworzenia tego obiektu nie jest potrzebny obiekt klasy zewnętrznej Outer
        Outer.NestedStatic nestedStatic = new Outer.NestedStatic();
        //wywołanie metody statycznej klasy wewnętrznej
        nestedStatic.nestedStaticMethod();

        //utworzenie obiektu klasy zewnętrznej
        Outer outer = new Outer();
        //utworzenie obiektu klasy wewnętrznej
        //aby utworzyć obiekt klasy wewnętrznej potrzebny jest obiekt klasy zewnętrznej Outer
        Outer.Inner innerClass = outer.new Inner();
        //wywołanie metody klasy wewnętrznej
        innerClass.innerClassMethod();
    }
}
