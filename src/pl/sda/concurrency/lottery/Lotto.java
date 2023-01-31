package pl.sda.concurrency.lottery;

import java.util.Random;

public class Lotto {

    public synchronized void start(int numberOfElement) {
        Random random = new Random();
        for (int i = 0; i < numberOfElement; i++) {
            int number = random.nextInt(49) + 1;
            System.out.println(Thread.currentThread().getName() + " -> number " +
                    (i + 1) + " is: " + number);
            String string = String.format("%s -> number %d is: %d\n",
                    Thread.currentThread().getName(), i + 1, number);
            System.out.println(string);
        }
    }
}
