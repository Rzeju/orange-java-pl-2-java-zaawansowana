package pl.sda.concurrency.lottery;

public class Main {

    public static void main(String[] args) {

        Lotto lotto = new Lotto();
        lotto.start(10);

        Runnable run_1 = () -> {
            lotto.start(10);
        };
        Thread thread_1 = new Thread(run_1);
        thread_1.start();

        Runnable run_2 = () -> {
            lotto.start(12);
        };
        Thread thread_2 = new Thread(run_2);
        thread_2.start();



    }
}
