package pl.sda.concurrency.lottery;

public class Main {

    public static void main(String[] args) {

        //utworzenie obiektu Lotto
        Lotto lotto = new Lotto();
        //wywołanie metody start()
        //kod zostanie wykonany w wątku 'main'
        //w ten sposób nie uruchomimy oddzielnego wątku wykonującego operacje
        //musimy utworzyć obiekt Thread i wywołać metodę start()
        lotto.start(10);

        //utworzenie obiektów Thread na podstawie obiektów klasy anonimowej
        //Interface funkcyjny Runnable posiada jedną metodę abstrakcyjną run()
        //implementacja tej metody wywoła metodę start() z przekazanym parametrem na utworzonym obiekcie Lotto w osobnym wątku
        Runnable run_1 = () -> {
            lotto.start(10);
        };
        Thread thread_1 = new Thread(run_1);

        Runnable run_2 = () -> {
            lotto.start(12);
        };
        Thread thread_2 = new Thread(run_2);

        //uruchomienie utworzonych wątków
        //kolejne losowanie jest uruchamiane, dopiero po zakończeniu się poprzedniego
        //usuń 'synchronized' z metody start() w klasie Lotto i zobacz jak wpłynie to na wynik programu
        //losowania będą odbywać się na zmianę
        thread_1.start();
        thread_2.start();

    }
}
