package pl.sda.new_in_java_8_9.functional_programming;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceAnotherExample {

    public static void main(String[] args) {

        //Utworzenie obiektu Random
        Random random = new Random();

        //Utworzenie zmiennej za pomocą wyrażenia lambda
        //Typem tej zmiennej jest interface funkcyjny Supplier<T>
        //Posiada on jedną metodę abstrakcyjną get()
        //Metoda ta zwraca obiekt typu T i nie przyjmuje żadnego parametru
        //Interface z jedną metodą abstrakcyjną nazywamy interfacem funkcyjnym
        //W tym przypadku zapis () świadczy o braku argumenty przy wywołaniu metody get()
        //Zapis random.nextInt() zwraca losową liczbę, która zwrócona zostanie później przez metodę get()
        Supplier<Integer> lottery = () -> random.nextInt(100 + 1);
        //Wywołanie metody get() na naszej zmiennej
        //Metoda get() nie przyjmuje argumentu i wykonuje kod zdefiniowany w linii 21
        //Na ekranie pojawi się losowa liczba z zakresu 0-100
        System.out.println(lottery.get());

        //Przykład innego interface'u funkcyjnego
        //Function<T, R> posiada jedną metodę abstrakcyjną apply()
        //Metoda ta przyjmuje jeden argument typu T i zwraca obiekt typu R
        //W naszym przypadku metoda apply() będzie przyjmować argument typu Integer i zwracać typ Double
        //Zapis (number) świadczy o jednym argumencie o nazwie number
        //Następnie zdefiniowany jest kod, który zostanie uruchomiony po wywołaniu metody apply()
        //W wyniku otrzymamy typ Double zwracany przez metodę Math.pow()
        //Przekazana liczba number zostanie podniesiona do kwadratu
        Function<Integer, Double> function = (number) -> Math.pow(number, 2);
        //Wywołanie metody apply() z jednym argumentem
        //Na ekranie wyświetli się kwadrat liczby 10
        System.out.println(function.apply(10));

    }
}
