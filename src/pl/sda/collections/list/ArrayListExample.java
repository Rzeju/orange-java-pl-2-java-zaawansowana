package pl.sda.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        //Utworzenie obiektu ArrayList
        //Zwróć uwagę na typowanie interfejsem tej zmiennej - Polimorfizm
        //Typ parametryczny "Float" mówi o typie obiektu, który będzie przechowywać ta lista
        //Typ parametryzujący listę musi być obiektowy
        List<Float> myList = new ArrayList<>();
        //Dodanie do listy kolejnych elementów
        myList.add(120.05f);
        myList.add(141.11f);
        myList.add(150.17f);
        myList.add(150.17f);
        myList.add(150.17f);
        myList.add(12.1923f);

        //Wyświetlenie zawartości listy
        System.out.println(myList);

        //Pętla foreach, również wyświetla elementy listy
        for (Float f : myList) {
            System.out.print(f + ", ");
        }
        System.out.println(" ");

        //Wyświetlenie elemntów z podaniem ich indeksu
        System.out.println("Przed usunięciem pierwszego elementu");
        System.out.println(myList.get(0));
        System.out.println(myList.get(2));
        System.out.println(myList.get(myList.size() - 1));

        //Usunięcie elementu o idexie zero (pierwszy element)
        myList.remove(0);

        //Wyświetlenie elementów po usunięciu pierwszego elementu
        //Zwróć uwagę, że ArrayList samodzielnie zadbała, o reorganizacji swoich elementów
        //Elementy zostały przesunięte, na pozycję 0 wskoczył element z pozycji 1 (o 1 w tył dla wszystkich)
        System.out.println("Po usunięciu pierwszego elementu");
        System.out.println(myList.get(0));
        System.out.println(myList.get(2));
        //Dostęp do elemntu po idexie z użyciem rozmiaru listy -> size()
        System.out.println(myList.get(myList.size() - 1));

        //Usunięcie elementu, który występuje wielokrotnie
        //Usunięty zostanie tylko jeden taki element
        myList.remove(150.17f);

        //Wyświetlenie elementów, które pozostały w liście
        System.out.println(myList);


        //PRZYKŁAD DODATKOWY

        //Przykład klasy anonimowej
        //Sortujemy naszą listę za pomocą klasy anonimowej i metody sort()
        //Wykorzystany jest tutaj interfejs funkcyjny Comparator<T>
        //Podajemy implementacje metody compare(), która przedstawia sposób porównywania elementów
        myList.sort(new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                if (o1 - o2 > 0) {
                    return 1;
                } else if (o1 - o2 < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        //Wyświetlenie posortowanej listy
        System.out.println(myList);

        //To rozwiązanie jest tożsame z przedstawionym powyżej
        //Używamy tutaj gotowej metody compare z klasy Float
        //Zapis Float::compare jest referencją do metody
        myList.sort(Float::compare);

        //Ponowne wyświetlenie posortowanej listy
        System.out.println(myList);
    }

}
