package cn.z2huo.knowledge.concurrency.section_21_2.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CaptureUncaughException {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool(new HandlerThreadFactory());
        executorService.execute(new ExceptionThread2());
        executorService.shutdown();
    }
}
