package cn.z2huo.knowledge.concurrency.section_21_2.daemon;

import java.util.concurrent.ThreadFactory;

class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    }
}
