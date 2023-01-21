package pl.sda.reflection;

import pl.sda.oop.abstract_classes.Honda;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample {

    public static void main(String[] args) {
        try {
            Class<?> hondaClass = Class.forName("pl.sda.oop.abstract_classes.Honda");
            Constructor constructor = hondaClass.getConstructor(String.class, String.class);
            Honda honda = (Honda) constructor.newInstance("vin", "jhjh");
            System.out.println(honda.getModel());
            System.out.println(honda.getVin());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println("Inna rodzaj obsługi błędu");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
