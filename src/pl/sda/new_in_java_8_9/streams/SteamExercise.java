package pl.sda.new_in_java_8_9.streams;

import java.util.List;
import java.util.function.BinaryOperator;

public class SteamExercise {

    public static void main(String[] args) {

        //Utworzenie listy liczb
        List<Integer> myNumbers = List.of(100, 0, 14, -54, -10, 17, 11, 234, 45, 456, 3, 10);

        //znalezienie najmniejszej liczby w liście przy użyciu metody stream()
        //metoda stream() zamienia naszą listę w strumień danych, na którym możemy dokonywać operacji
        int min_m = myNumbers.stream()
                //metoda min() zwraca najmniejszy element strumienia zgodnie z przekazanym obiektem Comparator<T>
                //tutaj wykorzystujemy gotową implementację z klasy Interger
                //zapis 'Integer::compareTo' to referencja do tej motody
                .min(Integer::compareTo)
                //w przypadku braku wyniku metoda orElse zwróci 0
                .orElse(0);

        //inny sposób rozwiązania tego zadania
        int min_r = myNumbers.stream()
                //metoda reduce() zwraca jeden element uzyskiwany na podstawie przekazanej funkcji BinaryOperator<T>
                //zaimplementowana funkcja zwraca mniejszy z dwóch elementów
                .reduce((a, b) -> a - b <= 0 ? a : b)
                //w przypadku braku wyniku metoda orElse zwróci 0
                .orElse(0);

        //inny sposób rozwiązania tego zadania
        int min_rr = myNumbers.stream()
                //w tym przypadku używamy metody statycznej minBy() z Interface'u BinaryOperator<T>
                //metoda ta przyjmuje Comparator, wedle którego zostanie przeprowadzone porównanie
                //korzystamy tu z gotowej implementacji Comparatora z klasy Integer
                .reduce(BinaryOperator.minBy(Integer::compareTo))
                //w przypadku braku wyniku metoda orElse zwróci 0
                .orElse(0);

        //wyświetlenie wyników rozwiązań zadania
        //niezależnie od zastosowanego podejścia wynik jest prawidłowy
        System.out.println(min_m);
        System.out.println(min_r);
        System.out.println(min_rr);
    }
}
