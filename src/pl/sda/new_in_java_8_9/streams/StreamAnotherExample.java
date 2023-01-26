package pl.sda.new_in_java_8_9.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAnotherExample {

    public static void main(String[] args) {

        List<String> names = List.of("Daniel", "Mateusz", "Jadwiga", "Paulina", "Edward", "Anna", "Beata", "Zygmunt");

        names.stream()
                .filter(s -> s.length() > 5)
                .forEach(s -> System.out.print(s + ", "));

        System.out.println(" ");
        List<String> sortedNames = names.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println("Wynik sortowania");
        sortedNames.forEach(s -> System.out.print(s + ", "));
    }
}
