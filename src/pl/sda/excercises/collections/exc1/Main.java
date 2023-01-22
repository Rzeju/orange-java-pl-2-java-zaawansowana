package pl.sda.excercises.collections.exc1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyObject[] myObjects = new MyObject[10];

        for (int i = 0; i < myObjects.length; i++) {
            String name = "Object-" + (i + 1);
            MyObject myObject = new MyObject(name);
            myObjects[i] = myObject;
        }

        List<MyObject> myList = new ArrayList<>();
        for (MyObject myObject : myObjects) {
            myList.add(myObject);
        }

        List<MyObject> subList = myList.subList(4, 7);
        myList.removeAll(subList);
        System.out.println(myList);

        //Inny sposób rozwiązania
        List<MyObject> myObjectList = new ArrayList<>(List.of(myObjects));
        List<MyObject> myObjectSubList = myObjectList.subList(1, 9);
        myObjectList.removeAll(myObjectSubList);
        System.out.println(myObjectList);

        List<MyObject> clearTest = new ArrayList<>(List.of(myObjects));
        clearTest.subList(3,9).clear();
        System.out.println(clearTest);
    }
}
