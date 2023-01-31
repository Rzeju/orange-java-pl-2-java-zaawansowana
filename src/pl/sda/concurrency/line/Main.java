package pl.sda.concurrency.line;

public class Main {

    public static void main(String[] args) {

        Line line = new Line();

        Runnable r1 = () -> {
            line.getLine(5, 1);
        };
        Thread thread1 = new Thread(r1);

        Runnable r2 = () -> {
            line.getLine(5, 2);
        };
        Thread thread2 = new Thread(r2);

        Runnable r3 = () -> {
            line.getLine(5, 3);
        };
        Thread thread3 = new Thread(r3);

        Runnable r4 = () -> {
            line.getLine(5, 4);
        };
        Thread thread4 = new Thread(r4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
