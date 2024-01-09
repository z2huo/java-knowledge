package cn.z2huo.knowledge.concurrency.section_21_2.exception;

class ExceptionThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println(">>> thread run");
        Thread thread = Thread.currentThread();
        System.out.println("run() by " + thread);
        System.out.println("eh = " + thread.getUncaughtExceptionHandler());
        throw new RuntimeException("thread " + thread.getName() + "throw a runtime exception");
    }
}
