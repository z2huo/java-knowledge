package cn.z2huo.knowledge.concurrency.section_21_2.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SettingDefaultHandler {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new ExceptionThread2());
        executorService.shutdown();
    }
}
