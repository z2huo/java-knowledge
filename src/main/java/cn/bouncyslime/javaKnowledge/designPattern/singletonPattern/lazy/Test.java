package cn.bouncyslime.javaKnowledge.designPattern.singletonPattern.lazy;

public class Test {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.show();
	}
}
