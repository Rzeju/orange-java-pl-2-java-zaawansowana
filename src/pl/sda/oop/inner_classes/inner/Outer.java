package pl.sda.oop.inner_classes.inner;

//klasa zewnętrzna
public class Outer {

    //pole klasy zewnętrznej
    private final String outerClassField = "Outer Class Filed";
    private final static String outerClassStaticField = "Outer Class Static Filed";

    //statyczna klasa wewnętrzna
    //nie potrzeba obiektu klasy zewnętrznej aby utowrzyć jej obiekt
    static class NestedStatic {
        //pole statycznej klasy wewnętrznej
        private final String nestedStaticField = "Nested Static Class Field";

        //metody statycznej klasy wewnętrzna mają dostęp jedynie do statycznych pól klasy zewnętrznej
        void nestedStaticMethod() {
            System.out.println(nestedStaticField + " " + outerClassStaticField);
        }
    }

    //klasa wewnętrzna
    //aby utworzyć obiekt tej klasy należy wcześniej utworzyć obiekt klasy zewnętrznej
    class Inner {
        private final String innerClass = "Inner Class Filed";

        //metody klasy wewnętrznej mają dostęp do pól klasy zewnętrznej
        void innerClassMethod() {
            System.out.println(outerClassField + " " + outerClassStaticField + " " + innerClass);
        }
    }
}
