package cn.z2huo.knowledge.basic.interfaces;

import java.util.Random;

public interface Demo {
	public String name = "zyz";		// 接口中定义的域默认是public、static和final的，要进行初始化。
	Random random = new Random(47);
	int age = random.nextInt(10);
	void say();

	public static final String string = "aaa";

	public void method();

	public static void main(String[] args) {
		System.out.println(Demo.name);
		System.out.println(Demo.age);
	}
}
