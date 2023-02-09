package pl.sda.in_out.buffor;

import java.nio.CharBuffer;
import java.util.Arrays;

public class BufferExample {

    public static void main(String[] args) {

        //Utworzenie bufora dla zmiennych typu char o rozmiarze 8
        CharBuffer buffer = CharBuffer.allocate(8);
        //tekst, który zostanie wpisnay do buffora
        String text = "String";
        //Wyświetlenie tekstu
        System.out.println("Input text: " + text);

        //pętla wpisująca kolejne znaki tesktu do buffora
        for (int i = 0; i < text.length(); i++) {
            //pobieramy z tekstu kolejną literę
            char c = text.charAt(i);
            //umieszczamy pobraną literę w bufforze
            buffer.put(c);
        }

        //wyświetlenie zawartości buffora
        //zawartość buffora jest zwracana jako tablica metodą array()
        //zwróć uwagę na dwa ostatnie znaki, nie zostały one wypełnione ponieważ nasz tekst był krótszy niż 8 znaków (krótszy niż pojemność buffora)
        System.out.println("Buffer data: " + Arrays.toString(buffer.array()));

        //Wypisanie obecnej pozycji buffora
        //dodaliśmy 6 znaków. Licząc od 0 pierwsza wolna pozycja z bufforze to 6 stąd wynik tej metody
        System.out.println(buffer.position());
        //dodanie 2 kolejnych znaków do buffora
        buffer.append('!');
        buffer.append('?');
        //Wypisanie obecnej pozycji buffora. Jeżeli pozycja buffora jest równa jego rozmiarowi oznacza to, że buffor jest pełen
        System.out.println(buffer.position());
        //przygotowanie buffora do przyjęcia nowej porcji danych
        buffer.clear();

        //Dodanie nowej wartości metodą put() - jest to szybszy sposób niż pętla for
        buffer.put("NewIn");
        //Zwrócenie pozycji buffora po dodaniu nowych danych
        System.out.println(buffer.position());
        //Wypisanie zawartości buffora
        //Metoda array() zwraca zawartość buffora w postaci tablicy
        //Zwróć uwagę, że dwa ostatnie znaki (!, ?) pozostały w bufforze
        //Metoda clear() nie usuwa danych aktualnie znajdujących się w bufforze
        System.out.println(Arrays.toString(buffer.array()));
    }
}
