package cn.bouncyslime.javaKnowledge.integer.integerFormat;

public class Test {
    public static void main(String[] args) {
        String num = "0001";
        Integer integer = Integer.valueOf(num);
        System.out.println(integer);
        integer ++;
        String newNum = String.format("%04d", ++integer);
        System.out.println(newNum);
    }
}
