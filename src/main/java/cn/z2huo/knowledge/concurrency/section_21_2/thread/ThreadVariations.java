package cn.z2huo.knowledge.concurrency.section_21_2.thread;

class ThreadVariations {

    public static void main(String[] args) {
        new InnerThread("inner thread");
        new InnerThread2("inner thread 2");
        new InnerRunnable("inner Runnable");
        new InnerRunnable2("inner Runnable 2");
        new ThreadMethod("thread method").runTask();
    }

}
