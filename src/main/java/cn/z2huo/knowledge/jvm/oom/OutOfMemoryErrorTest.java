package cn.z2huo.knowledge.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆溢出
 * VM args
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author bouncyslime
 * @date 2021/1/11
 */
public class OutOfMemoryErrorTest {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
