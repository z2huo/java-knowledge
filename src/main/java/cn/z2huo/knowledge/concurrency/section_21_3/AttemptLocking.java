package cn.z2huo.knowledge.concurrency.section_21_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AttemptLocking {

    private final Lock lock = new ReentrantLock();

    public void untimed() {
        boolean captured = lock.tryLock();
        try {
            System.out.println("tryLock(): " + captured);
        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }

    public void timed() {
        boolean captured = false;
        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("tryLock(2s): " + captured);
        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AttemptLocking attemptLocking = new AttemptLocking();
        attemptLocking.untimed();
        attemptLocking.timed();

        Thread thread = new Thread(() -> {
            attemptLocking.lock.lock();
            System.out.println("acquired");
        });
        thread.setDaemon(true);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(thread);
        TimeUnit.SECONDS.sleep(1);
//        Thread.yield();
        attemptLocking.untimed();
        attemptLocking.timed();
        executorService.shutdown();
    }

}
