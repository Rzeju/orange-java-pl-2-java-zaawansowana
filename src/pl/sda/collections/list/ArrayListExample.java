package pl.sda.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<Float> myList = new ArrayList<>();
        myList.add(120.05f);
        myList.add(141.11f);
        myList.add(150.17f);
        myList.add(150.17f);
        myList.add(150.17f);
        myList.add(12.1923f);

        System.out.println(myList);

        for (Float f : myList) {
            System.out.print(f + ", ");
        }
        System.out.println(" ");

        System.out.println("Przed usunięciem pierwszego elementu");
        System.out.println(myList.get(0));
        System.out.println(myList.get(2));
        System.out.println(myList.get(myList.size() - 1));

        myList.remove(0);

        System.out.println("Po usunięciu pierwszego elementu");
        System.out.println(myList.get(0));
        System.out.println(myList.get(2));
        System.out.println(myList.get(myList.size() - 1));

        myList.remove(150.17f);

        System.out.println(myList);


        //PRZYKŁAD DODATKOWY
        myList.sort(new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                if (o1 - o2 > 0) {
                    return 1;
                } else if (o1 - o2 < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        //Powyższe długie rozwiązanie jest tożsame z tym -> Float::compare
        myList.sort(Float::compare);

        System.out.println(myList);
    }

}
