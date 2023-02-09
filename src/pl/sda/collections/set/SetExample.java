package pl.sda.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        //Utworzenie obiektu HashSet
        //Zwróć uwagę na typowanie interfejsem tej zmiennej - Polimorfizm
        //Typ zmiennej to Set w związku z czym nasz obiekt udostępnia metody specyficzne dla tego Interface'u
        //Set nie przechowuje duplikatów obiektów. Próba dodania elementu, który już znajduje się w Set nie powiedzie się (już tak istnieje)
        Set<String> mySet = new HashSet<>();
        //Dodanie elementów do Seta
        //Do zmienny add zapisujemy wynik działania metody add()
        boolean add_1 = mySet.add("John");
        boolean add_2 = mySet.add("Tadeusz");
        boolean add_3 = mySet.add("Fritz");
        //Taki element został dodany do Set jako piwerszy
        //Metoda add() zwróci w tym przypadku "false" (taki element istnieje już w Set)
        boolean add_4 = mySet.add("John");
        mySet.add("Adam");

        //Wypisanie wyników działania metody add()
        //Dodanie elementu, który znajdował się już w Set zakończyło się niepowodzeniem
        System.out.println("Dodanie powiodło się -> " + add_1);
        System.out.println("Dodanie powiodło się -> " + add_4);

        //Wypisanie elementów Set
        System.out.println(mySet);

        //Wypisanie elementów Set za pomocą pętli foreach
        for (String s : mySet) {
            System.out.println(s);
        }

        //ZADANIE
        //Wypisz te liczby, które występują w tablicy przynajmniej dwa razy

        //Utworzenie tablicy zawierającej liczby - niektóre liczby powtarzają się
        int[] numbers = {2, 3, 4, 6, 2, 3, 4 , 1, 0, 3, 10};

        //Utworzenie obiektu HashSet
        //Będzie on zawierał liczby, które wystąpiły po raz pierwszy
        Set<Integer> myNumbers = new HashSet<>();

        //Utworzenie obiektu HashSet
        //Będzie on zawierał liczby, które wystąpiły więcej niż jeden raz
        Set<Integer> result = new HashSet<>();
        //Pętla foreach iterująca przez wszystkie elementy tablicy 'numbers'
        for (Integer number : numbers) {
            //Sprawdzenie czy Set 'myNumbers' zawiera daną liczbę - (czy taka liczba już wystąpiła?)
            //Jeżeli tak, dodaj ją do wyniku Set 'result' - ta liczbą występuje przynajmniej dwa razy
            //Jeżeli nie, dodaj ją do Set 'myNumbers' - Set ten przechowuje te liczby, które wystąpiły po raz pierwszy
            if (myNumbers.contains(number)) {
                //Dodanie liczby, która wystąpiła w tablicy po raz pierwszy
                result.add(number);
            } else {
                //Dodanie liczby, która wystąpiła w tablicy kolejny raz (dana liczb może wystąpić w tablicy więcej niż 2 razy)
                //W naszym przypadku liczba 3 występuje w tablicy trzykrotnie
                //Jako, że Set nie przetrzymuje duplikatów, każda liczba, która występuje w tablicy więcej niż 2 razy zostanie dodana do Set tylko raz
                //Ten fakt ułatwia rozwiązanie zadania, nie musimy sprawdzać czy dana liczba znajduje się już w naszym wyniku
                myNumbers.add(number);
            }
        }

        //Wyświetlenie wyniku - liczby, które występują w tablicy więcej niż 1 raz
        System.out.println(result);
    }
}
