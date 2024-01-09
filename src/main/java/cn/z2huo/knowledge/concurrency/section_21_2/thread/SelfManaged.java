package cn.z2huo.knowledge.concurrency.section_21_2.thread;

class SelfManaged implements Runnable {

    private int countDown = 5;

    private Thread thread = new Thread(this);

    public SelfManaged() {
        thread.start();
    }

    @Override
    public String toString() {
        return "#" + Thread.currentThread().getName() + "(" + countDown + "), ";
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
            new SelfManaged();
        }
    }
}
