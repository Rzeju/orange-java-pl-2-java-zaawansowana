package pl.sda.concurrency.callable_future;

public class DataBase {

    private static volatile int counter = 0;

    public static int increment() throws InterruptedException {
        int result = counter + 1;
        //Thread.sleep(100);
        counter = result;
        return counter;
    }

    public static int getCounter() {
        return counter;
    }

    public static String getCounter(int x) {
        return "";
    }

    public static void getCounter(Integer x) {

    }

    public static DataBase getCounter(Integer x, String s) {
        return new DataBase();
    }
}
