package pl.sda.new_in_java_8_9.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args) {

        //utworzenie listy Stringów zawierającej imiona
        List<String> stringList = List.of("Daniel", "Mateusz", "Jadwiga", "Paulina", "Edward", "Anna", "Beata", "Zygmunt");

        //utworzenie mapy na podstawie listy imion
        //mapa jako klucz zawiera dane imię a jako wartość długość tego imienia
        Map<String, Integer> namesWithLength = stringList.stream()
                //metoda collect umożliwia zapisanie elementów strumienia do wybranej przez na kolekcji
                //metoda statyczna toMap() z klasy Collectors przyjmuje dwie funkcje definiujące sposób tworzenia klucza i wartości w mapie
                //Referencja do metody 'String::new' wskazuje na konstruktor z klasy String. Zostanie on wywołany na rzecz każdego elementu z listy imion a utworzone w ten sposób obiekty staną się kluczami w mapie
                //Referencja do metody 'String::length' wskazuje na metodę length. Zostanie ona wywołana na rzecz każdego elementu z listy imion a uzyskane wyniki staną się wartościami w mapie
                .collect(Collectors.toMap(String::new, String::length));

        //metoda entrySet() zwraca Set zawierający pary klucz-wartość z utworzonej mapy
        namesWithLength.entrySet()
                //metoda stream() tworzy strumień zawierający elementy zbioru (Set) zwracanego przez metodę entrySet()
                .stream()
                //metoda sorted() zwraca nowy strumień z posortowanymi elementami
                //metoda statyczna 'comparingByKey()' zwraca Comparator, który posortuje pary klucz-wartość ze względu na klucze
                .sorted(Map.Entry.comparingByKey())
                //metoda forEach() wykona kod dla każdego elementu ze strumienia i wyświetli pary klucz-wartość posortowane względem klucza
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
