package pl.sda.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        boolean add_1 = mySet.add("John");
        boolean add_2 = mySet.add("Tadeusz");
        boolean add_3 = mySet.add("Fritz");
        boolean add_4 = mySet.add("John");
        mySet.add("Adam");

        System.out.println("Dodanie powiodło się -> " + add_1);
        System.out.println("Dodanie powiodło się -> " + add_4);

        System.out.println(mySet);

        for (String s : mySet) {
            System.out.println(s);
        }

        int[] numbers = {2, 3, 4, 6, 2, 3, 4 , 1, 0, 3, 10};

        Set<Integer> myNumbers = new HashSet<>();

        Set<Integer> result = new HashSet<>();
        for (Integer number : numbers) {
            if (myNumbers.contains(number)) {
                result.add(number);
            } else {
                myNumbers.add(number);
            }
        }
    }
}
