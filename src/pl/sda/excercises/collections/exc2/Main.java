package pl.sda.excercises.collections.exc2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Integer> myNumbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myNumbers.add(random.nextInt(101));
        }

        System.out.println(myNumbers);

        List<Integer> reversedList = new ArrayList<>();
        for (int i = myNumbers.size() - 1; i >= 0; i--) {
            reversedList.add(myNumbers.get(i));
        }

        System.out.println(reversedList);

        ListIterator<Integer> listIterator = myNumbers.listIterator();

        while(listIterator.hasNext()) {
            listIterator.next();
        }

        List<Integer> reversedIteratorList = new ArrayList<>();
        while (listIterator.hasPrevious()) {
            reversedIteratorList.add(listIterator.previous());
        }

        System.out.println(reversedIteratorList);

    }
}
