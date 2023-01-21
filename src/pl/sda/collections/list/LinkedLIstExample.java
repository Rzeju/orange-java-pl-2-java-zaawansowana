package pl.sda.collections.list;

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

    }
}
