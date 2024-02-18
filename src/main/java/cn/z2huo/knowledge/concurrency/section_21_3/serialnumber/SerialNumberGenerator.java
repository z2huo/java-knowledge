package cn.z2huo.knowledge.concurrency.section_21_3.serialnumber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 不知道这个例子在写什么
 */
class SerialNumberGenerator implements Runnable {

    private static volatile int serialNumber = 0;

    public static int nextSerialNumber() {
        return serialNumber++;
    }

    @Override
    public void run() {
        System.out.println(nextSerialNumber());
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new SerialNumberGenerator());
        executorService.execute(new SerialNumberGenerator());
        TimeUnit.SECONDS.sleep(5);
        System.exit(0);
    }

}
