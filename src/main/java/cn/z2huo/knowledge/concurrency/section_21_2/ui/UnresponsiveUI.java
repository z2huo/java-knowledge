package cn.z2huo.knowledge.concurrency.section_21_2.ui;

import java.io.IOException;

/**
 * <p>没有响应的控制台UI示例
 * <p>程序不会走到read()方法那里
 */
class UnresponsiveUI {

    private volatile double d = 1;

    public UnresponsiveUI() throws IOException {
        while (d > 0) {
            d = d + (Math.PI + Math.E) / d;
        }
        System.in.read();
    }

}
