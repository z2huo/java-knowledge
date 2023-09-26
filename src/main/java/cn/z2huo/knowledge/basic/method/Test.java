package cn.z2huo.knowledge.basic.method;

public class Test {
	public static void main(String... args) {
		print("hhh", "hahaha", "adfadf");
	}
	
	public static void print(String... strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
}

