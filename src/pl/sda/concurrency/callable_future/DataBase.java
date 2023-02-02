package pl.sda.concurrency.callable_future;

public class DataBase {

    private static int counter = 0;

    public static synchronized int increment() throws InterruptedException {
        int result = counter + 1;
        Thread.sleep(100);
        counter = result;
        return counter;
    }

    public static int getCounter() {
        return counter;
    }
}
