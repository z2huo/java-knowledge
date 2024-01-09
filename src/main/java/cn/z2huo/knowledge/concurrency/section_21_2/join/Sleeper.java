package cn.z2huo.knowledge.concurrency.section_21_2.join;

class Sleeper extends Thread {

    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " run() start");
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted, " + "isInterrupted(): " + isInterrupted());
            return;
        }
        System.out.println(getName() + " run() end");
//        System.out.println(getName() + " has awakened");
    }
}
