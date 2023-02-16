package pl.sda.concurrency.dinner;

public class Main {

    public static void main(String[] args) {

        //utworzenie obiektu Dinner
        Dinner dinner = new Dinner();

        //obiekt klasy anonimowej
        //Interface funkcyjny runnable posiada jedną metodę abstrakcyjną run()
        //Podaje implementacje, którą ma wykonać
        //Obiekty typu Thread przyjmują w konstruktorze obiekt typu Runnable
        Runnable r = () -> {
            //oczekiwanie na obiad
            dinner.waitForDinner();
            //przygotowanie obiadu
            dinner.prepareDinner();
        };

        //utworzenie obiektu typu Thread na podstawie obiektu klasy anonimowej typu Runnable
        //przypisanie nazwy dla utworzonego obiektu Thread
        Thread thread1 = new Thread(r);
        thread1.setName("thread1");
        //utworzenie obiektu typu Thread na podstawie obiektu klasy anonimowej typu Runnable
        //przypisanie nazwy dla utworzonego obiektu Thread
        Thread thread2 = new Thread(r);
        thread2.setName("thread2");
        //utworzenie obiektu typu Thread na podstawie obiektu klasy anonimowej typu Runnable
        //przypisanie nazwy dla utworzonego obiektu Thread
        Thread thread3 = new Thread(r);
        thread3.setName("thread3");
        //utworzenie obiektu typu Thread na podstawie obiektu klasy anonimowej typu Runnable
        //przypisanie nazwy dla utworzonego obiektu Thread
        Thread thread4 = new Thread(r);
        thread4.setName("thread4");

        //uruchomienie utworzonych wątków
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
