package corejava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorsServiceExample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        ThreadPoolExecutor tpe = (ThreadPoolExecutor) es;
        Runnable r = () -> {
            System.out.println(tpe.getActiveCount());
//            Thread.currentThread().interrupt();
//            if (!Thread.currentThread().isInterrupted()) {
//                for (int i = 0; i < 10000; i++) {
//                    System.out.println("Hello");
//                }
//            }
        };

        es.execute(r);
        es.awaitTermination(5000, TimeUnit.MILLISECONDS);
        es.shutdown();
        System.out.println(tpe.getActiveCount());
    }
}
