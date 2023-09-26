package cn.z2huo.knowledge.basic.modAndRem;

import java.util.Random;

public class Rem2 {
    public static void main(String[] args){
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int a = random.nextInt(100000);
            int b = random.nextInt(1000);
            int c = random.nextInt(100000000);
            System.out.println(a+" "+b+" "+c);
            if((a+b)%c != (a%c+b%c)%c){
                System.out.println("错误的");
            }
        }
    }
}