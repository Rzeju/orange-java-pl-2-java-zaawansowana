package pl.sda.oop.polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PolymorphismExample {

    public static void main(String[] args) {

        //Utworzenie obiektu ArrayList
        //Zmienną typuje jako List<E> jest to interface
        List<String> myList = new ArrayList<>();
        //dodanie elementów do listy metodą add()
        //nasza lista może przechowywać wartość null
        myList.add("MyString");
        myList.add("2");
        myList.add("Hehe");
        myList.add("Czesc");
        myList.add(null);

        //dodanie do listy wartości pobranej od użytkownika z konsoli
        Scanner scanner = new Scanner(System.in);
        String myLine = scanner.next();
        myList.add(myLine);

        //wywołanie metod dostępnych dla interface'u List
        //metoda size() zwraca liczbę elementów w liście
        System.out.println(myList.size());
        //metoda get() zwraca element znajdujący się pod przekazanym indexem
        System.out.println(myList.get(0));
        //metoda get() zwraca element znajdujący się pod przekazanym indexem
        System.out.println(myList.get(2));
        //metoda contains() sprawdza czy przekazany element znajduje się w liście
        System.out.println(myList.contains("Toooo"));
        //wyświetlenie wszystkich elementów w liście
        System.out.println(myList);

        //przypisanie do zmiennej nowego obiektu LinkedList
        //LinkedList podobnie jak ArrayList implementuje interface List<E>
        //dostępne są dla niej metody, których używaliście dla ArrayList
        //możliwość przypisania do zmiennej o typie List<E> różnych implementacji jest przykładem polimorfizmu
        myList = new LinkedList<>();
        //metoda size() zwraca liczbę elementów w liście
        System.out.println(myList.size());
        //wyświetlenie wszystkich elementów w liście (lista jest pusta)
        System.out.println(myList);

        //SPRAWDŹ, JAKIE SĄ RÓŻNICE W SPOSOBIE DZIAŁANIA OBU TYCH IMPLEMENTACJI (ArrayList oraz LinkedList)


    }
}
