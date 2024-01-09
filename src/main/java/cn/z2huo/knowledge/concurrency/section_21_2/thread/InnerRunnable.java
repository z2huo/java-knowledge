package cn.z2huo.knowledge.concurrency.section_21_2.thread;

import java.util.concurrent.TimeUnit;

class InnerRunnable {

    private int countDown = 5;

    private Inner inner;

    /**
     * <p>内部类，实现Runnable接口
     */
    private class Inner implements Runnable {

        Thread thread;

        Inner(String name) {
            thread = new Thread(this, name);
            thread.start();
        }

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
    }

    public InnerRunnable(String name) {
        inner = new Inner(name);
    }

}
