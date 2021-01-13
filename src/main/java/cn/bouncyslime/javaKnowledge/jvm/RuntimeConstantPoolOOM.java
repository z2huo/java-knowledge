package cn.bouncyslime.javaKnowledge.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池导致的内存溢出异常
 * 这个参数好像在JDK 1.8里面用不了了
 * VM args
 * -XX:PermSize=10M -XX:MaxPermSize=10M
 * @author bouncyslime
 * @date 2021/1/14
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i=0;
        while (true) {
            System.out.println(i);
            list.add(String.valueOf(i++).intern());
        }
    }
}
