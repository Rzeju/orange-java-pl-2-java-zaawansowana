package pl.sda.concurrency.dinner;

public class Dinner {

    boolean isDinnerReady = false;

    public synchronized void waitForDinner() {
        while (!isDinnerReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Enjoy Your meal!");
        isDinnerReady = false;
    }

    public synchronized void prepareDinner() {
        System.out.println("Dinner preparing");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isDinnerReady = true;
        notify();
    }
}
