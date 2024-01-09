package cn.z2huo.knowledge.concurrency.section_21_2.daemon;

import java.util.concurrent.TimeUnit;

class Daemon implements Runnable {

    private Thread[] threads = new Thread[10];

    @Override
    public void run() {
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new DaemsonSpawn());
            threads[i].start();
            System.out.println("DaemsonSpawn " + i + " started, ");
        }
        for (int i = 0; i < threads.length; i++) {
            System.out.println("threads[" + i + "].isDaemon() = " + threads[i].isDaemon() + ", ");
        }
        while (true) {
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Daemon());
        thread.setDaemon(true);
        thread.start();
        System.out.println("thread.isDaemon() = " + thread.isDaemon() + ", ");
        TimeUnit.SECONDS.sleep(5);
    }
}
