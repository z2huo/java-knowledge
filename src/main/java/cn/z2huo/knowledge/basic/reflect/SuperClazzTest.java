package cn.z2huo.knowledge.basic.reflect;

import cn.z2huo.knowledge.basic.reflect.entity.Circle;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class SuperClazzTest {

    public static void main(String[] args) {

//        Circle<String> circle = new Circle<>();
        Circle circle = new Circle();
//        circle.setDesc("hhh");

        Class<?> clazz = circle.getClass();
        System.out.println(clazz.getGenericSuperclass());

        Type type = (Type) circle.getClass().getGenericSuperclass();
        if(type instanceof ParameterizedType){
            System.out.println(Arrays.toString(((ParameterizedType) type).getActualTypeArguments()));
        }

    }

}
