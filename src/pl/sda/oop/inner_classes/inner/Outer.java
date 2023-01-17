package pl.sda.oop.inner_classes.inner;

public class Outer {

    private final String outerClassField = "Outer Class";

    static class NestedStatic {
        private final String nestedStaticField = "Nested Static Class";

        void nestedStaticMethod() {
            System.out.println(nestedStaticField);
        }
    }

    class Inner {
        private final String innerClass = "Inner Class";

        void innerClassMethod() {
            System.out.println(outerClassField + " " + innerClass);
        }
    }
}
