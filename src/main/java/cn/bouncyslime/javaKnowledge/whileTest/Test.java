package cn.bouncyslime.javaKnowledge.whileTest;

/**
 * while循环和do...while循环
 * @author bouncyslime
 * @date 2021/1/16
 */
public class Test {
    public static void main(String[] args) {
        int i = 4;
        while (i < 6){
            System.out.println(i++);
        }
        System.out.println();
        i = 4;
        do {
            System.out.println(i++);
        }while (i < 6);

        System.out.println();
        i = 6;
        while (i < 6){
            System.out.println(i++);
        }
        System.out.println();
        i = 5;
        do {
            System.out.println(i++);
        }while (i < 6);
    }
}
