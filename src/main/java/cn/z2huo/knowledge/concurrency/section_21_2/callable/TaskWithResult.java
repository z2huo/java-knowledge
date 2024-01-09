package cn.z2huo.knowledge.concurrency.section_21_2.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

class TaskWithResult implements Callable<String> {

    private final int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
//        TimeUnit.SECONDS.sleep(5);
        if (id == 5) {
            TimeUnit.SECONDS.sleep(5);
        }
        return "result of TaskWithResult " + id;
    }

    public static void main(String[] args) throws Exception {
        TaskWithResult taskWithResult = new TaskWithResult(1);
        String result = taskWithResult.call();
        System.out.println(result);
    }

}
