package pl.sda.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionsExample {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Hello");

        try {
            System.out.printf("Value at index 3: %s%n", myList.get(3));
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Blok catch");
            System.out.println(exception.getMessage());
        }

        myList.get(3);


        System.out.println("TO SIĘ NIE WYKONA");
    }
}
