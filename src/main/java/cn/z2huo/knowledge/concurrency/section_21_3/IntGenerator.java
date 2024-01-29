package cn.z2huo.knowledge.concurrency.section_21_3;

abstract class IntGenerator {

    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }

}
