package pl.sda.concurrency.callable_future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //Utworzenie listy obiektów Callable<Integer>
        //Obiekty Callable są podobne to obiektów Runnable
        //Mogą jednak zwracać wartość i rzucać wyjątek
        //Używane przy operacjach wielowątkowych
        //Symbolizują pewną operację do wykonania w oddzielnym wątku
        List<Callable<Integer>> callableList = new ArrayList<>();

        //utworzenie 100 obiektów Callable<Integer>
        for(int i = 0; i < 100; i++) {
            //każdy z obiektów będzie wywoływał metodę increment() i zwiększał licznik 'counter' o 1
            Callable<Integer> callable = DataBase::increment;
            //dodanie obiektu do listy
            callableList.add(callable);
        }

        //utworzenie ExecutorService
        //uruchomi on nasze obiekty Callable<Integer> w zdefiniowanej przez nas puli wątków
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //wywołanie obiektów z List<Callable<Integer>>
        //wyniki każdego wywołania zapisywane są w liście List<Future<Integer>>
        //obiektu Future reprezentują wyniki operacji asynchronicznych - wielowątkowych
        List<Future<Integer>> myResponses = executorService.invokeAll(callableList);

        //wypisanie wartości licznika po wszystkich operacja
        //jego wartość jest zgodna z oczekiwaną i wynosi 100
        System.out.println(DataBase.getCounter());

        //wyświetlenie wyników wszystkich operacji Callable z listy
        //ich kolejność jest zgodna z zakończenie pracy poszczególnych wątków
        //ta kolejność nie musi być zgodna z przewidywaniami
        for (Future<Integer> future : myResponses) {
            System.out.print(future.get() + " ");
        }

        //zamknięcie executorService
        executorService.shutdown();
    }
}
