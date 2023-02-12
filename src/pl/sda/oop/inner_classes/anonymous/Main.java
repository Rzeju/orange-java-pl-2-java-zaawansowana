package pl.sda.oop.inner_classes.anonymous;

public class Main {

    public static void main(String[] args) {

        //przykład klasy anonimowej
        //Interface AnonymousExample posiada jedną metodę abstrakcyjną sayHello()
        //Każdy obiekt o typie AnonymousExample musi posiadać implementacje metody sayHello()
        //Tworząc obiekt klasy anonimowej musi podać implementacje metod abstrakcyjnych dla jej typu
        //W tym przypadku podajemy implementacje metody 'sayHello()' ze względu na typ zmiennej AnonymousExample
        AnonymousExample anonymousExample_1 = new AnonymousExample() {
            @Override
            public void sayHello() {
                System.out.println("Hello anonymousExample_1");
            }
        };
        //wywołanie metody sayHello()
        anonymousExample_1.sayHello();

        //Utworzenie obiektu klasy anonimowej za pomocą wyrażeń lambda
        //Metoda 'sayHello()' nie przyjmuje parametru oraz nic nie wraca
        //zapis () świadczy o braku argumentów natomiast kod 'System.out.println("Hello anonymousExample_2")' nie zwraca wartości
        //jest to zgodne z sygnaturą metody sayHello()
        AnonymousExample anonymousExample_2 = () -> System.out.println("Hello anonymousExample_2");
        //wywołanie metody sayHello()
        anonymousExample_2.sayHello();

    }
}
