package cn.z2huo.knowledge.basic.reflect;

public class ClassEqualTest {
    public static void main(String[] args) {
        String string = new String("asdfasd");
        Integer integer = Integer.valueOf(12);
        String string2 = new String("dddhhhhhhhhhhhhhhhhhhhhhhhhh");
        Integer integer2 = Integer.valueOf(222222);

        System.out.println(string.getClass().equals(integer.getClass()));
        System.out.println(string.getClass().equals(string2.getClass()));
        System.out.println(integer.getClass().equals(integer2.getClass()));
    }
}
