package pl.sda.new_in_java_8_9.streams;

import java.util.List;
import java.util.function.BinaryOperator;

public class SteamExercise {

    public static void main(String[] args) {

        List<Integer> myNumbers = List.of(100, 0, 14, -54, -10, 17, 11, 234, 45, 456, 3, 10);

        int min_r = myNumbers.stream()
                .reduce(BinaryOperator.minBy(Integer::compareTo))
                .orElse(0);

        int min_rr = myNumbers.stream()
                .reduce((a, b) -> a - b <= 0 ? a : b)
                .orElse(0);

        int min_m = myNumbers.stream()
                .min(Integer::compareTo)
                .orElse(0);

        System.out.println(min_r);
        System.out.println(min_rr);
        System.out.println(min_m);
    }
}
