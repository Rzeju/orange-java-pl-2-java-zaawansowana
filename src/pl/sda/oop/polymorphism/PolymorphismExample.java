package pl.sda.oop.polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PolymorphismExample {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("MyString");
        myList.add("2");
        myList.add("Hehe");
        myList.add("Czesc");
        myList.add(null);


//        Scanner scanner = new Scanner(System.in);
//        String myLine = scanner.next();
//        myList.add(myLine);


        System.out.println(myList.size());
        System.out.println(myList.get(0));
        System.out.println(myList.get(2));
        System.out.println(myList.contains("Toooo"));
        System.out.println(myList);


        myList = new LinkedList<>();
        System.out.println(myList.size());
        System.out.println(myList);


    }
}
