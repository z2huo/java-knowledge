package cn.z2huo.knowledge.jvm.oom;

/**
 * 创建线程导致内存溢出异常
 * 测试这个可能会导致系统假死，书中是这样说的：
 * 在windows平台的虚拟机中，Java的线程是映射到操作系统的内核线程上的，实际反映为CPU占用率100%
 * VM args
 * -Xss2M
 * @author bouncyslime
 * @date 2021/1/14
 */
public class JavaVMStackOOM {
    private void dontStop(){
        while (true){

        }
    }

    public void stackLeakByThread(){
        while (true) {
            Thread thread = new Thread(this::dontStop);
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
