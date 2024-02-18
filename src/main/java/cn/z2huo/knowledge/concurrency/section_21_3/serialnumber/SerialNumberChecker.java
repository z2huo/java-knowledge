package cn.z2huo.knowledge.concurrency.section_21_3.serialnumber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SerialNumberChecker {

    private static final int SIZE = 10;

    private static CircularSet serials = new CircularSet(1000);

    private static ExecutorService executorService = Executors.newCachedThreadPool();

    static class SerialChecker implements Runnable {
        @Override
        public void run() {
            while (true) {
                int serial = SerialNumberGenerator.nextSerialNumber();
                if (serials.contains(serial)) {
                    System.out.println("Duplicate: " + serial);
                    System.exit(0);
                }
                serials.add(serial);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < SIZE; i++) {
            executorService.execute(new SerialChecker());
        }
        if (args.length > 0) {
            TimeUnit.SECONDS.sleep(Integer.parseInt(args[0]));
            System.out.println("no duplicates detected");
            System.exit(0);
        }
    }

}
