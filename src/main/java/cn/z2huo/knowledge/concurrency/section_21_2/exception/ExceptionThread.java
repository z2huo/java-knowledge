package cn.z2huo.knowledge.concurrency.section_21_2.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExceptionThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException("this is a runtime exception");
    }

    public static void main(String[] args) {
        try {
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.execute(new ExceptionThread());
            executorService.shutdown();
        } catch (Exception e) {
            System.err.println("throw a exception: " + e.getMessage());
        }

        try {
            Thread thread = new Thread(new ExceptionThread());
            thread.start();
        } catch (Exception e) {
            System.err.println("throw a exception: " + e.getMessage());
        }
    }
}
