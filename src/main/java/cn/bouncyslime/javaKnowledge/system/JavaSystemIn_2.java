package cn.bouncyslime.javaKnowledge.system;

import java.io.*;

public class JavaSystemIn_2 {
    public static void main(String[] args) throws IOException {
        // 存储对最初的System.out的引用，在结尾处将系统输出恢复到该对象上
        PrintStream console = System.out;
        // 设置输入流
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("src/system/JavaSystemIn.java"));
        // 设置输出流
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("javaSystemIn_2.out")));
        // 指定标准输入输出流到对应的流
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        // 从标准输入流读取并输出
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null){
            System.out.println(s);
        }
        out.close();
        System.setOut(console);
    }
}