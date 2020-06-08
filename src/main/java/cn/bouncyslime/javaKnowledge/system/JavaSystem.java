package cn.bouncyslime.javaKnowledge.system;

import java.io.IOException;

public class JavaSystem {
    public static void main(String[] args) {
        char i = 0;
        try {
            System.out.print("Enter a Char:");
            i = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Yout Enter Char is:" + i);
    }
}