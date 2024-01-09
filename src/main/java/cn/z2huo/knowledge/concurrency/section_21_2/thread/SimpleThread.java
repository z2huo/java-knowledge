package cn.z2huo.knowledge.concurrency.section_21_2.thread;

class SimpleThread extends Thread {

    private int countDown = 5;

    private static int threadCount = 0;

    public SimpleThread () {
        super(Integer.toString(++threadCount));
        // 在构造器中启动线程
        start();
    }

    @Override
    public String toString() {
        return "#" + getName() + "(" + countDown + "), ";
    }

    @Override
    public void run() {
        while (true) {
            System.out.print(this);
            if (--countDown == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpleThread();
        }
    }
}
