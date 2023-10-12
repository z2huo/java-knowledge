package cn.z2huo.knowledge.basic.reflect.entity;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class Circle extends Shape<String>{

    public void draw() {
        System.out.println("this is Circle");
    }

    public void test() {
//        Class<?> clazz = this.getClass().getGenericSuperclass();
        Type type = this.getClass().getGenericSuperclass();
        System.out.println(Arrays.toString(((ParameterizedType) type).getActualTypeArguments()));
        if(type instanceof ParameterizedType){
            System.out.println(Arrays.toString(((ParameterizedType) type).getActualTypeArguments()));
        }
    }

    public static void main(String[] args) {

//        Circle<String> circle = new Circle<>();
        Circle circle = new Circle();
        circle.setDesc("hhh");

        circle.test();

    }

}
