package pl.sda.new_in_java_8_9.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAnotherExample {

    public static void main(String[] args) {

        //utworzenie listy Stringów zawierającej imiona
        List<String> names = List.of("Daniel", "Mateusz", "Jadwiga", "Paulina", "Edward", "Anna", "Beata", "Zygmunt");

        //wypisanie imion, których długość jest większa niż 5
        //listę 'names' zamieniamy na strumień danych String metodą stream()
        names.stream()
                //metoda filter() tworzy nowy strumień zawierający tylko te elementy, które spełniają przekazany do niej warunek
                //metoda filter() przyjmuje Interface funkcyjny Predicate, który posiada jedną metodę abstrakcyjną test()
                //metoda ta zwraca wartość logiczną na podstawie przeprowadzonego sprawdzenia
                //każdy kolejny element strumienia oznaczony jako 's' wykona sprawdzenie 's.length() > 5'
                .filter(s -> s.length() > 5)
                //metoda forEach() przyjmuje Interface funkcyjny Consumer
                //posiada on jedną metodę abstrakcyjną accept()
                //zostanie ona wywołana na każdy elemencie, który znajduje się w nowym strumieniu utworzonym przez metodę filter()
                //w efekcie wszytskie elementy zostaną wypisane na ekran zgodnie z 'System.out.print(s + ", ")'
                .forEach(s -> System.out.print(s + ", "));

        //nowy wiersz w konsoli
        System.out.println(" ");
        //sortowanie imion w porządku alfabetycznym
        //listę 'names' zamieniamy na strumień danych String metodą stream()
        List<String> sortedNames = names.stream()
                //metoda sorted() przyjmuje Comparator, wedle którego zostanie przeprowadzone sortowanie
                //korzystamy tutaj z gotowej implementacji zawartej w klasie String
                //metoda sorted() zwraca nowy strumień zawierający elementy z kolejności alfabetycznej
                .sorted(String::compareTo)
                //przy pomocy metody collect() możemy zwrócić elementy zawarte w strumieniu w postaci wybranej struktury danych
                //w tym przypadku korzystamy z metody statycznej toList() z klasy Collectors
                //posortowane imiona zapisujemy do listy pod zmienną 'sortedNames'
                .collect(Collectors.toList());

        //wyświetlamy posortowane imiona zawarte w liście 'sortedNames'
        System.out.println("Wynik sortowania");
        sortedNames.forEach(s -> System.out.print(s + ", "));
    }
}
