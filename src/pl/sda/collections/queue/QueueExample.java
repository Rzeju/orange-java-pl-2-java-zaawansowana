package pl.sda.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        //Utworzenie obiektu LinkedList
        //Zwróć uwagę na typowanie interfejsem tej zmiennej - Polimorfizm
        //Typ zmiennej Queue<String> informuje nas o tym, że ten obiekt udostępnia metody specyficzne dla kolejki
        //Klasa LinkedList implementuje Interface Queue. Oznacza to, że posiadam implementacje metod wymaganych przed ten Interface
        //Na naszej zmiennej będzie mogli używać metod dostępnych w Interface Queue
        Queue<String> myQueue = new LinkedList<>();
        //Dodanie elementów do kolejki
        myQueue.offer("1");
        myQueue.offer("2");
        myQueue.offer("3");
        myQueue.offer("4");
        myQueue.offer("5");

        //Wyświetlenie zawartości kolejki
        System.out.println(myQueue);
        //Zwrócenie pierwszego elementu kolejki (head)
        //Metoda peek() zwraca pierwszy element, ale nie usuwa go z kolejki
        //Jeżeli kolejka jest pusta metoda zwraca null
        System.out.println(myQueue.peek());
        //Zwrócenie pierwszego elementu kolejki (head)
        //Metoda poll() zwraca pierwszy element i usuwa go z kolejki
        System.out.println(myQueue.poll());
        //Zwrócenie pierwszego elementu kolejki (head)
        //Metoda element() zwraca pierwszy element ale nie usuwa go z kolejki
        //Jeżeli kolejka jest pusta metoda rzuca wyjątek NoSuchElementException
        System.out.println(myQueue.element());
        //Wyświetlenie pozostałych elementów kolejki
        //Zwróć uwagę, że został usunięty tylko jeden element - "1"
        //Jedynie metoda poll usuwa z kolejki element, który zwraca
        System.out.println(myQueue);

    }
}
