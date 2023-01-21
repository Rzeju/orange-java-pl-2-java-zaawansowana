package pl.sda.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedLIstExample {

    public static void main(String[] args) {

        List<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("1 String");
        myLinkedList.add("2 String");
        myLinkedList.add("3 String");
        myLinkedList.add("4 String");
        myLinkedList.add("5 String");

        for (String s : myLinkedList) {
            System.out.print(s + ", ");
        }

        System.out.println(" ");

        System.out.println((myLinkedList.get(3)));

        List<String> myArrayList = new ArrayList<>();
        for (String s : myLinkedList) {
            myArrayList.add(s);
        }
        myArrayList.clear();

        myArrayList.addAll(myLinkedList);
        myArrayList.clear();

        String[] myArray = {"3212312", "432asfasfsafa", "dsfsdfgds", "kahaskjdhas"};

        myArrayList.addAll(Arrays.asList(myArray));

    }
}
