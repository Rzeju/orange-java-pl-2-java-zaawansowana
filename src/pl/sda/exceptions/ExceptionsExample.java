package pl.sda.exceptions;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionsExample {

    public static void main(String[] args) {

        //Utworzenie ArrayListy
        List<String> myList = new ArrayList<>();
        //Dodanie elementu do ArrayListy
        myList.add("Hello");

        //Blok try sprawdza czy kod w nim zawarty nie zgłasza wyjątku
        try {
            //Kod zgłaszający wyjątek
            //Próbujemy pobrać element o idexie, który nie istnieje (nasza ArrayList ma tylko jeden element - idex 0)
            System.out.printf("Value at index 3: %s%n", myList.get(3));
            //Ta instrukcja się nie wykona. Wywołanie myList.get(3) rzuci wyjątek i program zacznie wykonywać kod w bloku catch
            System.out.println("TO SIĘ NIE WYKONA");
        } catch (IndexOutOfBoundsException exception) {
            //Blok catch przechwytuje rzucony wyjątek i wykonuje kod zawarty w tym bloku
            System.out.println("Blok catch");
            //Wypisanie informacji zawartej w wyjątku
            System.out.println(exception.getMessage());
        } finally {
            //blok finally - wykona się zawsze, zarówno w przypadku jeżeli wyjątek zostanie rzucony jak i w sytuacji kiedy wyjątku nie będzie
            System.out.println("Ten blok wykona się zawsze! Niezależnie od tego czy wyjątek zostanie rzucony");
        }

        //Wywołanie metody statycznej z klasy ExceptionTest
        //Zwróć uwagę, że ta metoda deklaruje możliwość zgłoszenia wyjątku - throws IndexOutOfBoundsException
        //Wyjątek prezentowany w tym przykładzie zalicza się do grupy wyjątków unchecked - dziedziczą one po klasie RuntimeException
        //Takich wyjątków jako programiści nie sprawdzamy, może tak pisać kod aby ustrzec się przed ich wystąpieniem
        //Zwróć uwagę na to, że pomimo deklaracji, iż metoda testException() może rzucić wyjątek kompilator nie wymaga od nas jego obsłużenia
        //Wynik to z tego, że wyjątek IndexOutOfBoundsException należy do grupy wyjątków unchecked i możemy tak pisać kod aby do niego nie dopuścić
        //Przykłady w wyjątka checed znajdziesz w części poświęconej operacją na plikach - pakiet in_out - klasa InOutExample
        int x = ExceptionTest.testException(new int[10], 15);
    }
}
