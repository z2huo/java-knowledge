package cn.bouncyslime.javaKnowledge.jvm.oom;

/**
 * 虚拟机栈和本地方法栈OOM测试
 * VM args
 * -Xss128k
 * @author bouncyslime
 * @date 2021/1/13
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.err.println("stack length: " + oom.stackLength);
            throw e;
        }
    }

}
