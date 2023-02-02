package pl.sda.concurrency.atomics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        AtomicInteger atomicInteger = new AtomicInteger(0);

        List<Callable<Integer>> callableList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Callable<Integer> callable = () -> atomicInteger.addAndGet(1);
            callableList.add(callable);
        }

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<Integer>> myResponses = executorService.invokeAll(callableList);

        System.out.println(atomicInteger.get());

        for (Future<Integer> future : myResponses) {
            System.out.print(future.get() + " ");
        }

        executorService.shutdown();
    }
}
