package cn.z2huo.knowledge.concurrency.section_21_2.thread;

class InnerThread2 {

    private int countDown = 5;

    private Thread thread;

    /**
     * <p>匿名内部类
     */
    public InnerThread2(String name) {
        thread = new Thread(name) {

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
        };
        thread.start();
    }

}
