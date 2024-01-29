package cn.z2huo.knowledge.concurrency.section_21_3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MutexEvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    private final Lock lock = new ReentrantLock();

    @Override
    public int next() {
        lock.lock();
        try {
            currentEvenValue++;
            Thread.yield();
            currentEvenValue++;
            return currentEvenValue;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexEvenGenerator());
    }

}
