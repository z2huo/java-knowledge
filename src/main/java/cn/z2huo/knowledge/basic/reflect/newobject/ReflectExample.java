package cn.z2huo.knowledge.basic.reflect.newobject;

import java.lang.reflect.InvocationTargetException;

class ReflectExample {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz = Class.forName("cn.z2huo.knowledge.basic.reflect.newobject.MyClass");
        MyClass myClass = (MyClass) clazz.newInstance();
        MyClass myClass2 = (MyClass) clazz.getDeclaredConstructor().newInstance();

    }

}
