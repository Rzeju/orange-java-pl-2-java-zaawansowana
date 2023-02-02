package pl.sda.concurrency.callable_future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        List<Callable<Integer>> callableList = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            Callable<Integer> callable = DataBase::increment;
            callableList.add(callable);
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Integer>> myResponses = executorService.invokeAll(callableList);

        System.out.println(DataBase.getCounter());

        for (Future<Integer> future : myResponses) {
            System.out.print(future.get() + " ");
        }

        executorService.shutdown();
    }
}
