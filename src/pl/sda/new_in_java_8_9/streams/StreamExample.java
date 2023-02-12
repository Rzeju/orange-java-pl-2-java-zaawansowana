package pl.sda.new_in_java_8_9.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        //utworzenie listy liczb
        List<Integer> myNumbers = List.of(100, 0 , 14, -54, -10, 17, 11, 234, 45, 456, 3, 10);

        //sortujemy liczby z utworzonej listy w porządku rosnącym
        //metoda stream() zamienia naszą listę w strumień danych
        List<Integer> sortedNumbers = myNumbers.stream()
                //metoda sorted() zwraca nowy strumień zawierający posortowane dane
                //w przypadku, jeżeli klasa sortowanych obiektów implementuje Interface Comparable, nie musimy dodatkowo przekazywać Comparatora
                //zostanie wtedy wywołana metoda 'compareTo()', która jest już zaimplementowana w tej klasie (zaimplementowanie Interface'u Comparable<T> wymaga implementacje metody 'compareTo()'
                .sorted()
                //przy pomocy metody collect() możemy zwrócić elementy zawarte w strumieniu w postaci wybranej struktury danych
                //w tym przypadku korzystamy z metody statycznej toList() z klasy Collectors
                //posortowane liczby zapisujemy do listy pod zmienną 'sortedNumbers'
                .collect(Collectors.toList());

        //wypisujemy posortowane liczby na ekranie

        //wyświetlenie całej listy
        System.out.println(sortedNumbers);
        //metoda forEach() wykonuje przekazany kod na każdym elemencie
        sortedNumbers.forEach(s -> System.out.print(s + ", "));

        System.out.println(" ");
        //metoda forEach() wykonuje przekazaną metodę na każdym elemencie
        //odwołujemy się tutaj poprzez referencję do metody println()
        //każdy element zostanie wypisany w osobnym wierszu
        sortedNumbers.forEach(System.out::println);

        //wyliczenie średniej z liczb zwartych w liście
        //metoda stream() zamienia naszą listę w strumień danych
        Double average = myNumbers.stream()
                //metoda mapToDouble() mapuje liczby ze strumienia na typ double i zwraca nowy strumień DoubleStream
                //jest to konieczne, ponieważ poniższa metoda average() może być wykonana na strumieniu liczb typu double (średnia nie musi być liczbą całkowitą)
                .mapToDouble(Integer::doubleValue)
                //metoda average() oblicza średnią liczb ze strumienia
                .average()
                //w przypadku braku wyniku metoda orElse() zwraca 0
                .orElse(0.0);

        //wypisanie na ekran średniej liczb
        System.out.println("Średnia = " + average);

    }
}
