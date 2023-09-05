package cn.z2huo.java.knowledge.designPattern.singletonPattern.hunger;

/*
 * 饿汉式，在类加载时就初始化对象，线程安全。
 */

public class Singleton {
	private static final Singleton singleton = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	public void show() {
		System.out.println("hello world!"+this.hashCode());
	}
}
