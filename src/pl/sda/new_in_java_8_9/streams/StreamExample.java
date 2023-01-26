package pl.sda.new_in_java_8_9.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> myNumbers = List.of(100, 0 , 14, -54, -10, 17, 11, 234, 45, 456, 3, 10);

        List<Integer> sortedNumbers = myNumbers.stream()
                .sorted()
                .collect(Collectors.toList());

        sortedNumbers.forEach(s -> System.out.print(s + ", "));
        sortedNumbers.forEach(System.out::println);

    }
}
