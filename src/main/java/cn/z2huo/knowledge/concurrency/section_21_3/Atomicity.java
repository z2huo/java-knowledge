package cn.z2huo.knowledge.concurrency.section_21_3;

class Atomicity {

    int i;

    void method() {
        i++;
    }

    void method2() {
        i+=2;
    }

}
