package pl.sda.new_in_java_8_9.functional_programming;

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

        Predicate<String> myPredicate_1 = (s) -> s.equals("Test");
        boolean result_1 = myPredicate_1.test("Hej");
        System.out.println(result_1);

        Predicate<String> myPredicate_2 = myPredicate_1.or((s) -> s.equals("Hej"));
        boolean result_2 = myPredicate_2.test("Hej");
        System.out.println(result_2);

        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("CZESC");
    }
}
