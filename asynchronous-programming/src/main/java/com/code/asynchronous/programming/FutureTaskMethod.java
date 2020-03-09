package main.java.com.code.asynchronous.programming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTaskMethod {

    private static void method()
    {
        while(true) {

        }
    }

    public static void main(String[] args) {

        ExecutorService threadpool = Executors.newCachedThreadPool();
        Future<Long> futureTask = threadpool.submit(() -> {
            while(true) {

            }
        });

        while(!futureTask.isDone()) {
            System.out.println("FutureTask is not finished yet...");
        }

        long result = futureTask.get();

        threadpool.shutdown();
    }
}
