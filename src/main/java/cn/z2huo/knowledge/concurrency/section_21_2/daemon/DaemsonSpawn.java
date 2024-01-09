package cn.z2huo.knowledge.concurrency.section_21_2.daemon;

class DaemsonSpawn implements Runnable {
    @Override
    public void run() {
        while (true) {
            Thread.yield();
        }
    }
}
