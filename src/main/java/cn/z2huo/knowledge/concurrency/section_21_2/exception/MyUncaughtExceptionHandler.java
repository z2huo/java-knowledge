package cn.z2huo.knowledge.concurrency.section_21_2.exception;

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(">>> custom exception handler");
        System.err.println("caught " + e);
    }
}
