package cn.z2huo.knowledge.basic.staticmethod;

class Demo {

    public static void method() {

    }

    public static void method2() {

    }

    public static void method3() {
        method2();
        new Demo().method4();
    }

    public void method4() {

    }

}
