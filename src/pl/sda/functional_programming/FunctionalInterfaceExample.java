package pl.sda.functional_programming;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnabla, klasa anonimowa");
            }
        };

        Runnable runnableLambda = () -> System.out.println("Runnable, lambda");

        runnable.run();
        runnableLambda.run();

        Predicate<String> myPredicate = (s) -> s.equals("Test");
        boolean result = myPredicate.test("Hej");
        System.out.println(result);

        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("CZESC");
    }
}
