package cn.z2huo.knowledge.concurrency.section_21_2.thread;

import java.util.concurrent.TimeUnit;

class InnerRunnable2 {

    private int countDown = 5;

    private Thread thread;

    public InnerRunnable2(String name) {
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println(this);
                        if (--countDown == 0) {
                            return;
                        }
                        TimeUnit.SECONDS.sleep(1);
                    }
                } catch (InterruptedException e) {
                    System.err.println("interrupted");
                }
            }

            @Override
            public String toString() {
                return thread.getName() + ": " + countDown;
            }
        }, name);
        thread.start();
    }

}
