package cn.z2huo.knowledge.concurrency.section_21_2.thread;

import java.util.concurrent.TimeUnit;

class ThreadMethod {

    private int countDown = 5;

    private Thread thread;

    private String name;

    public ThreadMethod(String name) {
        this.name = name;
    }

    public void runTask() {
        if (thread == null) {
            thread = new Thread(name) {
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
            };
            thread.start();
        }
    }
}
