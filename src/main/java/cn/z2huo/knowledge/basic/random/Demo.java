package cn.z2huo.knowledge.basic.random;

import java.util.Random;

public class Demo {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt(100));
		int a = 1;
		int b = 3 * -a;
		boolean bool = false;
		System.out.println(bool);
	}
}
