package pl.sda.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedLIstExample {

    public static void main(String[] args) {

        //Utworzenie obiektu LinkedList
        ////Zwróć uwagę na typowanie interfejsem tej zmiennej - Polimorfizm
        //Typ parametryczny "String" mówi o typie obiektu, który będzie przechowywać ta lista
        //Typ parametryzujący listę musi być obiektowy
        List<String> myLinkedList = new LinkedList<>();

        //Dodanie do listy kolejnych elementów
        myLinkedList.add("1 String");
        myLinkedList.add("2 String");
        myLinkedList.add("3 String");
        myLinkedList.add("4 String");
        myLinkedList.add("5 String");

        //Wyświetlenie elementów listy za pomocą pętli foreach
        for (String s : myLinkedList) {
            System.out.print(s + ", ");
        }

        System.out.println(" ");

        //Pobranie z listy elemntu z idexem 3
        //Nie jest to optymalny sposób pobierania elementów z LinkedListy
        //Interfejs List<E> posiada metodę get() stąd wymóg zaimplementowania jest również w przypadku LinkedListy (LinkedList implementuje interfejs List<E>)
        //Sprawdź różnicę implementacyjne tych stuktur danych - ArrayList i LinkedList (opis ich działa znajdziesz w sieci)
        System.out.println((myLinkedList.get(3)));

        //Utowrzenie obiektu ArrayList
        List<String> myArrayList = new ArrayList<>();
        //Pętla foreach, dodajemy elemnty zawarte w LInkedList do ArrayList
        for (String s : myLinkedList) {
            myArrayList.add(s);
        }
        //Wyczyszczenie zawartości ArrayListy
        myArrayList.clear();

        //Ponownie dodajemy elementy z LinkedListy do ArrayListy
        //Zwróć uwagę, że użycie metody addAll() jest prostrze niż wykonywanie pętli forach (przykład powyżej)
        myArrayList.addAll(myLinkedList);
        //Wyczyszczenie zawartości ArrayListy
        myArrayList.clear();

        //Utworzenie tablicy Stringów
        String[] myArray = {"3212312", "432asfasfsafa", "dsfsdfgds", "kahaskjdhas"};

        //Wypełnienie ArrayListy obiektami z tablicy myArray
        //W tym przy korzystamy z metody statycznej asList() z klasy Arrays
        //Tworzy ona listę na podstawie tablicy
        //Utworzoną listę przypisujemy do naszej zmiennej myArrayList
        myArrayList = Arrays.asList(myArray);


        //Wykonujemy operację w drugą stroną
        //Na podstawie naszej listy tworzymy teraz tablicę za pomocą metody toArray()
        //Przekazuje do tej metody tablicę oczekiwanego przez nas typu danych (String)
        System.out.println("Wynik toArray()");
        String[] toArray = myLinkedList.toArray(new String[0]);
        //Pętla foreach wyświetla elementy tablicy
        for (String s : toArray) {
            System.out.print(s + " ,");
        }

    }
}
