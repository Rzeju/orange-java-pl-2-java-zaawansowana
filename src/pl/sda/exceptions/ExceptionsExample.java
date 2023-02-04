package pl.sda.exceptions;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionsExample {

    public static void main(String[] args) throws FileNotFoundException {

        List<String> myList = new ArrayList<>();
        myList.add("Hello");

        try {
            System.out.printf("Value at index 3: %s%n", myList.get(3));
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Blok catch");
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Ten blok wykona się zawsze! Niezależnie od tego czy wyjątek zostanie rzucony");
        }

        //myList.get(3);


        System.out.println("TO SIĘ NIE WYKONA");

        int x = ExceptionTest.testException(new int[10], 15);
    }
}
