package cn.z2huo.knowledge.concurrent.section_21_2.runnable;

class BasicThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
//        thread.run();
        System.out.println("waiting for LiftOff");
    }
}
