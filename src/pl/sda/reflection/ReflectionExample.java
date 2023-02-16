package pl.sda.reflection;

import pl.sda.oop.abstract_classes.Honda;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample {

    public static void main(String[] args) {
        //blok try sprawdza, czy wystąpił wyjątek
        try {
            //uzyskanie dostępu do klasy poprzez classpath
            //poszukiwana klasa reprezentowana jest poprzez obiekt typu Class<?>
            //zapis '<?>' (wildcard) oznacza dowolny typ obiektu parametryzujący typ Class<?>
            //obiekt ten będzie zawierał informacje o wskazanej przez nas klasie Honda
            Class<?> hondaClass = Class.forName("pl.sda.oop.abstract_classes.Honda");
            //dostęp do konstruktora z klasy Honda
            //metoda getConstructor() rozpoznaje odpowiedni konstruktor po typach i kolejności parametrów konstruktora
            Constructor<?> constructor = hondaClass.getConstructor(String.class, String.class);
            //utworzenie obiektu Honda przez konstruktor
            //z powodu typu parametrycznego <?> musimy rzutować nasz obiekt na typ 'Honda'
            Honda honda = (Honda) constructor.newInstance("vin", "some model");
            //wypisanie na ekran wartości pól utworzonego obiektu
            //wartości te są zgodne z tymi przekazanymi w metodzie newInstance()
            System.out.println(honda.getModel());
            System.out.println(honda.getVin());

        //obsługa wyjątków mogących wystąpić po uruchomieniu kodu
        //każdy z bloków catch łapie konkretnych typ wyjątku i wypisuje informacje o nim na ekranie
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
