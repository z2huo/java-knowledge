package cn.z2huo.knowledge.concurrency.section_21_2.daemon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ADaemon implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("starting ADaemon");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("this should always run?");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Thread thread = new Thread(new ADaemon());
        thread.setDaemon(true);
        executorService.execute(thread);
        executorService.shutdown();

        ExecutorService executorService2 = Executors.newCachedThreadPool(new DaemonThreadFactory());
        executorService2.execute(new ADaemon());
        executorService2.shutdown();

//        Thread thread = new Thread(new ADaemon());
//        thread.setDaemon(true);
//        thread.start();
    }
}
