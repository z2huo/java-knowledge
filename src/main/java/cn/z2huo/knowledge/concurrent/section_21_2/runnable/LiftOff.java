package cn.z2huo.knowledge.concurrent.section_21_2.runnable;

class LiftOff implements Runnable {

    protected int countDown = 10;

    private static int taskCount = 0;

    /**
     * 用来区分任务的多个示例，final类型，初始化后不会被修改
     */
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id
                + " (" + (countDown > 0 ? countDown : "liftoff!") + "), ";
    }

    /**
     * <p>任务的run方法通常总会有某种形式的循环，使得任务一直运行下去直到不再需要
     * <p>您可能需要安全地终止线程
     */
    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        LiftOff liftOff = new LiftOff();
        liftOff.run();
    }

}
