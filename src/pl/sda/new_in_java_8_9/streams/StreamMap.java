package pl.sda.new_in_java_8_9.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args) {

        List<String> stringList = List.of("Daniel", "Mateusz", "Jadwiga", "Paulina", "Edward", "Anna", "Beata", "Zygmunt");

        Map<String, Integer> namesWithLength = stringList.stream()
                .collect(Collectors.toMap(String::new, String::length));

        namesWithLength.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
