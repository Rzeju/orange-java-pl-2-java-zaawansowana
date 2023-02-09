package pl.sda.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        //Utworzenie obiektu HashMap
        //Nasz obiekt typowany jest za pomocą interfejsu Map<K,V>
        //K - odnosię się do typu klucza w Mapie
        //V - odnosie się do typu wartości w Mapie
        //Nasza Mapa przechowuje w sobie pary w postaci KLUCZ-WARTOŚĆ / (String-Integer) / (Napisz-Liczba)
        //Warto doczytać o sposobie implementacji HashMapy
        //(szczególnie metody hashCode(), equals() oraz kontrakt hashCode-equals
        Map<String, Integer> ages = new HashMap<>();
        //dodanie do Mapy par klucz-wartość (imię-wiek)
        ages.put("Tadeusz", 40);
        ages.put("John", 30);
        ages.put("Adam", 20);
        ages.put("Jonasz", 20);
        //Mapa nie przetrzymuje w sobie duplikatów kluczy
        //Oznacza to, że pod danym kluczem może być przetrzymywana tylko jedna wartość
        //Dla klucza "Jadwiga" może istnieć tylko jedna liczba
        //W Mapie pozostanie jedynie ostatnio dodana wartość (tutaj 90)
        ages.put("Jadwiga", 70);
        ages.put("Jadwiga", 90);

        //Pętla for each wyświetlająca wszystkie klucze w Mapie
        //Kolejność kluczy nie musi być zgodna z kolejnością ich dodawania (kolejność kluczy jest losowa)
        //Metoda keySet() wraca Set zawierający klucze (Set nie zawiera w sobie duplikatów = w mapie nie może być dwóch taki samych kluczy)
        System.out.println("Keys: ");
        for (String s : ages.keySet()) {
            System.out.print(s + ", ");
        }

        System.out.println(" ");

        //Wyświetlenie wartości Mapy
        //Metoda values() zwraca wartości w Mapie (wartości mogą się powtarzać - takie same obiekty ale pod innym kluczem)
        System.out.println("Values: ");
        for (Integer i : ages.values()) {
            System.out.print(i + ", ");
        }

        //Pętla foreach wyświetla klucze wraz z powiązanymi wartościami
        //Zwróć uwagę, że para klucz-wartość w Mapie jest reprezentowana przez obiekty typu Map.Entry<K,V>
        //Metoda entrySet() zwraca wszystkie pary klucz-wartość zawarte w Mapie
        System.out.println("\nKlucz -> Wartość");
        for (Map.Entry<String, Integer> pair : ages.entrySet()) {
            System.out.print(pair.getKey() + " -> " + pair.getValue() + ", ");
        }

        //Wyświetlenie par klucz-wartość metodą foreach
        //Sposób wyświetlania został tutaj zapisany wyrażeniami Lambda
        System.out.println("\nKlucz -> Wartość (wyrażenia lambda)");
        ages.forEach((String k, Integer v) -> System.out.print(k + " -> " + v + ", "));
    }
}
