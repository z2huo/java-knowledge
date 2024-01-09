package cn.z2huo.knowledge.concurrency.section_21_2.callable;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Deque<Future<String>> results = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            results.add(executorService.submit(new TaskWithResult(i)));
        }
        for (Future<String> result : results) {
            try {
                System.out.println(result.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            } finally {
                executorService.shutdown();
            }
        }

//        do {
//            Future<String> future = results.poll();
//            while (!future.isDone()) {
//                System.out.println("future is not done");
//                results.push(future);
//                future = results.poll();
//            }
//            try {
//                System.out.println("future is done, result is " + future.get());
//            } catch (InterruptedException | ExecutionException e) {
//                throw new RuntimeException(e);
//            } finally {
//                executorService.shutdown();
//            }
//        } while (!results.isEmpty());
    }
}
