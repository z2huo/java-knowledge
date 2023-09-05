package cn.z2huo.java.knowledge.designPattern.singletonPattern.lazy;

public class Test {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.show();
	}
}
