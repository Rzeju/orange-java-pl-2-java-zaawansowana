package pl.sda.concurrency.dinner;

public class Main {

    public static void main(String[] args) {

        Dinner dinner = new Dinner();

        Runnable r = () -> {
            dinner.waitForDinner();
            dinner.prepareDinner();
        };

        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(r);
        Thread thread3 = new Thread(r);
        Thread thread4 = new Thread(r);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        dinner.prepareDinner();

    }
}
