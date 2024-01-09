package cn.z2huo.knowledge.concurrency.section_21_2.thread;

class InnerThread {

    private int countDown = 5;

    private Inner inner;

    /**
     * <p>内部类，继承自Thread
     */
    private class Inner extends Thread {
        Inner (String name) {
            super(name);
            start();
        }

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    if (--countDown == 0) {
                        return;
                    }
                    sleep(100);
                }
            } catch (InterruptedException e) {
                System.err.println("interrupted");
            }
        }

        @Override
        public String toString() {
            return getName() + ": " + countDown;
        }
    }

    public InnerThread(String name) {
        inner = new Inner(name);
    }

}
