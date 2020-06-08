package cn.bouncyslime.javaKnowledge.designPattern.singletonPattern.hunger;


public class Test {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		singleton.show();
		singleton2.show();
	}
}
