package pl.sda.concurrency.dinner;

public class Main {

    public static void main(String[] args) {


        Dinner dinner = new Dinner();

        Runnable r1 = () -> {
            dinner.waitForDinner();
            dinner.prepareDinner();
        };
        Runnable r2 = () -> {
            dinner.waitForDinner();
            dinner.prepareDinner();
        };
        Runnable r3 = () -> {
            dinner.waitForDinner();
            dinner.prepareDinner();
        };
        Runnable r4 = () -> {
            dinner.waitForDinner();
            dinner.prepareDinner();
        };

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        Thread thread3 = new Thread(r3);
        Thread thread4 = new Thread(r4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        dinner.prepareDinner();

    }
}
