package cn.z2huo.knowledge.basic.main;

import java.util.Arrays;

public class MainArgsTest {
	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(Arrays.toString(args));
		for (String arg : args) {
			System.out.println(arg);
		}
	}
}
