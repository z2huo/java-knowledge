package cn.z2huo.knowledge.concurrency.section_21_2.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}
