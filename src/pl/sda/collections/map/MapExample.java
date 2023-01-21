package pl.sda.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();
        ages.put("Tadeusz", 40);
        ages.put("John", 30);
        ages.put("Adam", 20);
        ages.put("Jadwiga", 70);
        ages.put("Jadwiga", 90);

        System.out.println("Keys: ");
        for (String s : ages.keySet()) {
            System.out.print(s + ", ");
        }

        System.out.println(" ");
        System.out.println("Values: ");
        for (Integer i : ages.values()) {
            System.out.print(i + ", ");
        }

        System.out.println("\nKlucz -> Wartość");
        for (Map.Entry<String, Integer> pair : ages.entrySet()) {
            System.out.print(pair.getKey() + " -> " + pair.getValue() + ", ");
        }

        System.out.println("\nKlucz -> Wartość (wyrażenia lambda)");
        ages.forEach((String k, Integer v) -> System.out.print(k + " -> " + v + ", "));
    }
}
