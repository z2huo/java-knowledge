package cn.z2huo.knowledge.basic.reflect.field;

import java.util.Arrays;

public class FieldExample {

    public static void main(String[] args) {
        Class<Integer> intClass = Integer.class;
        System.out.println(Arrays.toString(intClass.getFields()));
        Class<String> stringClass = String.class;
        System.out.println(Arrays.toString(stringClass.getFields()));
    }

}
