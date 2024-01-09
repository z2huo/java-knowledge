package cn.z2huo.knowledge.concurrent.section_21_2.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FixedThreadPoll {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
        executorService.execute(new LiftOff());
        System.out.println("Waiting for LiftOff");
    }
}
