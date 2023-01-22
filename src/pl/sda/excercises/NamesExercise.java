package pl.sda.excercises;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NamesExercise {

    public static void main(String[] args) {

        //Utowrzenie skanera
        Scanner scanner = new Scanner(System.in);
        //Lista do zapisu wprowadzonych przez użytkownika imion
        List<String> names = new ArrayList<>();

        //nieskończone pętla do-while
        do {
            //pobranie od użytkownika kolejnego imienia
            String nextName = scanner.next();

            //warunek przerywający nieskończoną petlę while
            //po wpisaniu "-"
            if (nextName.equals("-")) {
                break;
            }
            //dodanie do listy kolejnego imienia
            names.add(nextName);
        //nieskończona pętle do-while -> warunek jest 'true'
        } while (true);

        //SET

        //MAP

        //utworzenie mapy String-Integer (klucz-wartość)
        //taka para klucz wartość przedstawia imię oraz liczbę jego wystąpień w liście
        Map<String, Integer> namesCounter = new HashMap<>();

        //pętla foreach dla listy names
        //pętla "przejdzie" przez całą listę
        for (String name : names) {
            //sprawdzenie, czy w mapie istnieje już wartość dla konkretnego imienia
            //jeżeli dane imię(klucz) nie pojawiło się jeszcze w mapie otrzymamy null
            if (namesCounter.get(name) == null) {
                //jeżeli dane imię(klucz) nie istnieje w mapie, dodaj je i ustaw licznik na 1
                //imię to występuje po raz pierwszy stąd wartość jest 1
                namesCounter.put(name, 1);
            } else {
                //jeżeli dane imię jest już w mapie (to znaczy, że wystąpiło)
                //zwiększ licznik o 1 (kolejne wystąpie +1)
                Integer counter = namesCounter.get(name) + 1;
                //zapisz dane imię(klucz) wraz z nową wartością licznik(wartość)
                namesCounter.put(name, counter);
            }
        }

        //licznik dla unikatowych imion
        int uniqueName = 0;
        //pętla foreach dla mapy czyli dla par (klucz-wartość) -> (String-Integer) -> (imię-liczba wystąpień)
        for (Map.Entry<String, Integer> entry : namesCounter.entrySet()) {
            //wypisanie wszystkich par imię-liczba wystąpień
            System.out.printf("Name: %s - Count: %d, ", entry.getKey(), entry.getValue());
            //zliczenie tylko tych imion, które wystąpiły raz (unikatowe)
            if (entry.getValue() == 1) {
                uniqueName++;
            }
        }
        //wypisanie wyniku
        System.out.println("\nLiczba unikalny imion wynosi: " + uniqueName);

        //SZYBSZE

        //utworzenie mapy String-Integer (klucz-wartość)
        //taka para klucz wartość przedstawia imię oraz liczbę jego wystąpień w liście
        Map<String, Integer> namesCounter_faster = new HashMap<>();

        //pętla foreach dla listy names
        //pętla "przejdzie" przez całą listę
        for (String name : names) {
            //jeżeli dane imie istnieje w mapie, zwiększ wartość licznika o 1
            namesCounter_faster.computeIfPresent(name, (k, v) -> v + 1);
            //jeżeli dane imie nie istnieje w mapie wpisz je wraz z wartością 1 (pierwsze wystąpienie)
            namesCounter_faster.putIfAbsent(name, 1);
        }

        //reset liczby unikalny imion
        uniqueName = 0;
        //pętla foreach dla mapy czyli dla par (klucz-wartość) -> (String-Integer) -> (imię-liczba wystąpień)
        for (Map.Entry<String, Integer> entry : namesCounter_faster.entrySet()) {
            //wypisanie wszystkich par imię-liczba wystąpień
            System.out.printf("Name: %s - Count: %d, ", entry.getKey(), entry.getValue());
            //zliczenie tylko tych imion, które wystąpiły raz (unikatowe)
            if (entry.getValue() == 1) {
                uniqueName++;
            }
        }
        //wypisanie wyniku
        System.out.println("\nFASTER_ONE - Liczba unikalny imion wynosi: " + uniqueName);


        //STREAMY I WYRAŻENIA LAMBDA (rozwiązanie dodatkowe)

        //utowrzenie strumienia z listy
        long uniquesNames = names.stream()
                //grupowanie imion
                .collect(Collectors.groupingBy(
                        //"przepis" na klucz w mapie - String
                        Function.identity(),
                        //"przepis na wartość w mapie - zliczanie danego imienia
                        Collectors.counting()))
                //pobranie par klucz-wartość z mapy
                .entrySet()
                //utworzenie strumienia par klucz-wartość
                .stream()
                //filtracja par - te których wartość jest równa 1
                .filter(entry -> entry.getValue() == 1)
                //mapowanie par na klucz (z pary klucz-wartość zosatje tylko klucz)
                .map(Map.Entry::getKey)
                //zliczenie pozostałych kluczy (unikalne imiona)
                .count();

        //Wyświetlenie wyniku
        System.out.println("Lambda -> " + uniquesNames);

    }
}
