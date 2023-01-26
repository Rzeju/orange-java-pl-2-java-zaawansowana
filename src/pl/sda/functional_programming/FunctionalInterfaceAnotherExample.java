package pl.sda.functional_programming;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceAnotherExample {

    public static void main(String[] args) {


        Random random = new Random();
        Supplier<Integer> lottery = () -> random.nextInt(100 + 1);
        System.out.println(lottery.get());

        Function<Integer, Double> function = (number) -> Math.pow(number, 2);
        System.out.println(function.apply(10));

    }
}
