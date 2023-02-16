package pl.sda.concurrency.lottery;

import java.util.Random;

public class Lotto {

    //metody synchronizowana w klasie Lotto
    public synchronized void start(int numberOfElement) {
        //utworzenie obiektu Random
        Random random = new Random();
        //pętla wypisująca wylosowane liczby wraz z nazwą wątku, który wykonuje ten kod
        //liczba losowań zależy od przekazanego parametru 'numberOfElement'
        for (int i = 0; i < numberOfElement; i++) {
            //losowanie liczby z zakresu od 1 do 50
            int number = random.nextInt(50) + 1;
            //wypisanie wylosowanej liczby wraz z nazwą wątku wykonującego kod
            System.out.println(Thread.currentThread().getName() + " -> number " +
                    (i + 1) + " is: " + number);
            //powtórne wypisanie wylosowanej liczby wraz z nazwą wątku wykonującego kod
            String string = String.format("%s -> number %d is: %d\n",
                    Thread.currentThread().getName(), i + 1, number);
            System.out.println(string);
        }
    }
}
