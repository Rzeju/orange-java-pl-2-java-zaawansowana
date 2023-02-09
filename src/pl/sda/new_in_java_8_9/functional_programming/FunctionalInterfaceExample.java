package pl.sda.new_in_java_8_9.functional_programming;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        //Utworzenie klasy anonimowej typu Runnable
        //Interface Runnable posiada jedną metodę abstrakcyjną run()
        //Metoda ta nie przyjmuje argumentu oraz nic nie zwraca
        //Poniżej metoda run() została zaimplementowana
        //Po jej uruchomieniu na ekranie zostanie wypisany komunikat
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnabla, klasa anonimowa");
            }
        };

        //Utworzenie klasy anonimowej za pomocą wyrażenia lambda
        //Zapis () świadczy o braku argumentów. Po uruchomieniu wykona się zdefiniowany tam kod
        //Metoda println nic nie zwraca w związku z czym implementacja zachowuje zgodność z metodą run()
        Runnable runnableLambda = () -> System.out.println("Runnable, lambda");

        //uruchomienie metody run() dla utworzonych zmiennych
        runnable.run();
        runnableLambda.run();

        //Utworzenie zmiennej typu Predicate<T>
        //Jest to interface funkcyjny zawierający jedną metodę abstrakcyjną test()
        //Metoda ta przyjmuje jeden parametr typu T i zwraca wartość logiczną boolean
        //Interface ten służy do sprawdzenia czy przekazany argument spełnia jakiś warunek
        //W tym przypadku metoda test() sprawdzi, czy przekazany obiekt typu String to "Test"
        //Zapis (s) świadczy, że do metody zostanie przekazany jeden parametr
        //Następnie kod sprawdzi czy przekazany parametr to String "Test" i zwróci wynik sprawdzenia
        Predicate<String> myPredicate_1 = (s) -> s.equals("Test");
        //Wykonujemy metodę test() dla argumentu "Hej". Sprawdzenie zakończy się niepowodzeniem - wynik false
        //Wynik sprawdzenia umieszczamy w zmienne result_1
        boolean result_1 = myPredicate_1.test("Hej");
        //Wypisanie wyniku na ekran
        System.out.println(result_1);

        //Utworzenie kolejnej zmienne typu Predicate<T>
        //Do istniejącej już zmiennej dodajemy kolejny warunek metodą defaultową or()
        //Wewnątrz pekazujemy kolejny Predicate<String>
        //Obecnie kod ten będzie sprawdzał, czy przekazany argument to "Test" lub "Hej"
        Predicate<String> myPredicate_2 = myPredicate_1.or((s) -> s.equals("Hej"));
        //Wykonanie metody test() dla argumentu "Hej"
        //Wynik testu zapisujemy do zmiennej result_2
        //Test zakończy się powodzeniem - true
        boolean result_2 = myPredicate_2.test("Hej");
        //wypisanie wyniku na ekran
        System.out.println(result_2);

        //Utworzenie zmiennej typu Consumer<T>
        //Consumer<T> jest interface funkcyjnym i zawiera jedną metodę abstrakcyjną accept()
        //Metoda ta przyjmuje jeden argument typu T i nic nie zwraca
        //Zapis (s) świadczy o jednym argumencie przekazywanym do metody
        //Następnie metoda System.out.println(s) wydrukuje ten argument na ekran
        //Metoda System.out.println(s) nic nie zwraca zatem jest zgodna z wymaganiami metody apply
        Consumer<String> consumer = (s) -> System.out.println(s);
        //Wywołanie metody accept() dla argumentu "CZESC"
        //Zostanie on wypisany na ekran
        consumer.accept("CZESC");
    }
}
